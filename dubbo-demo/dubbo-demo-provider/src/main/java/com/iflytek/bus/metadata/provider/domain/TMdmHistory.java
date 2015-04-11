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
/*  13:    */ @Table(name="T_MDM_HISTORY")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_MDM_HISTORY_ID", sequenceName="T_MDM_HISTORY_SEQ", allocationSize=1)
/*  16:    */ public class TMdmHistory
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MDM_HISTORY_ID")
/*  20:    */   private Long objectid;
/*  21:    */   @Column(name="ALTERCONTENT", length=4000)
/*  22:    */   private String altercontent;
/*  23:    */   @Column(name="UPDATETIME", length=14)
/*  24:    */   private String updatetime;
/*  25:    */   @Column(name="USERID", length=50)
/*  26:    */   private String userid;
/*  27:    */   @Column(name="MDID", length=22)
/*  28:    */   private String mdid;
/*  29:    */   
/*  30:    */   public Long getObjectid()
/*  31:    */   {
/*  32: 48 */     return this.objectid;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setObjectid(Long objectid)
/*  36:    */   {
/*  37: 56 */     this.objectid = objectid;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAltercontent()
/*  41:    */   {
/*  42: 63 */     return this.altercontent;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAltercontent(String altercontent)
/*  46:    */   {
/*  47: 71 */     this.altercontent = altercontent;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getUpdatetime()
/*  51:    */   {
/*  52: 75 */     return this.updatetime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setUpdatetime(String updatetime)
/*  56:    */   {
/*  57: 79 */     this.updatetime = updatetime;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getUserid()
/*  61:    */   {
/*  62: 83 */     return this.userid;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setUserid(String userid)
/*  66:    */   {
/*  67: 87 */     this.userid = userid;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getMdid()
/*  71:    */   {
/*  72: 94 */     return this.mdid;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setMdid(String mdid)
/*  76:    */   {
/*  77:102 */     this.mdid = mdid;
/*  78:    */   }
/*  79:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmHistory
 * JD-Core Version:    0.7.0.1
 */