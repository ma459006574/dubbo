/*   1:    */ package com.iflytek.bus.metadata.provider.domain;
/*   2:    */ 
/*   3:    */ import javax.persistence.Column;
/*   4:    */ import javax.persistence.Id;
/*   5:    */ import javax.persistence.Table;
/*   6:    */ import org.hibernate.annotations.AccessType;
/*   7:    */ 
/*   8:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*   9:    */ @javax.persistence.Entity
/*  10:    */ @Table(name="T_MDM_PROJECT")
/*  11:    */ @AccessType("field")
/*  12:    */ public class TMdmProject
/*  13:    */ {
/*  14:    */   @Id
/*  15:    */   private Long objectid;
/*  16:    */   @Column(name="PROJECTNAME", length=200)
/*  17:    */   private String projectname;
/*  18:    */   @Column(name="DESCRIPTIONS", length=200)
/*  19:    */   private String descriptions;
/*  20:    */   @Column(name="CREATERTIME", length=14)
/*  21:    */   private String creatertime;
/*  22:    */   @Column(name="UPDATETIME", length=14)
/*  23:    */   private String updatetime;
/*  24:    */   @Column(name="USERID", length=50)
/*  25:    */   private String userid;
/*  26:    */   @Column(name="YXX", length=3)
/*  27:    */   private String yxx;
/*  28:    */   
/*  29:    */   public String getDescriptions()
/*  30:    */   {
/*  31: 51 */     return this.descriptions;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setDescriptions(String descriptions)
/*  35:    */   {
/*  36: 54 */     this.descriptions = descriptions;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Long getObjectid()
/*  40:    */   {
/*  41: 60 */     return this.objectid;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setObjectid(Long objectid)
/*  45:    */   {
/*  46: 67 */     this.objectid = objectid;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getProjectname()
/*  50:    */   {
/*  51: 73 */     return this.projectname;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setProjectname(String projectname)
/*  55:    */   {
/*  56: 80 */     this.projectname = projectname;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCreatertime()
/*  60:    */   {
/*  61: 86 */     return this.creatertime;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCreatertime(String creatertime)
/*  65:    */   {
/*  66: 93 */     this.creatertime = creatertime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getUpdatetime()
/*  70:    */   {
/*  71:100 */     return this.updatetime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setUpdatetime(String updatetime)
/*  75:    */   {
/*  76:107 */     this.updatetime = updatetime;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getUserid()
/*  80:    */   {
/*  81:113 */     return this.userid;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setUserid(String userid)
/*  85:    */   {
/*  86:120 */     this.userid = userid;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getYxx()
/*  90:    */   {
/*  91:126 */     return this.yxx;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setYxx(String yxx)
/*  95:    */   {
/*  96:133 */     this.yxx = yxx;
/*  97:    */   }
/*  98:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmProject
 * JD-Core Version:    0.7.0.1
 */