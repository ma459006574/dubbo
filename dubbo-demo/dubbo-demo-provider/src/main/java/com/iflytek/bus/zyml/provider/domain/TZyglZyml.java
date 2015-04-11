/*   1:    */ package com.iflytek.bus.zyml.provider.domain;
/*   2:    */ 
/*   3:    */ import javax.persistence.Column;
/*   4:    */ import javax.persistence.GeneratedValue;
/*   5:    */ import javax.persistence.GenerationType;
/*   6:    */ import javax.persistence.Id;
/*   7:    */ import javax.persistence.SequenceGenerator;
/*   8:    */ import javax.persistence.Table;
/*   9:    */ import org.hibernate.annotations.AccessType;
/*  10:    */ 
/*  11:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*  12:    */ @javax.persistence.Entity
/*  13:    */ @Table(name="T_ZYGL_ZYML")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_ZYGL_ZYML_ID", sequenceName="SEQ_T_ZYGL_ZYML", allocationSize=1)
/*  16:    */ public class TZyglZyml
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ZYGL_ZYML_ID")
/*  20:    */   private Long objectid;
/*  21:    */   @Column(name="SZ", length=64)
/*  22:    */   private String sz;
/*  23:    */   @Column(name="BYWM", length=128)
/*  24:    */   private String bywm;
/*  25:    */   @Column(name="ZYLX", length=10)
/*  26:    */   private String zylx;
/*  27:    */   @Column(name="ZYMC", length=256)
/*  28:    */   private String zymc;
/*  29:    */   @Column(name="ZYLBBM", length=64)
/*  30:    */   private String zylbbm;
/*  31:    */   @Column(name="SSJZ", length=64)
/*  32:    */   private String ssjz;
/*  33:    */   @Column(name="YWXT", length=64)
/*  34:    */   private String ywxt;
/*  35:    */   @Column(name="SFZDZY", length=1)
/*  36:    */   private String sfzdzy;
/*  37:    */   @Column(name="ZYLBMS", length=512)
/*  38:    */   private String zylbms;
/*  39:    */   @Column(name="PX", length=22)
/*  40:    */   private Long px;
/*  41:    */   @Column(name="ZHXGSJ", length=14)
/*  42:    */   private String zhxgsj;
/*  43:    */   @Column(name="CXBZ", length=128)
/*  44:    */   private String cxbz;
/*  45:    */   @Column(name="MDID")
/*  46:    */   private Long mdid;
/*  47:    */   @Column(name="IMAGEID")
/*  48:    */   private Long imageId;
/*  49:    */   
/*  50:    */   public Long getObjectid()
/*  51:    */   {
/*  52:106 */     return this.objectid;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setObjectid(Long objectid)
/*  56:    */   {
/*  57:114 */     this.objectid = objectid;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getSz()
/*  61:    */   {
/*  62:121 */     return this.sz;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setSz(String sz)
/*  66:    */   {
/*  67:128 */     this.sz = sz;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getBywm()
/*  71:    */   {
/*  72:134 */     return this.bywm;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setBywm(String bywm)
/*  76:    */   {
/*  77:143 */     this.bywm = bywm;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getZylx()
/*  81:    */   {
/*  82:150 */     return this.zylx;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setZylx(String zylx)
/*  86:    */   {
/*  87:159 */     this.zylx = zylx;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getZymc()
/*  91:    */   {
/*  92:166 */     return this.zymc;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setZymc(String zymc)
/*  96:    */   {
/*  97:175 */     this.zymc = zymc;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getZylbbm()
/* 101:    */   {
/* 102:182 */     return this.zylbbm;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setZylbbm(String zylbbm)
/* 106:    */   {
/* 107:191 */     this.zylbbm = zylbbm;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getSsjz()
/* 111:    */   {
/* 112:198 */     return this.ssjz;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setSsjz(String ssjz)
/* 116:    */   {
/* 117:207 */     this.ssjz = ssjz;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getYwxt()
/* 121:    */   {
/* 122:214 */     return this.ywxt;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setYwxt(String ywxt)
/* 126:    */   {
/* 127:223 */     this.ywxt = ywxt;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getSfzdzy()
/* 131:    */   {
/* 132:230 */     return this.sfzdzy;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setSfzdzy(String sfzdzy)
/* 136:    */   {
/* 137:239 */     this.sfzdzy = sfzdzy;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getZylbms()
/* 141:    */   {
/* 142:246 */     return this.zylbms;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setZylbms(String zylbms)
/* 146:    */   {
/* 147:253 */     this.zylbms = zylbms;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Long getPx()
/* 151:    */   {
/* 152:260 */     return this.px;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setPx(Long px)
/* 156:    */   {
/* 157:269 */     this.px = px;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getZhxgsj()
/* 161:    */   {
/* 162:276 */     return this.zhxgsj;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setZhxgsj(String zhxgsj)
/* 166:    */   {
/* 167:285 */     this.zhxgsj = zhxgsj;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getCxbz()
/* 171:    */   {
/* 172:292 */     return this.cxbz;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setCxbz(String cxbz)
/* 176:    */   {
/* 177:299 */     this.cxbz = cxbz;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public Long getMdid()
/* 181:    */   {
/* 182:303 */     return this.mdid;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setMdid(Long mdid)
/* 186:    */   {
/* 187:307 */     this.mdid = mdid;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public Long getImageId()
/* 191:    */   {
/* 192:311 */     return this.imageId;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setImageId(Long imageId)
/* 196:    */   {
/* 197:315 */     this.imageId = imageId;
/* 198:    */   }
/* 199:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglZyml
 * JD-Core Version:    0.7.0.1
 */