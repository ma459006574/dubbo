/*   1:    */ package com.iflytek.bus.metadata.provider.service;
/*   2:    */ 
/*   3:    */ import com.alibaba.fastjson.JSONArray;
/*   4:    */ import com.alibaba.fastjson.JSONObject;
/*   5:    */ import com.iflytek.bus.metadata.api.MetadataRegisterService;
/*   6:    */ import com.iflytek.bus.metadata.provider.dao.TMdmColinfoDao;
/*   7:    */ import com.iflytek.bus.metadata.provider.dao.TMdmDatasourceDao;
/*   8:    */ import com.iflytek.bus.metadata.provider.dao.TMdmEdinfoDao;
/*   9:    */ import com.iflytek.bus.metadata.provider.dao.TMdmHistoryDao;
/*  10:    */ import com.iflytek.bus.metadata.provider.dao.TMdmIndexsinfoDao;
/*  11:    */ import com.iflytek.bus.metadata.provider.domain.TMdmColinfo;
/*  12:    */ import com.iflytek.bus.metadata.provider.domain.TMdmDatasource;
/*  13:    */ import com.iflytek.bus.metadata.provider.domain.TMdmEdinfo;
/*  14:    */ import com.iflytek.bus.metadata.provider.domain.TMdmHistory;
/*  15:    */ import com.iflytek.bus.metadata.provider.domain.TMdmIndexsinfo;
/*  16:    */ import com.iflytek.bus.metadata.provider.utils.Format;
/*  17:    */ import java.util.ArrayList;
/*  18:    */ import java.util.List;
/*  19:    */ import org.apache.commons.lang.StringUtils;
/*  20:    */ import org.springframework.beans.factory.annotation.Autowired;
/*  21:    */ import org.springframework.transaction.annotation.Transactional;
/*  22:    */ 
/*  23:    */ public class MetadataRegisterServiceImpl
/*  24:    */   implements MetadataRegisterService
/*  25:    */ {
/*  26:    */   @Autowired
/*  27:    */   private TMdmEdinfoDao edinfoDao;
/*  28:    */   @Autowired
/*  29:    */   private TMdmDatasourceDao datasourceDao;
/*  30:    */   @Autowired
/*  31:    */   private TMdmColinfoDao colinfoDao;
/*  32:    */   @Autowired
/*  33:    */   private TMdmIndexsinfoDao indexsinfoDao;
/*  34:    */   @Autowired
/*  35:    */   private TMdmHistoryDao historyDao;
/*  36:    */   
/*  37:    */   @Transactional
/*  38:    */   public Long registerMetadata(String edattribute, String colInfo, String indexInfo, Long projectId, Long dsId, String sz, String tableName, Long mdid, String userid)
/*  39:    */   {
/*  40: 69 */     if (mdid != null)
/*  41:    */     {
/*  42: 70 */       this.colinfoDao.removeByMdid(mdid);
/*  43: 71 */       this.indexsinfoDao.removeByMdid(mdid);
/*  44:    */     }
/*  45: 73 */     List<TMdmColinfo> colList = JSONArray.parseArray(colInfo, TMdmColinfo.class);
/*  46: 74 */     List<Long> colIdList = new ArrayList();
/*  47: 75 */     for (TMdmColinfo tMdmColinfo : colList)
/*  48:    */     {
/*  49: 76 */       this.colinfoDao.save(tMdmColinfo);
/*  50: 77 */       colIdList.add(tMdmColinfo.getObjectid());
/*  51:    */     }
/*  52: 79 */     String colIds = StringUtils.join(colIdList, ',');
/*  53: 80 */     List<TMdmIndexsinfo> indexList = JSONArray.parseArray(indexInfo, TMdmIndexsinfo.class);
/*  54: 81 */     List<Long> indexIdList = new ArrayList();
/*  55: 82 */     for (TMdmIndexsinfo tMdmIndexsinfo : indexList)
/*  56:    */     {
/*  57: 83 */       this.indexsinfoDao.save(tMdmIndexsinfo);
/*  58: 84 */       indexIdList.add(tMdmIndexsinfo.getObjectid());
/*  59:    */     }
/*  60: 86 */     String indexIds = StringUtils.join(indexIdList, ',');
/*  61: 87 */     String comment = "";
/*  62: 88 */     if (StringUtils.isNotBlank(edattribute))
/*  63:    */     {
/*  64: 89 */       JSONObject jo = JSONObject.parseObject(edattribute);
/*  65: 90 */       comment = jo.getString("COMMENTS");
/*  66: 91 */       jo.put("COLINFOID", colIds);
/*  67: 92 */       jo.put("INDEXID", indexIds);
/*  68: 93 */       edattribute = jo.toJSONString();
/*  69:    */       
/*  70: 95 */       TMdmDatasource dataSource = (TMdmDatasource)this.datasourceDao.findUniqueBy("objectid", dsId);
/*  71:    */       
/*  72: 97 */       edattribute = Format.formatEdattributeJson(edattribute, "dataTable", dataSource);
/*  73:    */     }
/*  74:100 */     TMdmEdinfo tMdmEdinfo = null;
/*  75:101 */     if (mdid != null)
/*  76:    */     {
/*  77:102 */       tMdmEdinfo = (TMdmEdinfo)this.edinfoDao.get(mdid);
/*  78:    */     }
/*  79:    */     else
/*  80:    */     {
/*  81:104 */       tMdmEdinfo = new TMdmEdinfo();
/*  82:105 */       tMdmEdinfo.setEdname(tableName);
/*  83:106 */       tMdmEdinfo.setSz(sz);
/*  84:107 */       tMdmEdinfo.setIsdirectory("0");
/*  85:108 */       tMdmEdinfo.setSstype("dataTable");
/*  86:109 */       tMdmEdinfo.setProjectid(projectId);
/*  87:110 */       tMdmEdinfo.setSourceid(dsId);
/*  88:    */     }
/*  89:112 */     tMdmEdinfo.setEdattribute(edattribute);
/*  90:113 */     tMdmEdinfo.setCreatertime(Format.getDataToString());
/*  91:114 */     tMdmEdinfo.setUpdatetime(Format.getDataToString());
/*  92:115 */     tMdmEdinfo.setUserid(userid);
/*  93:116 */     tMdmEdinfo.setYxx("1");
/*  94:117 */     tMdmEdinfo.setDescriptions(comment);
/*  95:    */     
/*  96:119 */     this.edinfoDao.save(tMdmEdinfo);
/*  97:    */     
/*  98:121 */     Long edid = tMdmEdinfo.getObjectid();
/*  99:122 */     this.colinfoDao.updateColinfo(colIdList.toArray(), edid);
/* 100:123 */     this.indexsinfoDao.updateIndexinfo(indexIdList.toArray(), edid);
/* 101:    */     
/* 102:125 */     saveHistory("创建内容", "dataTable", tableName, edid.toString(), userid);
/* 103:126 */     return edid;
/* 104:    */   }
/* 105:    */   
/* 106:    */   private void saveHistory(String altercontent, String sstype, String edname, String mdid, String userid)
/* 107:    */   {
/* 108:137 */     if ((StringUtils.isBlank(altercontent)) || (StringUtils.isBlank(mdid))) {
/* 109:138 */       return;
/* 110:    */     }
/* 111:140 */     String typename = this.edinfoDao.getZdNameByCode("SJLX", sstype);
/* 112:141 */     altercontent = typename + "-" + edname + "-" + altercontent;
/* 113:    */     
/* 114:143 */     TMdmHistory history = new TMdmHistory();
/* 115:144 */     history.setAltercontent(altercontent);
/* 116:145 */     history.setMdid(mdid);
/* 117:146 */     history.setUpdatetime(Format.getDataToString());
/* 118:147 */     history.setUserid(userid);
/* 119:148 */     this.historyDao.save(history);
/* 120:    */   }
/* 121:    */   
/* 122:    */   @Transactional
/* 123:    */   public void unregisterMetadata(Long mdid)
/* 124:    */   {
/* 125:157 */     if (mdid != null)
/* 126:    */     {
/* 127:158 */       this.colinfoDao.removeByMdid(mdid);
/* 128:159 */       this.indexsinfoDao.removeByMdid(mdid);
/* 129:160 */       this.edinfoDao.removeById(mdid);
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   public Boolean standardizeDict(Long mdid)
/* 134:    */   {
/* 135:168 */     if (mdid != null)
/* 136:    */     {
/* 137:169 */       TMdmEdinfo tMdmEdinfo = (TMdmEdinfo)this.edinfoDao.findUniqueBy("objectid", mdid);
/* 138:170 */       if (tMdmEdinfo != null)
/* 139:    */       {
/* 140:171 */         String edattribute = tMdmEdinfo.getEdattribute();
/* 141:172 */         if (StringUtils.isNotBlank(edattribute))
/* 142:    */         {
/* 143:173 */           JSONObject jo = JSONObject.parseObject(edattribute);
/* 144:175 */           if (StringUtils.equals(jo.getString("dataTable_lylx"), "4"))
/* 145:    */           {
/* 146:176 */             if (!StringUtils.equals("Y", jo.getString("dataTable_bzhxx")))
/* 147:    */             {
/* 148:177 */               jo.put("dataTable_bzhxx", "Y");
/* 149:178 */               jo.put("dataTable_bzhxx_txt", "是");
/* 150:    */             }
/* 151:180 */             tMdmEdinfo.setEdattribute(jo.toJSONString());
/* 152:181 */             this.edinfoDao.saveOrUpdate(tMdmEdinfo);
/* 153:182 */             return Boolean.valueOf(true);
/* 154:    */           }
/* 155:    */         }
/* 156:    */       }
/* 157:    */     }
/* 158:187 */     return Boolean.valueOf(false);
/* 159:    */   }
/* 160:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.service.MetadataRegisterServiceImpl
 * JD-Core Version:    0.7.0.1
 */