/*   1:    */ package com.iflytek.bus.metadata.provider.service;
/*   2:    */ 
/*   3:    */ import com.alibaba.fastjson.JSONArray;
/*   4:    */ import com.alibaba.fastjson.JSONObject;
/*   5:    */ import com.iflytek.bus.metadata.api.MetadataQueryService;
/*   6:    */ import com.iflytek.bus.metadata.provider.dao.TMdmColinfoDao;
/*   7:    */ import com.iflytek.bus.metadata.provider.dao.TMdmDatasourceDao;
/*   8:    */ import com.iflytek.bus.metadata.provider.dao.TMdmEdinfoDao;
/*   9:    */ import com.iflytek.bus.metadata.provider.dao.TMdmIndexsinfoDao;
/*  10:    */ import com.iflytek.bus.metadata.provider.dao.TMdmProjectDao;
/*  11:    */ import com.iflytek.bus.metadata.provider.domain.TMdmColinfo;
/*  12:    */ import com.iflytek.bus.metadata.provider.domain.TMdmDatasource;
/*  13:    */ import com.iflytek.bus.metadata.provider.domain.TMdmEdinfo;
/*  14:    */ import com.iflytek.bus.metadata.provider.domain.TMdmIndexsinfo;
/*  15:    */ import com.iflytek.bus.metadata.provider.domain.TMdmProject;
/*  16:    */ import com.iflytek.bus.metadata.provider.utils.SqlTemplateService;
/*  17:    */ import com.iflytek.bus.metadata.provider.vo.ZymlInfo;
/*  18:    */ import com.iflytek.bus.zyml.provider.domain.TZyglGabzyml;
/*  19:    */ import java.util.List;
/*  20:    */ import org.hibernate.Query;
/*  21:    */ import org.hibernate.SQLQuery;
/*  22:    */ import org.hibernate.transform.Transformers;
/*  23:    */ import org.springframework.beans.factory.annotation.Autowired;
/*  24:    */ 
/*  25:    */ public class MetadataQueryServiceImpl
/*  26:    */   implements MetadataQueryService
/*  27:    */ {
/*  28:    */   @Autowired
/*  29:    */   private TMdmEdinfoDao tMdmEdinfoDao;
/*  30:    */   @Autowired
/*  31:    */   private TMdmColinfoDao tMdmColinfoDao;
/*  32:    */   @Autowired
/*  33:    */   private TMdmDatasourceDao tMdmDatasourceDao;
/*  34:    */   @Autowired
/*  35:    */   private TMdmIndexsinfoDao tMdmIndexsinfoDao;
/*  36:    */   @Autowired
/*  37:    */   private SqlTemplateService sqlTemplateService;
/*  38:    */   @Autowired
/*  39:    */   private TMdmProjectDao tMdmProjectDao;
/*  40:    */   
/*  41:    */   public String getTablesByZylbbm(String zylbbm)
/*  42:    */   {
/*  43: 68 */     String sql = this.sqlTemplateService.getValue("TABLE_DATASOURCE_INFO");
/*  44: 69 */     List<?> resultList = this.tMdmEdinfoDao.createSqlQuery(sql, new Object[] { zylbbm }).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
/*  45:    */     
/*  46: 71 */     return JSONArray.toJSONString(resultList);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getTabsIncluGabByZylbbm(String zylbbm)
/*  50:    */   {
/*  51: 83 */     String sql = this.sqlTemplateService.getValue("TABLE_DATASOURCE_INFO");
/*  52: 84 */     List<ZymlInfo> resultList = this.tMdmEdinfoDao.createSqlQuery(sql, new Object[] { zylbbm }).setResultTransformer(Transformers.aliasToBean(ZymlInfo.class)).list();
/*  53:    */     
/*  54:    */ 
/*  55: 87 */     List<TZyglGabzyml> galList = this.tMdmEdinfoDao.find(" from TZyglGabzyml where zylbbm=?", new Object[] { zylbbm });
/*  56: 88 */     for (TZyglGabzyml galzyml : galList) {
/*  57: 90 */       resultList.add(new ZymlInfo(galzyml.getId(), galzyml.getServiceId(), galzyml.getZymc(), "GABZYML"));
/*  58:    */     }
/*  59: 92 */     return JSONArray.toJSONString(resultList);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getTableColumnsByEdid(Long edid)
/*  63:    */   {
/*  64:101 */     List<TMdmColinfo> resultList = this.tMdmColinfoDao.findBy("mdid", edid, "objectid", true);
/*  65:102 */     return JSONArray.toJSONString(resultList);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getYwxtList()
/*  69:    */   {
/*  70:110 */     String sql = this.sqlTemplateService.getValue("SSJZXT_INFO");
/*  71:111 */     List<?> resultList = this.tMdmEdinfoDao.createSqlQuery(sql, new Object[] { "1" }).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
/*  72:    */     
/*  73:113 */     return JSONArray.toJSONString(resultList);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getDataSourceList()
/*  77:    */   {
/*  78:120 */     List<TMdmDatasource> dataSourceList = this.tMdmDatasourceDao.getAll();
/*  79:121 */     return JSONArray.toJSONString(dataSourceList);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getTableListByDataSourceId(Long dataSourceId)
/*  83:    */   {
/*  84:129 */     String hql = "from TMdmEdinfo where yxx='1' and sstype = ? and sourceid = ?";
/*  85:130 */     List<TMdmEdinfo> tableList = this.tMdmEdinfoDao.find(hql, new Object[] { "dataTable", dataSourceId });
/*  86:131 */     return JSONArray.toJSONString(tableList);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getTableIndexsByEdid(Long edid)
/*  90:    */   {
/*  91:139 */     List<TMdmIndexsinfo> resultList = this.tMdmIndexsinfoDao.findBy("mdid", edid);
/*  92:140 */     return JSONArray.toJSONString(resultList);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getTableById(Long edid)
/*  96:    */   {
/*  97:148 */     TMdmEdinfo tMdmEdinfo = (TMdmEdinfo)this.tMdmEdinfoDao.findUniqueBy("objectid", edid);
/*  98:149 */     return JSONObject.toJSONString(tMdmEdinfo);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getDataSourceById(Long dataSourceId)
/* 102:    */   {
/* 103:157 */     TMdmDatasource dataSource = (TMdmDatasource)this.tMdmDatasourceDao.findUniqueBy("objectid", dataSourceId);
/* 104:158 */     return JSONObject.toJSONString(dataSource);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProjectList()
/* 108:    */   {
/* 109:165 */     List<TMdmProject> projectList = this.tMdmProjectDao.getAll("objectid", true);
/* 110:166 */     return JSONArray.toJSONString(projectList);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getDictTableList(Long projectId, String tableName, String description)
/* 114:    */   {
/* 115:176 */     List<TMdmEdinfo> tableList = this.tMdmEdinfoDao.getDictTableList(projectId, tableName, description);
/* 116:177 */     return JSONArray.toJSONString(tableList);
/* 117:    */   }
/* 118:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.service.MetadataQueryServiceImpl
 * JD-Core Version:    0.7.0.1
 */