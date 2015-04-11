/*   1:    */ package com.iflytek.bus.zyml.provider.domain;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.zyml.provider.annotation.MaxLength;
/*   4:    */ import com.iflytek.bus.zyml.provider.annotation.NotNull;
/*   5:    */ import java.util.List;
/*   6:    */ import javax.persistence.Column;
/*   7:    */ import javax.persistence.GeneratedValue;
/*   8:    */ import javax.persistence.GenerationType;
/*   9:    */ import javax.persistence.Id;
/*  10:    */ import javax.persistence.SequenceGenerator;
/*  11:    */ import javax.persistence.Table;
/*  12:    */ import javax.persistence.Transient;
/*  13:    */ import org.hibernate.annotations.AccessType;
/*  14:    */ 
/*  15:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*  16:    */ @javax.persistence.Entity
/*  17:    */ @Table(name="T_ZYGL_ZYBCXPZ")
/*  18:    */ @AccessType("field")
/*  19:    */ @SequenceGenerator(name="T_ZYGL_ZYBCXPZ_ID", sequenceName="SEQ_T_ZYGL_ZYBCXPZ", allocationSize=1)
/*  20:    */ public class TZyglZybcxpz
/*  21:    */ {
/*  22:    */   @Id
/*  23:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ZYGL_ZYBCXPZ_ID")
/*  24:    */   private Long objectid;
/*  25:    */   @Column(name="ZYMLID", length=22)
/*  26:    */   private Long zymlid;
/*  27:    */   @NotNull
/*  28:    */   @MaxLength(128)
/*  29:    */   @Column(name="ZYMC", length=128)
/*  30:    */   private String zymc;
/*  31:    */   @NotNull
/*  32:    */   @MaxLength(128)
/*  33:    */   @Column(name="SJB", length=128)
/*  34:    */   private String sjb;
/*  35:    */   @NotNull
/*  36:    */   @MaxLength(256)
/*  37:    */   @Column(name="ZWSM", length=256)
/*  38:    */   private String zwsm;
/*  39:    */   @NotNull
/*  40:    */   @MaxLength(128)
/*  41:    */   @Column(name="CXBZ", length=128)
/*  42:    */   private String cxbz;
/*  43:    */   @NotNull
/*  44:    */   @MaxLength(256)
/*  45:    */   @Column(name="ZJZD", length=256)
/*  46:    */   private String zjzd;
/*  47:    */   @Column(name="PXZD", length=256)
/*  48:    */   private String pxzd;
/*  49:    */   @MaxLength(2000)
/*  50:    */   @Column(name="MS", length=2000)
/*  51:    */   private String ms;
/*  52:    */   @Column(name="CXTJ", length=2000)
/*  53:    */   private String cxtj;
/*  54:    */   @Column(name="BZXX", length=2000)
/*  55:    */   private String bzxx;
/*  56:    */   @Column(name="SJLY", length=50)
/*  57:    */   private String sjly;
/*  58:    */   @Column(name="CJSJ", length=14)
/*  59:    */   private String cjsj;
/*  60:    */   @Column(name="ZHGXSJ", length=14)
/*  61:    */   private String zhgxsj;
/*  62:    */   @Column(name="GLBZJZD", length=4000)
/*  63:    */   private String glbzjzd;
/*  64:    */   @Column(name="GLBGLTJ", length=4000)
/*  65:    */   private String glbgltj;
/*  66:    */   @Column(name="GLGX", length=4000)
/*  67:    */   private String glgx;
/*  68:    */   @NotNull
/*  69:    */   @MaxLength(4000)
/*  70:    */   @Column(name="ZCYY", length=4000)
/*  71:    */   private String zcyy;
/*  72:    */   @NotNull
/*  73:    */   @Column(name="SJYID", length=22)
/*  74:    */   private Long sjyid;
/*  75:    */   @Column(name="GLSJB", length=4000)
/*  76:    */   private String glsjb;
/*  77:    */   @NotNull
/*  78:    */   @MaxLength(4000)
/*  79:    */   @Column(name="SZ", length=4000)
/*  80:    */   private String sz;
/*  81:    */   @NotNull
/*  82:    */   @Transient
/*  83:    */   private List<TZyglZycxlpz> zycxlpzList;
/*  84:    */   
/*  85:    */   public Long getObjectid()
/*  86:    */   {
/*  87:155 */     return this.objectid;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setObjectid(Long objectid)
/*  91:    */   {
/*  92:162 */     this.objectid = objectid;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Long getZymlid()
/*  96:    */   {
/*  97:168 */     return this.zymlid;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setZymlid(Long zymlid)
/* 101:    */   {
/* 102:175 */     this.zymlid = zymlid;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getZymc()
/* 106:    */   {
/* 107:181 */     return this.zymc;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setZymc(String zymc)
/* 111:    */   {
/* 112:189 */     this.zymc = zymc;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getSjb()
/* 116:    */   {
/* 117:196 */     return this.sjb;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setSjb(String sjb)
/* 121:    */   {
/* 122:205 */     this.sjb = sjb;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getZwsm()
/* 126:    */   {
/* 127:212 */     return this.zwsm;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setZwsm(String zwsm)
/* 131:    */   {
/* 132:221 */     this.zwsm = zwsm;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getCxbz()
/* 136:    */   {
/* 137:228 */     return this.cxbz;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setCxbz(String cxbz)
/* 141:    */   {
/* 142:237 */     this.cxbz = cxbz;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getZjzd()
/* 146:    */   {
/* 147:244 */     return this.zjzd;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setZjzd(String zjzd)
/* 151:    */   {
/* 152:253 */     this.zjzd = zjzd;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getPxzd()
/* 156:    */   {
/* 157:260 */     return this.pxzd;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setPxzd(String pxzd)
/* 161:    */   {
/* 162:269 */     this.pxzd = pxzd;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getMs()
/* 166:    */   {
/* 167:276 */     return this.ms;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setMs(String ms)
/* 171:    */   {
/* 172:285 */     this.ms = ms;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getCxtj()
/* 176:    */   {
/* 177:292 */     return this.cxtj;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setCxtj(String cxtj)
/* 181:    */   {
/* 182:301 */     this.cxtj = cxtj;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getBzxx()
/* 186:    */   {
/* 187:308 */     return this.bzxx;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setBzxx(String bzxx)
/* 191:    */   {
/* 192:317 */     this.bzxx = bzxx;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getSjly()
/* 196:    */   {
/* 197:324 */     return this.sjly;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setSjly(String sjly)
/* 201:    */   {
/* 202:333 */     this.sjly = sjly;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public String getCjsj()
/* 206:    */   {
/* 207:340 */     return this.cjsj;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void setCjsj(String cjsj)
/* 211:    */   {
/* 212:349 */     this.cjsj = cjsj;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public String getZhgxsj()
/* 216:    */   {
/* 217:356 */     return this.zhgxsj;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public void setZhgxsj(String zhgxsj)
/* 221:    */   {
/* 222:365 */     this.zhgxsj = zhgxsj;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public String getGlbzjzd()
/* 226:    */   {
/* 227:372 */     return this.glbzjzd;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void setGlbzjzd(String glbzjzd)
/* 231:    */   {
/* 232:381 */     this.glbzjzd = glbzjzd;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String getGlbgltj()
/* 236:    */   {
/* 237:388 */     return this.glbgltj;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public void setGlbgltj(String glbgltj)
/* 241:    */   {
/* 242:397 */     this.glbgltj = glbgltj;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public String getGlgx()
/* 246:    */   {
/* 247:404 */     return this.glgx;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void setGlgx(String glgx)
/* 251:    */   {
/* 252:413 */     this.glgx = glgx;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public String getZcyy()
/* 256:    */   {
/* 257:420 */     return this.zcyy;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public void setZcyy(String zcyy)
/* 261:    */   {
/* 262:429 */     this.zcyy = zcyy;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public Long getSjyid()
/* 266:    */   {
/* 267:436 */     return this.sjyid;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public void setSjyid(Long sjyid)
/* 271:    */   {
/* 272:445 */     this.sjyid = sjyid;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public String getGlsjb()
/* 276:    */   {
/* 277:452 */     return this.glsjb;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void setGlsjb(String glsjb)
/* 281:    */   {
/* 282:461 */     this.glsjb = glsjb;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public String getSz()
/* 286:    */   {
/* 287:468 */     return this.sz;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public void setSz(String sz)
/* 291:    */   {
/* 292:477 */     this.sz = sz;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public List<TZyglZycxlpz> getZycxlpzList()
/* 296:    */   {
/* 297:483 */     return this.zycxlpzList;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public void setZycxlpzList(List<TZyglZycxlpz> zycxlpzList)
/* 301:    */   {
/* 302:490 */     this.zycxlpzList = zycxlpzList;
/* 303:    */   }
/* 304:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglZybcxpz
 * JD-Core Version:    0.7.0.1
 */