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
/*  13:    */ @Table(name="T_ZYGL_GABZYSJX")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_ZYGL_GABZYSJX_ID", sequenceName="SEQ_T_ZYGL_GABZYSJX", allocationSize=1)
/*  16:    */ public class TZyglGabzysjx
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ZYGL_GABZYSJX_ID")
/*  20:    */   private Long id;
/*  21:    */   @Column(name="ZY_ID", length=22)
/*  22:    */   private Long zyId;
/*  23:    */   @Column(name="COLDESCRIPTION", length=4000)
/*  24:    */   private String coldescription;
/*  25:    */   @Column(name="COLNAME", length=100)
/*  26:    */   private String colname;
/*  27:    */   @Column(name="COLTYPE", length=200)
/*  28:    */   private String coltype;
/*  29:    */   @Column(name="COLLENGTH", length=100)
/*  30:    */   private String collength;
/*  31:    */   @Column(name="DICTPOR", length=100)
/*  32:    */   private String dictpor;
/*  33:    */   @Column(name="DICTNAME", length=100)
/*  34:    */   private String dictname;
/*  35:    */   
/*  36:    */   public Long getId()
/*  37:    */   {
/*  38: 72 */     return this.id;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setId(Long id)
/*  42:    */   {
/*  43: 81 */     this.id = id;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Long getZyId()
/*  47:    */   {
/*  48: 88 */     return this.zyId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setZyId(Long zyId)
/*  52:    */   {
/*  53: 97 */     this.zyId = zyId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getColdescription()
/*  57:    */   {
/*  58:104 */     return this.coldescription;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setColdescription(String coldescription)
/*  62:    */   {
/*  63:113 */     this.coldescription = coldescription;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getColname()
/*  67:    */   {
/*  68:120 */     return this.colname;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setColname(String colname)
/*  72:    */   {
/*  73:129 */     this.colname = colname;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getColtype()
/*  77:    */   {
/*  78:136 */     return this.coltype;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setColtype(String coltype)
/*  82:    */   {
/*  83:145 */     this.coltype = coltype;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getCollength()
/*  87:    */   {
/*  88:152 */     return this.collength;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setCollength(String collength)
/*  92:    */   {
/*  93:161 */     this.collength = collength;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getDictpor()
/*  97:    */   {
/*  98:168 */     return this.dictpor;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setDictpor(String dictpor)
/* 102:    */   {
/* 103:177 */     this.dictpor = dictpor;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getDictname()
/* 107:    */   {
/* 108:184 */     return this.dictname;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setDictname(String dictname)
/* 112:    */   {
/* 113:193 */     this.dictname = dictname;
/* 114:    */   }
/* 115:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.domain.TZyglGabzysjx
 * JD-Core Version:    0.7.0.1
 */