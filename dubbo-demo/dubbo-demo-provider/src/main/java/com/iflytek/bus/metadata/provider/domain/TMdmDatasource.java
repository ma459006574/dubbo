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
/*  13:    */ @Table(name="T_MDM_DATASOURCE")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_MDM_DATASOURCE_ID", sequenceName="T_MDM_DATASOURCE_SEQ", allocationSize=1)
/*  16:    */ public class TMdmDatasource
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MDM_DATASOURCE_ID")
/*  20:    */   private Long objectid;
/*  21:    */   @Column(name="PROJECTID", length=22)
/*  22:    */   private Long projectid;
/*  23:    */   @Column(name="DSNAME", length=100)
/*  24:    */   private String dsname;
/*  25:    */   @Column(name="DSIP", length=100)
/*  26:    */   private String dsip;
/*  27:    */   @Column(name="DSTYPE", length=4000)
/*  28:    */   private String dstype;
/*  29:    */   @Column(name="DSVERSION", length=200)
/*  30:    */   private String dsversion;
/*  31:    */   @Column(name="SERVERNAME", length=100)
/*  32:    */   private String servername;
/*  33:    */   @Column(name="DSPORT", length=100)
/*  34:    */   private String dsport;
/*  35:    */   @Column(name="DESCRIPTION", length=100)
/*  36:    */   private String description;
/*  37:    */   @Column(name="USERNAME", length=100)
/*  38:    */   private String username;
/*  39:    */   @Column(name="PASSWORD", length=100)
/*  40:    */   private String password;
/*  41:    */   @Column(name="CREATERTIME", length=14)
/*  42:    */   private String creatertime;
/*  43:    */   @Column(name="UPDATETIME", length=14)
/*  44:    */   private String updatetime;
/*  45:    */   @Column(name="USERID", length=50)
/*  46:    */   private String userid;
/*  47:    */   
/*  48:    */   public Long getObjectid()
/*  49:    */   {
/*  50: 92 */     return this.objectid;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setObjectid(Long objectid)
/*  54:    */   {
/*  55: 99 */     this.objectid = objectid;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Long getProjectid()
/*  59:    */   {
/*  60:106 */     return this.projectid;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setProjectid(Long projectid)
/*  64:    */   {
/*  65:113 */     this.projectid = projectid;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getDsname()
/*  69:    */   {
/*  70:120 */     return this.dsname;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setDsname(String dsname)
/*  74:    */   {
/*  75:127 */     this.dsname = dsname;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getDsip()
/*  79:    */   {
/*  80:134 */     return this.dsip;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setDsip(String dsip)
/*  84:    */   {
/*  85:141 */     this.dsip = dsip;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getDstype()
/*  89:    */   {
/*  90:148 */     return this.dstype;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setDstype(String dstype)
/*  94:    */   {
/*  95:155 */     this.dstype = dstype;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getDsversion()
/*  99:    */   {
/* 100:162 */     return this.dsversion;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setDsversion(String dsversion)
/* 104:    */   {
/* 105:169 */     this.dsversion = dsversion;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getServername()
/* 109:    */   {
/* 110:176 */     return this.servername;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setServername(String servername)
/* 114:    */   {
/* 115:183 */     this.servername = servername;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getDsport()
/* 119:    */   {
/* 120:190 */     return this.dsport;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setDsport(String dsport)
/* 124:    */   {
/* 125:197 */     this.dsport = dsport;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getDescription()
/* 129:    */   {
/* 130:204 */     return this.description;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setDescription(String description)
/* 134:    */   {
/* 135:211 */     this.description = description;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getUsername()
/* 139:    */   {
/* 140:218 */     return this.username;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setUsername(String username)
/* 144:    */   {
/* 145:225 */     this.username = username;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getPassword()
/* 149:    */   {
/* 150:232 */     return this.password;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setPassword(String password)
/* 154:    */   {
/* 155:239 */     this.password = password;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getCreatertime()
/* 159:    */   {
/* 160:246 */     return this.creatertime;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setCreatertime(String creatertime)
/* 164:    */   {
/* 165:253 */     this.creatertime = creatertime;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getUpdatetime()
/* 169:    */   {
/* 170:260 */     return this.updatetime;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setUpdatetime(String updatetime)
/* 174:    */   {
/* 175:267 */     this.updatetime = updatetime;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getUserid()
/* 179:    */   {
/* 180:274 */     return this.userid;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setUserid(String userid)
/* 184:    */   {
/* 185:281 */     this.userid = userid;
/* 186:    */   }
/* 187:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmDatasource
 * JD-Core Version:    0.7.0.1
 */