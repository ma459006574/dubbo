/*   1:    */ package com.iflytek.bus.metadata.provider.domain;
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
/*  13:    */ @Table(name="T_MDM_COLINFO")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_MDM_COLINFO_ID", sequenceName="T_MDM_COLINFO_SEQ", allocationSize=1)
/*  16:    */ public class TMdmColinfo
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MDM_COLINFO_ID")
/*  20:    */   private Long objectid;
/*  21:    */   @Column(name="COLNAME", length=100)
/*  22:    */   private String colname;
/*  23:    */   @Column(name="MDID", length=22)
/*  24:    */   private Long mdid;
/*  25:    */   @Column(name="COLDESCRIPTION", length=4000)
/*  26:    */   private String coldescription;
/*  27:    */   @Column(name="COLTYPE", length=200)
/*  28:    */   private String coltype;
/*  29:    */   @Column(name="COLLENGTH", length=100)
/*  30:    */   private String collength;
/*  31:    */   @Column(name="COLISEMPTY", length=100)
/*  32:    */   private String colisempty;
/*  33:    */   @Column(name="DEFAULTVALUE", length=100)
/*  34:    */   private String defaultvalue;
/*  35:    */   @Column(name="STORE", length=100)
/*  36:    */   private String store;
/*  37:    */   @Column(name="DICTPOR", length=100)
/*  38:    */   private String dictpor;
/*  39:    */   @Column(name="INDEXPOR", length=100)
/*  40:    */   private String indexpor;
/*  41:    */   @Column(name="SOURCEID", length=100)
/*  42:    */   private String sourceid;
/*  43:    */   @Column(name="DICTNAME", length=100)
/*  44:    */   private String dictname;
/*  45:    */   @Column(name="SHARED_PROPERTY", length=8)
/*  46:    */   private String sharedproperty;
/*  47:    */   
/*  48:    */   public Long getMdid()
/*  49:    */   {
/*  50: 93 */     return this.mdid;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setMdid(Long mdid)
/*  54:    */   {
/*  55: 99 */     this.mdid = mdid;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Long getObjectid()
/*  59:    */   {
/*  60:105 */     return this.objectid;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setObjectid(Long objectid)
/*  64:    */   {
/*  65:112 */     this.objectid = objectid;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getColname()
/*  69:    */   {
/*  70:118 */     return this.colname;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setColname(String colname)
/*  74:    */   {
/*  75:125 */     this.colname = colname;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getColdescription()
/*  79:    */   {
/*  80:131 */     return this.coldescription;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setColdescription(String coldescription)
/*  84:    */   {
/*  85:138 */     this.coldescription = coldescription;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getColtype()
/*  89:    */   {
/*  90:144 */     return this.coltype;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setColtype(String coltype)
/*  94:    */   {
/*  95:151 */     this.coltype = coltype;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getCollength()
/*  99:    */   {
/* 100:157 */     return this.collength;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setCollength(String collength)
/* 104:    */   {
/* 105:164 */     this.collength = collength;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getColisempty()
/* 109:    */   {
/* 110:170 */     return this.colisempty;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setColisempty(String colisempty)
/* 114:    */   {
/* 115:177 */     this.colisempty = colisempty;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getDefaultvalue()
/* 119:    */   {
/* 120:183 */     return this.defaultvalue;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setDefaultvalue(String defaultvalue)
/* 124:    */   {
/* 125:190 */     this.defaultvalue = defaultvalue;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getStore()
/* 129:    */   {
/* 130:196 */     return this.store;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setStore(String store)
/* 134:    */   {
/* 135:203 */     this.store = store;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getDictpor()
/* 139:    */   {
/* 140:206 */     return this.dictpor;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setDictpor(String dictpor)
/* 144:    */   {
/* 145:209 */     this.dictpor = dictpor;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getIndexpor()
/* 149:    */   {
/* 150:212 */     return this.indexpor;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setIndexpor(String indexpor)
/* 154:    */   {
/* 155:215 */     this.indexpor = indexpor;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getSourceid()
/* 159:    */   {
/* 160:218 */     return this.sourceid;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setSourceid(String sourceid)
/* 164:    */   {
/* 165:221 */     this.sourceid = sourceid;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getDictname()
/* 169:    */   {
/* 170:224 */     return this.dictname;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setDictname(String dictname)
/* 174:    */   {
/* 175:227 */     this.dictname = dictname;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getSharedproperty()
/* 179:    */   {
/* 180:230 */     return this.sharedproperty;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setSharedproperty(String sharedproperty)
/* 184:    */   {
/* 185:233 */     this.sharedproperty = sharedproperty;
/* 186:    */   }
/* 187:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmColinfo
 * JD-Core Version:    0.7.0.1
 */