/*   1:    */ package com.iflytek.bus.metadata.provider.domain;
/*   2:    */ 
/*   3:    */ import javax.persistence.Column;
/*   4:    */ import javax.persistence.GeneratedValue;
/*   5:    */ import javax.persistence.GenerationType;
/*   6:    */ import javax.persistence.Id;
/*   7:    */ import javax.persistence.Lob;
/*   8:    */ import javax.persistence.SequenceGenerator;
/*   9:    */ import javax.persistence.Table;
/*  10:    */ import org.hibernate.annotations.AccessType;
/*  11:    */ 
/*  12:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*  13:    */ @javax.persistence.Entity
/*  14:    */ @Table(name="T_MDM_EDINFO")
/*  15:    */ @AccessType("field")
/*  16:    */ @SequenceGenerator(name="T_MDM_EDINFO_ID", sequenceName="T_MDM_EDINFO_SEQ", allocationSize=1)
/*  17:    */ public class TMdmEdinfo
/*  18:    */ {
/*  19:    */   @Id
/*  20:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MDM_EDINFO_ID")
/*  21:    */   private Long objectid;
/*  22:    */   @Column(name="EDNAME", length=100)
/*  23:    */   private String edname;
/*  24:    */   @Column(name="PROJECTID", length=22)
/*  25:    */   private Long projectid;
/*  26:    */   @Column(name="DESCRIPTIONS", length=200)
/*  27:    */   private String descriptions;
/*  28:    */   @Column(name="SSTYPE", length=20)
/*  29:    */   private String sstype;
/*  30:    */   @Lob
/*  31:    */   private String edattribute;
/*  32:    */   @Column(name="XYID", length=22)
/*  33:    */   private Long xyid;
/*  34:    */   @Column(name="GLID", length=22)
/*  35:    */   private Long glid;
/*  36:    */   @Column(name="YXX", length=3)
/*  37:    */   private String yxx;
/*  38:    */   @Column(name="CREATERTIME", length=14)
/*  39:    */   private String creatertime;
/*  40:    */   @Column(name="UPDATETIME", length=14)
/*  41:    */   private String updatetime;
/*  42:    */   @Column(name="USERID", length=50)
/*  43:    */   private String userid;
/*  44:    */   @Column(name="SOURCEID", length=50)
/*  45:    */   private Long sourceid;
/*  46:    */   @Column(name="ISDIRECTORY", length=50)
/*  47:    */   private String isdirectory;
/*  48:    */   @Column(name="QUERYFLAG", length=100)
/*  49:    */   private String queryflag;
/*  50:    */   @Column(name="DATACOUNT", length=100)
/*  51:    */   private String datacount;
/*  52:    */   @Column(name="YSID", length=100)
/*  53:    */   private String ysid;
/*  54:    */   @Column(name="SZ", length=200)
/*  55:    */   private String sz;
/*  56:    */   
/*  57:    */   public String getYsid()
/*  58:    */   {
/*  59:118 */     return this.ysid;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setYsid(String ysid)
/*  63:    */   {
/*  64:124 */     this.ysid = ysid;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public Long getSourceid()
/*  68:    */   {
/*  69:127 */     return this.sourceid;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSourceid(Long sourceid)
/*  73:    */   {
/*  74:130 */     this.sourceid = sourceid;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getIsdirectory()
/*  78:    */   {
/*  79:133 */     return this.isdirectory;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setIsdirectory(String isdirectory)
/*  83:    */   {
/*  84:136 */     this.isdirectory = isdirectory;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getQueryflag()
/*  88:    */   {
/*  89:139 */     return this.queryflag;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setQueryflag(String queryflag)
/*  93:    */   {
/*  94:142 */     this.queryflag = queryflag;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getDatacount()
/*  98:    */   {
/*  99:145 */     return this.datacount;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setDatacount(String datacount)
/* 103:    */   {
/* 104:148 */     this.datacount = datacount;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public Long getObjectid()
/* 108:    */   {
/* 109:154 */     return this.objectid;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setObjectid(Long objectid)
/* 113:    */   {
/* 114:161 */     this.objectid = objectid;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getEdname()
/* 118:    */   {
/* 119:168 */     return this.edname;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setEdname(String edname)
/* 123:    */   {
/* 124:175 */     this.edname = edname;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public Long getProjectid()
/* 128:    */   {
/* 129:182 */     return this.projectid;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setProjectid(Long projectid)
/* 133:    */   {
/* 134:189 */     this.projectid = projectid;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getDescriptions()
/* 138:    */   {
/* 139:196 */     return this.descriptions;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setDescriptions(String descriptions)
/* 143:    */   {
/* 144:203 */     this.descriptions = descriptions;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getSstype()
/* 148:    */   {
/* 149:210 */     return this.sstype;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setSstype(String sstype)
/* 153:    */   {
/* 154:217 */     this.sstype = sstype;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getEdattribute()
/* 158:    */   {
/* 159:224 */     return this.edattribute;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setEdattribute(String edattribute)
/* 163:    */   {
/* 164:231 */     this.edattribute = edattribute;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public Long getXyid()
/* 168:    */   {
/* 169:238 */     return this.xyid;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setXyid(Long xyid)
/* 173:    */   {
/* 174:245 */     this.xyid = xyid;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Long getGlid()
/* 178:    */   {
/* 179:252 */     return this.glid;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setGlid(Long glid)
/* 183:    */   {
/* 184:259 */     this.glid = glid;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getYxx()
/* 188:    */   {
/* 189:266 */     return this.yxx;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setYxx(String yxx)
/* 193:    */   {
/* 194:273 */     this.yxx = yxx;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getCreatertime()
/* 198:    */   {
/* 199:280 */     return this.creatertime;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setCreatertime(String creatertime)
/* 203:    */   {
/* 204:287 */     this.creatertime = creatertime;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getUpdatetime()
/* 208:    */   {
/* 209:294 */     return this.updatetime;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setUpdatetime(String updatetime)
/* 213:    */   {
/* 214:301 */     this.updatetime = updatetime;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getUserid()
/* 218:    */   {
/* 219:308 */     return this.userid;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setUserid(String userid)
/* 223:    */   {
/* 224:315 */     this.userid = userid;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getSz()
/* 228:    */   {
/* 229:321 */     return this.sz;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setSz(String sz)
/* 233:    */   {
/* 234:327 */     this.sz = sz;
/* 235:    */   }
/* 236:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmEdinfo
 * JD-Core Version:    0.7.0.1
 */