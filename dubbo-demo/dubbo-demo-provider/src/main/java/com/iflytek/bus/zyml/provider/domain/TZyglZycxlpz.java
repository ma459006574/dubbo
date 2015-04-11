/*   1:    */ package com.iflytek.bus.zyml.provider.domain;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.zyml.provider.annotation.MaxLength;
/*   4:    */ import com.iflytek.bus.zyml.provider.annotation.NotNull;
/*   5:    */ import java.util.UUID;
/*   6:    */ import javax.persistence.Column;
/*   7:    */ import javax.persistence.Id;
/*   8:    */ import javax.persistence.Table;
/*   9:    */ import javax.persistence.Transient;
/*  10:    */ import org.hibernate.annotations.AccessType;
/*  11:    */ 
/*  12:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*  13:    */ @javax.persistence.Entity
/*  14:    */ @Table(name="T_ZYGL_ZYCXLPZ")
/*  15:    */ @AccessType("field")
/*  16:    */ public class TZyglZycxlpz
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @Column(name="OBJECTID")
/*  20:    */   private String objectid;
/*  21:    */   @Column(name="ZYMC", length=128)
/*  22:    */   private String zymc;
/*  23:    */   @NotNull
/*  24:    */   @MaxLength(128)
/*  25:    */   @Column(name="CXBZ", length=128)
/*  26:    */   private String cxbz;
/*  27:    */   @NotNull
/*  28:    */   @MaxLength(128)
/*  29:    */   @Column(name="ZDM", length=128)
/*  30:    */   private String zdm;
/*  31:    */   @NotNull
/*  32:    */   @MaxLength(128)
/*  33:    */   @Column(name="ZDLX", length=128)
/*  34:    */   private String zdlx;
/*  35:    */   @NotNull
/*  36:    */   @MaxLength(256)
/*  37:    */   @Column(name="ZDSM", length=256)
/*  38:    */   private String zdsm;
/*  39:    */   @Column(name="KJLX", length=22)
/*  40:    */   private Long kjlx;
/*  41:    */   @MaxLength(256)
/*  42:    */   @Column(name="KJGZ", length=256)
/*  43:    */   private String kjgz;
/*  44:    */   @NotNull
/*  45:    */   @Column(name="CXXS", length=22)
/*  46:    */   private Long cxxs;
/*  47:    */   @Column(name="CXBT", length=22)
/*  48:    */   private Long cxbt;
/*  49:    */   @Column(name="CXPX", length=22)
/*  50:    */   private Long cxpx;
/*  51:    */   @NotNull
/*  52:    */   @Column(name="LBXS", length=22)
/*  53:    */   private Long lbxs;
/*  54:    */   @Column(name="LBPX", length=22)
/*  55:    */   private Long lbpx;
/*  56:    */   @Column(name="LK", length=22)
/*  57:    */   private Long lk;
/*  58:    */   @NotNull
/*  59:    */   @Column(name="XXXS", length=22)
/*  60:    */   private Long xxxs;
/*  61:    */   @Column(name="XXPX", length=22)
/*  62:    */   private Long xxpx;
/*  63:    */   @MaxLength(1)
/*  64:    */   @Column(name="DALX", length=1)
/*  65:    */   private String dalx;
/*  66:    */   @MaxLength(1)
/*  67:    */   @Column(name="SYLX", length=1)
/*  68:    */   private String sylx;
/*  69:    */   @Column(name="ISHMD")
/*  70:    */   private Integer ishmd;
/*  71:    */   @Column(name="CJSJ")
/*  72:    */   private String cjsj;
/*  73:    */   @Column(name="ZHGXSJ")
/*  74:    */   private String zhgxsj;
/*  75:    */   @Column(name="SJLY")
/*  76:    */   private String sjly;
/*  77:    */   @NotNull
/*  78:    */   @MaxLength(4000)
/*  79:    */   @Column(name="SJB")
/*  80:    */   private String sjb;
/*  81:    */   @Transient
/*  82:    */   private String oldCxbz;
/*  83:    */   
/*  84:    */   public TZyglZycxlpz()
/*  85:    */   {
/*  86: 24 */     this.objectid = UUID.randomUUID().toString();
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getObjectid()
/*  90:    */   {
/*  91:165 */     return this.objectid;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setObjectid(String objectid)
/*  95:    */   {
/*  96:173 */     this.objectid = objectid;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getZymc()
/* 100:    */   {
/* 101:180 */     return this.zymc;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setZymc(String zymc)
/* 105:    */   {
/* 106:189 */     this.zymc = zymc;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getCxbz()
/* 110:    */   {
/* 111:196 */     return this.cxbz;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setCxbz(String cxbz)
/* 115:    */   {
/* 116:205 */     this.cxbz = cxbz;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getZdm()
/* 120:    */   {
/* 121:212 */     return this.zdm;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setZdm(String zdm)
/* 125:    */   {
/* 126:221 */     this.zdm = zdm;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getZdsm()
/* 130:    */   {
/* 131:228 */     return this.zdsm;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setZdsm(String zdsm)
/* 135:    */   {
/* 136:237 */     this.zdsm = zdsm;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Long getKjlx()
/* 140:    */   {
/* 141:244 */     return this.kjlx;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setKjlx(Long kjlx)
/* 145:    */   {
/* 146:253 */     this.kjlx = kjlx;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getKjgz()
/* 150:    */   {
/* 151:260 */     return this.kjgz;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setKjgz(String kjgz)
/* 155:    */   {
/* 156:269 */     this.kjgz = kjgz;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public Long getCxxs()
/* 160:    */   {
/* 161:276 */     return this.cxxs;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setCxxs(Long csxs)
/* 165:    */   {
/* 166:285 */     this.cxxs = csxs;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public Long getCxbt()
/* 170:    */   {
/* 171:292 */     return this.cxbt;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setCxbt(Long csbt)
/* 175:    */   {
/* 176:301 */     this.cxbt = csbt;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public Long getCxpx()
/* 180:    */   {
/* 181:308 */     return this.cxpx;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setCxpx(Long cxpx)
/* 185:    */   {
/* 186:317 */     this.cxpx = cxpx;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public Long getLbxs()
/* 190:    */   {
/* 191:324 */     return this.lbxs;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setLbxs(Long lbxs)
/* 195:    */   {
/* 196:333 */     this.lbxs = lbxs;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public Long getLbpx()
/* 200:    */   {
/* 201:340 */     return this.lbpx;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setLbpx(Long lbpx)
/* 205:    */   {
/* 206:349 */     this.lbpx = lbpx;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public Long getLk()
/* 210:    */   {
/* 211:356 */     return this.lk;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setLk(Long lk)
/* 215:    */   {
/* 216:365 */     this.lk = lk;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public Long getXxxs()
/* 220:    */   {
/* 221:372 */     return this.xxxs;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setXxxs(Long xxss)
/* 225:    */   {
/* 226:381 */     this.xxxs = xxss;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public Long getXxpx()
/* 230:    */   {
/* 231:388 */     return this.xxpx;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void setXxpx(Long xxpx)
/* 235:    */   {
/* 236:397 */     this.xxpx = xxpx;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public String getDalx()
/* 240:    */   {
/* 241:404 */     return this.dalx;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public void setDalx(String dalx)
/* 245:    */   {
/* 246:413 */     this.dalx = dalx;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public String getSylx()
/* 250:    */   {
/* 251:420 */     return this.sylx;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public void setSylx(String sylx)
/* 255:    */   {
/* 256:429 */     this.sylx = sylx;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String getZdlx()
/* 260:    */   {
/* 261:435 */     return this.zdlx;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public void setZdlx(String zdlx)
/* 265:    */   {
/* 266:442 */     this.zdlx = zdlx;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public Integer getIshmd()
/* 270:    */   {
/* 271:449 */     return this.ishmd;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public void setIshmd(Integer ishmd)
/* 275:    */   {
/* 276:456 */     this.ishmd = ishmd;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public String getOldCxbz()
/* 280:    */   {
/* 281:466 */     return this.oldCxbz;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void setOldCxbz(String oldCxbz)
/* 285:    */   {
/* 286:473 */     this.oldCxbz = oldCxbz;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public String getCjsj()
/* 290:    */   {
/* 291:480 */     return this.cjsj;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void setCjsj(String cjsj)
/* 295:    */   {
/* 296:487 */     this.cjsj = cjsj;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public String getZhgxsj()
/* 300:    */   {
/* 301:494 */     return this.zhgxsj;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void setZhgxsj(String zhgxsj)
/* 305:    */   {
/* 306:501 */     this.zhgxsj = zhgxsj;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public String getSjly()
/* 310:    */   {
/* 311:508 */     return this.sjly;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void setSjly(String sjly)
/* 315:    */   {
/* 316:515 */     this.sjly = sjly;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public String getSjb()
/* 320:    */   {
/* 321:519 */     return this.sjb;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public void setSjb(String sjb)
/* 325:    */   {
/* 326:523 */     this.sjb = sjb;
/* 327:    */   }
/* 328:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglZycxlpz
 * JD-Core Version:    0.7.0.1
 */