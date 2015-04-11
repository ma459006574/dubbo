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
/*  13:    */ @Table(name="T_ZYGL_GABZYML")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_ZYGL_GABZYML_ID", sequenceName="SEQ_T_ZYGL_GABZYML", allocationSize=1)
/*  16:    */ public class TZyglGabzyml
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ZYGL_GABZYML_ID")
/*  20:    */   private Long id;
/*  21:    */   @Column(name="ZYMC", length=256)
/*  22:    */   private String zymc;
/*  23:    */   @Column(name="ZYLBBM", length=64)
/*  24:    */   private String zylbbm;
/*  25:    */   @Column(name="SERVICE_ID", length=64)
/*  26:    */   private String serviceId;
/*  27:    */   @Column(name="IMAGEID", length=22)
/*  28:    */   private Long imageid;
/*  29:    */   
/*  30:    */   public Long getId()
/*  31:    */   {
/*  32: 57 */     return this.id;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setId(Long id)
/*  36:    */   {
/*  37: 66 */     this.id = id;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getZymc()
/*  41:    */   {
/*  42: 73 */     return this.zymc;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setZymc(String zymc)
/*  46:    */   {
/*  47: 82 */     this.zymc = zymc;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getZylbbm()
/*  51:    */   {
/*  52: 89 */     return this.zylbbm;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setZylbbm(String zylbbm)
/*  56:    */   {
/*  57: 98 */     this.zylbbm = zylbbm;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getServiceId()
/*  61:    */   {
/*  62:105 */     return this.serviceId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setServiceId(String serviceId)
/*  66:    */   {
/*  67:114 */     this.serviceId = serviceId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public Long getImageid()
/*  71:    */   {
/*  72:121 */     return this.imageid;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setImageid(Long imageid)
/*  76:    */   {
/*  77:130 */     this.imageid = imageid;
/*  78:    */   }
/*  79:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglGabzyml
 * JD-Core Version:    0.7.0.1
 */