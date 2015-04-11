/*   1:    */ package com.iflytek.bus.zyml.provider.domain;
/*   2:    */ 
/*   3:    */ import java.util.List;
/*   4:    */ import javax.persistence.Column;
/*   5:    */ import javax.persistence.GeneratedValue;
/*   6:    */ import javax.persistence.GenerationType;
/*   7:    */ import javax.persistence.Id;
/*   8:    */ import javax.persistence.SequenceGenerator;
/*   9:    */ import javax.persistence.Table;
/*  10:    */ import javax.persistence.Transient;
/*  11:    */ import org.hibernate.annotations.AccessType;
/*  12:    */ 
/*  13:    */ @org.hibernate.annotations.Entity(selectBeforeUpdate=true, dynamicInsert=true, dynamicUpdate=true)
/*  14:    */ @javax.persistence.Entity
/*  15:    */ @Table(name="T_ZYGL_ZYLBFL")
/*  16:    */ @AccessType("field")
/*  17:    */ @SequenceGenerator(name="T_ZYGL_ZYLBFL_ID", sequenceName="SEQ_T_ZYGL_ZYLBFL", allocationSize=1)
/*  18:    */ public class TZyglZylbfl
/*  19:    */ {
/*  20:    */   @Id
/*  21:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ZYGL_ZYLBFL_ID")
/*  22:    */   private Long objectid;
/*  23:    */   @Column(name="ZYLBMC", length=128)
/*  24:    */   private String zylbmc;
/*  25:    */   @Column(name="ZYLBBM", length=64)
/*  26:    */   private String zylbbm;
/*  27:    */   @Column(name="SJZYLBBM", length=64)
/*  28:    */   private String sjzylbbm;
/*  29:    */   @Column(name="PX", length=22)
/*  30:    */   private Long px;
/*  31:    */   @Column(name="PYJP", length=128)
/*  32:    */   private String pyjp;
/*  33:    */   @Transient
/*  34:    */   private List<TZyglZylbfl> childList;
/*  35:    */   
/*  36:    */   public Long getObjectid()
/*  37:    */   {
/*  38: 68 */     return this.objectid;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setObjectid(Long objectid)
/*  42:    */   {
/*  43: 77 */     this.objectid = objectid;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getZylbmc()
/*  47:    */   {
/*  48: 84 */     return this.zylbmc;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setZylbmc(String zylbmc)
/*  52:    */   {
/*  53: 93 */     this.zylbmc = zylbmc;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getZylbbm()
/*  57:    */   {
/*  58:100 */     return this.zylbbm;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setZylbbm(String zylbbm)
/*  62:    */   {
/*  63:109 */     this.zylbbm = zylbbm;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getSjzylbbm()
/*  67:    */   {
/*  68:116 */     return this.sjzylbbm;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setSjzylbbm(String sjzylbbm)
/*  72:    */   {
/*  73:125 */     this.sjzylbbm = sjzylbbm;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Long getPx()
/*  77:    */   {
/*  78:132 */     return this.px;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setPx(Long px)
/*  82:    */   {
/*  83:141 */     this.px = px;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getPyjp()
/*  87:    */   {
/*  88:148 */     return this.pyjp;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setPyjp(String pyjp)
/*  92:    */   {
/*  93:155 */     this.pyjp = pyjp;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public List<TZyglZylbfl> getChildList()
/*  97:    */   {
/*  98:159 */     return this.childList;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setChildList(List<TZyglZylbfl> childList)
/* 102:    */   {
/* 103:163 */     this.childList = childList;
/* 104:    */   }
/* 105:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglZylbfl
 * JD-Core Version:    0.7.0.1
 */