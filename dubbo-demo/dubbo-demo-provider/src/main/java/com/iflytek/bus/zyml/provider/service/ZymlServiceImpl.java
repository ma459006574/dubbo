/*   1:    */ package com.iflytek.bus.zyml.provider.service;
/*   2:    */ 
/*   3:    */ import com.alibaba.fastjson.JSONArray;
/*   4:    */ import com.alibaba.fastjson.JSONObject;
/*   5:    */ import com.iflytek.bus.metadata.provider.dao.TMdmEdinfoDao;
/*   6:    */ import com.iflytek.bus.metadata.provider.domain.TMdmEdinfo;
/*   7:    */ import com.iflytek.bus.zyml.api.ZymlService;
/*   8:    */ import com.iflytek.bus.zyml.provider.dao.TZyglZybcxpzDao;
/*   9:    */ import com.iflytek.bus.zyml.provider.dao.TZyglZycxlpzDao;
/*  10:    */ import com.iflytek.bus.zyml.provider.dao.TZyglZylbflDao;
/*  11:    */ import com.iflytek.bus.zyml.provider.dao.TZyglZymlDao;
/*  12:    */ import com.iflytek.bus.zyml.provider.domain.TZyglGabzysjx;
/*  13:    */ import com.iflytek.bus.zyml.provider.domain.TZyglZybcxpz;
/*  14:    */ import com.iflytek.bus.zyml.provider.domain.TZyglZycxlpz;
/*  15:    */ import com.iflytek.bus.zyml.provider.domain.TZyglZylbfl;
/*  16:    */ import com.iflytek.bus.zyml.provider.domain.TZyglZyml;
/*  17:    */ import com.iflytek.bus.zyml.provider.util.MaxLengthChecker;
/*  18:    */ import com.iflytek.bus.zyml.provider.util.NotNullChecker;
/*  19:    */ import java.util.List;
/*  20:    */ import org.apache.commons.lang.StringUtils;
/*  21:    */ import org.apache.log4j.Logger;
/*  22:    */ import org.dom4j.Document;
/*  23:    */ import org.dom4j.DocumentHelper;
/*  24:    */ import org.dom4j.Element;
/*  25:    */ import org.springframework.beans.factory.annotation.Autowired;
/*  26:    */ import org.springframework.transaction.annotation.Transactional;
/*  27:    */ 
/*  28:    */ public class ZymlServiceImpl
/*  29:    */   implements ZymlService
/*  30:    */ {
/*  31: 54 */   private Logger logger = Logger.getLogger(getClass());
/*  32:    */   @Autowired
/*  33:    */   private TZyglZycxlpzDao zyglZycxlpzDao;
/*  34:    */   @Autowired
/*  35:    */   private TZyglZybcxpzDao zyglZybcxpzDao;
/*  36:    */   @Autowired
/*  37:    */   private TZyglZylbflDao zyglZylbflDao;
/*  38:    */   @Autowired
/*  39:    */   private TZyglZymlDao zyglZymlDao;
/*  40:    */   @Autowired
/*  41:    */   private TMdmEdinfoDao tMdmEdinfoDao;
/*  42:    */   
/*  43:    */   public String getZymlXmlString(Long objectid)
/*  44:    */   {
/*  45: 90 */     TZyglZyml zyml = this.zyglZymlDao.getTZyglZymlById(objectid);
/*  46: 91 */     List<TZyglZycxlpz> zycxlpzs = this.zyglZycxlpzDao.getTZyglZycxlpzsByCxbz(zyml.getCxbz());
/*  47: 92 */     Document document = DocumentHelper.createDocument();
/*  48: 93 */     Element root = document.addElement("zyml");
/*  49: 94 */     root.addAttribute("objectid", zyml.getObjectid() + "").addAttribute("zymc", zyml.getZymc()).addAttribute("bywm", zyml.getBywm()).addAttribute("zylbbm", zyml.getZylbbm());
/*  50: 98 */     for (TZyglZycxlpz zycxlpz : zycxlpzs)
/*  51:    */     {
/*  52: 99 */       Element zycxlpzElement = root.addElement("zycxlpz");
/*  53:100 */       zycxlpzElement.addAttribute("objectid", zycxlpz.getObjectid()).addAttribute("zdm", zycxlpz.getZdm()).addAttribute("zdsm", zycxlpz.getZdsm()).addAttribute("kjlx", zycxlpz.getKjlx() + "").addAttribute("kjgz", zycxlpz.getKjgz()).addAttribute("cxbt", zycxlpz.getCxbt() + "").addAttribute("dalx", zycxlpz.getDalx()).addAttribute("cxxs", zycxlpz.getCxxs() + "");
/*  54:    */     }
/*  55:109 */     return document.asXML();
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getZymlAccordionXmlString(String mcOrJp)
/*  59:    */   {
/*  60:120 */     List<TZyglZylbfl> zylbfls = this.zyglZylbflDao.getTZyglZylbflsByZymlMcOrjp(mcOrJp);
/*  61:121 */     Document document = DocumentHelper.createDocument();
/*  62:122 */     Element root = document.addElement("zymlAccordion");
/*  63:123 */     for (TZyglZylbfl zylbfl : zylbfls)
/*  64:    */     {
/*  65:124 */       Element zylbflElement = root.addElement("zylbfl");
/*  66:125 */       zylbflElement.addAttribute("objectid", zylbfl.getObjectid() + "").addAttribute("zylbmc", zylbfl.getZylbmc()).addAttribute("zylbbm", zylbfl.getZylbbm());
/*  67:    */       
/*  68:127 */       List<TZyglZyml> zymls = this.zyglZymlDao.getTZyglZymlsByZylbMcOrjp(zylbfl.getZylbbm(), mcOrJp);
/*  69:128 */       for (TZyglZyml zyml : zymls)
/*  70:    */       {
/*  71:129 */         Element zymlElement = zylbflElement.addElement("zyml");
/*  72:130 */         zymlElement.addAttribute("objectid", zyml.getObjectid() + "").addAttribute("zymc", zyml.getZymc()).addAttribute("zylbbm", zyml.getZylbbm());
/*  73:    */       }
/*  74:    */     }
/*  75:    */     Element zylbflElement;
/*  76:135 */     return document.asXML();
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getZymlAssociateXmlString(String text)
/*  80:    */   {
/*  81:146 */     List<TZyglZyml> zymls = this.zyglZymlDao.getZymlZymcs(text);
/*  82:147 */     Document document = DocumentHelper.createDocument();
/*  83:148 */     Element root = document.addElement("zymls");
/*  84:149 */     for (TZyglZyml zyml : zymls)
/*  85:    */     {
/*  86:150 */       Element zymlElement = root.addElement("zyml");
/*  87:151 */       zymlElement.addAttribute("objectid", zyml.getObjectid() + "").addAttribute("zymc", zyml.getZymc()).addAttribute("zylbbm", zyml.getZylbbm());
/*  88:    */     }
/*  89:155 */     return document.asXML();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getZylbflListJson()
/*  93:    */   {
/*  94:163 */     return JSONArray.toJSONString(this.zyglZylbflDao.getZylbflList());
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getZybcxpzByZcyy(Long edid, String zcyy)
/*  98:    */   {
/*  99:174 */     if (edid != null)
/* 100:    */     {
/* 101:175 */       List<TZyglZybcxpz> zybcxpzList = this.zyglZybcxpzDao.getZybcxpzListByZcyy(edid, zcyy);
/* 102:176 */       if ((zybcxpzList != null) && (zybcxpzList.size() > 0))
/* 103:    */       {
/* 104:177 */         for (TZyglZybcxpz bcxpz : zybcxpzList)
/* 105:    */         {
/* 106:178 */           List<TZyglZycxlpz> zycxlpzList = this.zyglZycxlpzDao.findBy("cxbz", bcxpz.getCxbz());
/* 107:179 */           bcxpz.setZycxlpzList(zycxlpzList);
/* 108:    */         }
/* 109:181 */         return JSONArray.toJSONString(zybcxpzList);
/* 110:    */       }
/* 111:    */     }
/* 112:184 */     return null;
/* 113:    */   }
/* 114:    */   
/* 115:    */   @Transactional
/* 116:    */   public Boolean registerZyml(Long edid, String zylbbm)
/* 117:    */   {
/* 118:194 */     TMdmEdinfo edinfo = (TMdmEdinfo)this.tMdmEdinfoDao.findUniqueBy("objectid", edid);
/* 119:195 */     if (edinfo != null)
/* 120:    */     {
/* 121:197 */       if (StringUtils.equals("1", edinfo.getIsdirectory())) {
/* 122:198 */         return Boolean.valueOf(true);
/* 123:    */       }
/* 124:201 */       TZyglZyml zyml = new TZyglZyml();
/* 125:202 */       zyml.setSz(edinfo.getSz());
/* 126:203 */       zyml.setBywm(edinfo.getEdname());
/* 127:204 */       zyml.setZymc(edinfo.getDescriptions());
/* 128:205 */       if ("dataView".equals(edinfo.getSstype())) {
/* 129:206 */         zyml.setZylx("1");
/* 130:    */       } else {
/* 131:208 */         zyml.setZylx("0");
/* 132:    */       }
/* 133:210 */       zyml.setMdid(edinfo.getObjectid());
/* 134:211 */       zyml.setPx(edinfo.getObjectid());
/* 135:212 */       zyml.setYwxt("0");
/* 136:213 */       zyml.setSsjz("0");
/* 137:    */       
/* 138:215 */       zyml.setImageId(this.zyglZymlDao.getDefaultZymlImageId());
/* 139:216 */       if (StringUtils.isNotBlank(zylbbm)) {
/* 140:217 */         zyml.setZylbbm(zylbbm);
/* 141:    */       }
/* 142:219 */       this.tMdmEdinfoDao.save(zyml);
/* 143:    */       
/* 144:221 */       this.tMdmEdinfoDao.setMetadataZymlFlag(edid);
/* 145:222 */       return Boolean.valueOf(true);
/* 146:    */     }
/* 147:225 */     return Boolean.valueOf(false);
/* 148:    */   }
/* 149:    */   
/* 150:    */   @Transactional
/* 151:    */   public Boolean registerZycxpz(String pzxxJsonStr)
/* 152:    */   {
/* 153:    */     TZyglZybcxpz zybcxpz;
/* 154:    */     try
/* 155:    */     {
/* 156:236 */       zybcxpz = (TZyglZybcxpz)JSONObject.parseObject(pzxxJsonStr, TZyglZybcxpz.class);
/* 157:237 */       if (zybcxpz == null)
/* 158:    */       {
/* 159:238 */         this.logger.warn("查询配置为空！");
/* 160:239 */         return Boolean.valueOf(false);
/* 161:    */       }
/* 162:    */     }
/* 163:    */     catch (Exception e)
/* 164:    */     {
/* 165:242 */       this.logger.warn("JSON字符串无法解析！");
/* 166:243 */       return Boolean.valueOf(false);
/* 167:    */     }
/* 168:245 */     if (!this.zyglZybcxpzDao.uniqueValidate(zybcxpz.getCxbz(), zybcxpz.getSjb(), zybcxpz.getZcyy()).booleanValue())
/* 169:    */     {
/* 170:246 */       this.logger.warn("查询标识/支撑应用已存在！");
/* 171:247 */       return Boolean.valueOf(false);
/* 172:    */     }
/* 173:249 */     List<TZyglZycxlpz> zycxlpzList = zybcxpz.getZycxlpzList();
/* 174:250 */     if ((zycxlpzList != null) && (zycxlpzList.size() > 0))
/* 175:    */     {
/* 176:251 */       for (TZyglZycxlpz zycxlpz : zycxlpzList)
/* 177:    */       {
/* 178:252 */         if (!NotNullChecker.checkNotNull(zycxlpz).booleanValue()) {
/* 179:253 */           return Boolean.valueOf(false);
/* 180:    */         }
/* 181:254 */         if (!MaxLengthChecker.checkMaxLength(zycxlpz).booleanValue()) {
/* 182:255 */           return Boolean.valueOf(false);
/* 183:    */         }
/* 184:    */       }
/* 185:    */     }
/* 186:    */     else
/* 187:    */     {
/* 188:259 */       this.logger.warn("资源查询列配置为空！");
/* 189:260 */       return Boolean.valueOf(false);
/* 190:    */     }
/* 191:262 */     if (!NotNullChecker.checkNotNull(zybcxpz).booleanValue())
/* 192:    */     {
/* 193:263 */       this.logger.warn("存在必填项为空值！");
/* 194:264 */       return Boolean.valueOf(false);
/* 195:    */     }
/* 196:265 */     if (!MaxLengthChecker.checkMaxLength(zybcxpz).booleanValue())
/* 197:    */     {
/* 198:266 */       this.logger.warn("存在字段值超长！");
/* 199:267 */       return Boolean.valueOf(false);
/* 200:    */     }
/* 201:270 */     for (TZyglZycxlpz zycxlpz : zycxlpzList)
/* 202:    */     {
/* 203:271 */       zycxlpz.setCxbz(zybcxpz.getCxbz());
/* 204:272 */       this.zyglZycxlpzDao.save(zycxlpz);
/* 205:    */     }
/* 206:274 */     this.zyglZybcxpzDao.save(zybcxpz);
/* 207:275 */     return Boolean.valueOf(true);
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getAllZymlListJson()
/* 211:    */   {
/* 212:284 */     return JSONArray.toJSONString(this.zyglZymlDao.getAll());
/* 213:    */   }
/* 214:    */   
/* 215:    */   public String getGabSjxByZyid(Long zyId)
/* 216:    */   {
/* 217:295 */     List<TZyglGabzysjx> resultList = this.zyglZymlDao.getGabSjxByZyid(zyId);
/* 218:296 */     return JSONArray.toJSONString(resultList);
/* 219:    */   }
/* 220:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.service.ZymlServiceImpl
 * JD-Core Version:    0.7.0.1
 */