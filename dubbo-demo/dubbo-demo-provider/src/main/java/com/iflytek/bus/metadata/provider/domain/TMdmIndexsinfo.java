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
/*  13:    */ @Table(name="T_MDM_INDEXSINFO")
/*  14:    */ @AccessType("field")
/*  15:    */ @SequenceGenerator(name="T_MDM_INDEXSINFO_ID", sequenceName="T_MDM_INDEXSINFO_SEQ", allocationSize=1)
/*  16:    */ public class TMdmIndexsinfo
/*  17:    */ {
/*  18:    */   @Id
/*  19:    */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_MDM_INDEXSINFO_ID")
/*  20:    */   private Long objectid;
/*  21:    */   @Column(name="MDID", length=22)
/*  22:    */   private Long mdid;
/*  23:    */   @Column(name="OWN", length=100)
/*  24:    */   private String own;
/*  25:    */   @Column(name="INDEXSNAME", length=4000)
/*  26:    */   private String indexsname;
/*  27:    */   @Column(name="INDEXSTYPE", length=200)
/*  28:    */   private String indexstype;
/*  29:    */   @Column(name="COLNAME", length=100)
/*  30:    */   private String colname;
/*  31:    */   @Column(name="ISCOMPRESS", length=100)
/*  32:    */   private String iscompress;
/*  33:    */   @Column(name="STORE", length=100)
/*  34:    */   private String store;
/*  35:    */   
/*  36:    */   public Long getMdid()
/*  37:    */   {
/*  38: 59 */     return this.mdid;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setMdid(Long mdid)
/*  42:    */   {
/*  43: 62 */     this.mdid = mdid;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Long getObjectid()
/*  47:    */   {
/*  48: 68 */     return this.objectid;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setObjectid(Long objectid)
/*  52:    */   {
/*  53: 75 */     this.objectid = objectid;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getOwn()
/*  57:    */   {
/*  58: 82 */     return this.own;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setOwn(String own)
/*  62:    */   {
/*  63: 89 */     this.own = own;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getIndexsname()
/*  67:    */   {
/*  68: 96 */     return this.indexsname;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setIndexsname(String indexsname)
/*  72:    */   {
/*  73:103 */     this.indexsname = indexsname;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getIndexstype()
/*  77:    */   {
/*  78:110 */     return this.indexstype;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setIndexstype(String indexstype)
/*  82:    */   {
/*  83:117 */     this.indexstype = indexstype;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getColname()
/*  87:    */   {
/*  88:124 */     return this.colname;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setColname(String colname)
/*  92:    */   {
/*  93:131 */     this.colname = colname;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getIscompress()
/*  97:    */   {
/*  98:138 */     return this.iscompress;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setIscompress(String iscompress)
/* 102:    */   {
/* 103:145 */     this.iscompress = iscompress;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getStore()
/* 107:    */   {
/* 108:152 */     return this.store;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setStore(String store)
/* 112:    */   {
/* 113:159 */     this.store = store;
/* 114:    */   }
/* 115:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.domain.TMdmIndexsinfo
 * JD-Core Version:    0.7.0.1
 */