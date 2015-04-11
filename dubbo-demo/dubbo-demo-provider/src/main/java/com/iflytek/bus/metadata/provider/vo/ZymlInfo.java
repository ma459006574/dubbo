/*   1:    */ package com.iflytek.bus.metadata.provider.vo;
/*   2:    */ 
/*   3:    */ public class ZymlInfo
/*   4:    */ {
/*   5:    */   private Long OBJECTID;
/*   6:    */   private String EDNAME;
/*   7:    */   private String DESCRIPTIONS;
/*   8:    */   private String SSTYPE;
/*   9:    */   private String SZ;
/*  10:    */   private String DSIP;
/*  11:    */   private String SERVERNAME;
/*  12:    */   private String DSPORT;
/*  13:    */   private String USERNAME;
/*  14:    */   private String PASSWORD;
/*  15:    */   private String BYWM;
/*  16:    */   private String YWXT;
/*  17:    */   private String YWXTMC;
/*  18: 39 */   private String zymlType = "COMMONZYML";
/*  19:    */   
/*  20:    */   public Long getOBJECTID()
/*  21:    */   {
/*  22: 42 */     return this.OBJECTID;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void setOBJECTID(Long oBJECTID)
/*  26:    */   {
/*  27: 46 */     this.OBJECTID = oBJECTID;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getEDNAME()
/*  31:    */   {
/*  32: 50 */     return this.EDNAME;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setEDNAME(String eDNAME)
/*  36:    */   {
/*  37: 54 */     this.EDNAME = eDNAME;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getDESCRIPTIONS()
/*  41:    */   {
/*  42: 58 */     return this.DESCRIPTIONS;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setDESCRIPTIONS(String dESCRIPTIONS)
/*  46:    */   {
/*  47: 62 */     this.DESCRIPTIONS = dESCRIPTIONS;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getSSTYPE()
/*  51:    */   {
/*  52: 66 */     return this.SSTYPE;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setSSTYPE(String sSTYPE)
/*  56:    */   {
/*  57: 70 */     this.SSTYPE = sSTYPE;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getSZ()
/*  61:    */   {
/*  62: 74 */     return this.SZ;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setSZ(String sZ)
/*  66:    */   {
/*  67: 78 */     this.SZ = sZ;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getDSIP()
/*  71:    */   {
/*  72: 82 */     return this.DSIP;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setDSIP(String dSIP)
/*  76:    */   {
/*  77: 86 */     this.DSIP = dSIP;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getSERVERNAME()
/*  81:    */   {
/*  82: 90 */     return this.SERVERNAME;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setSERVERNAME(String sERVERNAME)
/*  86:    */   {
/*  87: 94 */     this.SERVERNAME = sERVERNAME;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getDSPORT()
/*  91:    */   {
/*  92: 98 */     return this.DSPORT;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setDSPORT(String dSPORT)
/*  96:    */   {
/*  97:102 */     this.DSPORT = dSPORT;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getUSERNAME()
/* 101:    */   {
/* 102:106 */     return this.USERNAME;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setUSERNAME(String uSERNAME)
/* 106:    */   {
/* 107:110 */     this.USERNAME = uSERNAME;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getPASSWORD()
/* 111:    */   {
/* 112:114 */     return this.PASSWORD;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setPASSWORD(String pASSWORD)
/* 116:    */   {
/* 117:118 */     this.PASSWORD = pASSWORD;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getBYWM()
/* 121:    */   {
/* 122:122 */     return this.BYWM;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setBYWM(String bYWM)
/* 126:    */   {
/* 127:126 */     this.BYWM = bYWM;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getYWXT()
/* 131:    */   {
/* 132:130 */     return this.YWXT;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setYWXT(String yWXT)
/* 136:    */   {
/* 137:134 */     this.YWXT = yWXT;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getYWXTMC()
/* 141:    */   {
/* 142:138 */     return this.YWXTMC;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setYWXTMC(String yWXTMC)
/* 146:    */   {
/* 147:142 */     this.YWXTMC = yWXTMC;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getZymlType()
/* 151:    */   {
/* 152:146 */     return this.zymlType;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setZymlType(String zymlType)
/* 156:    */   {
/* 157:150 */     this.zymlType = zymlType;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public ZymlInfo(Long oBJECTID, String eDNAME, String dESCRIPTIONS, String zymlType)
/* 161:    */   {
/* 162:161 */     this.zymlType = zymlType;
/* 163:162 */     this.OBJECTID = oBJECTID;
/* 164:163 */     this.EDNAME = eDNAME;
/* 165:164 */     this.DESCRIPTIONS = dESCRIPTIONS;
/* 166:    */   }
/* 167:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.vo.ZymlInfo
 * JD-Core Version:    0.7.0.1
 */