/*   1:    */ package com.iflytek.bus.zyml.provider.dao;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.zyml.provider.domain.TZyglGabzysjx;
/*   4:    */ import com.iflytek.bus.zyml.provider.domain.TZyglZyml;
/*   5:    */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*   6:    */ import java.math.BigDecimal;
/*   7:    */ import java.util.HashMap;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  10:    */ import org.apache.commons.lang.StringUtils;
/*  11:    */ import org.hibernate.SQLQuery;
/*  12:    */ 
/*  13:    */ public class TZyglZymlDao
/*  14:    */   extends HibernateEntityDao<TZyglZyml>
/*  15:    */ {
/*  16: 38 */   private int cyyysfzc = -1;
/*  17:    */   
/*  18:    */   public TZyglZyml getTZyglZymlById(Long objectid)
/*  19:    */   {
/*  20: 49 */     return (TZyglZyml)super.get(objectid);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public List<TZyglZyml> getTZyglZymlsByZylbMcOrjp(String zylbbm, String mcOrJp)
/*  24:    */   {
/*  25: 64 */     StringBuilder hql = new StringBuilder("from TZyglZyml zyml where 1=1");
/*  26: 65 */     Map<String, Object> values = new HashMap();
/*  27: 66 */     hql.append(" and cxbz is not null");
/*  28: 67 */     hql.append(" and exists (select 1 from TZyglZycxlpz zycxlpz where zycxlpz.cxbz=zyml.cxbz and zycxlpz.dalx='1' )");
/*  29: 68 */     if (zcyyIsExists()) {
/*  30: 69 */       hql.append(" and exists (from TZyglZybcxpz cyb where cyb.cxbz=zyml.cxbz and cyb.zcyy='WSMP')");
/*  31:    */     } else {
/*  32: 71 */       hql.append(" and zyml.cxbz like 'WSMP_%'");
/*  33:    */     }
/*  34: 73 */     if (StringUtils.isNotBlank(zylbbm))
/*  35:    */     {
/*  36: 74 */       hql.append(" and zylbbm like :zylbbm");
/*  37: 75 */       values.put("zylbbm", zylbbm.trim().substring(0, 2) + "%");
/*  38:    */     }
/*  39: 77 */     if (StringUtils.isNotBlank(mcOrJp))
/*  40:    */     {
/*  41: 78 */       hql.append(" and (zymc like :zymc ");
/*  42: 79 */       hql.append(" or to_pyjp(zymc) like :zymc) ");
/*  43: 80 */       values.put("zymc", "%" + mcOrJp.trim() + "%");
/*  44:    */     }
/*  45: 82 */     hql.append(" order by px");
/*  46: 83 */     return super.find(hql.toString(), values);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public List<TZyglZyml> getZymlZymcs(String text)
/*  50:    */   {
/*  51: 96 */     StringBuilder hql = new StringBuilder(" from TZyglZyml zyml where 1=1");
/*  52: 97 */     Map<String, Object> values = new HashMap();
/*  53: 98 */     hql.append(" and cxbz is not null");
/*  54: 99 */     hql.append(" and exists (from TZyglZycxlpz cxl where cxl.cxbz=zyml.cxbz and cxl.dalx='1')");
/*  55:100 */     if (zcyyIsExists()) {
/*  56:101 */       hql.append(" and exists (from TZyglZybcxpz cyb where cyb.cxbz=zyml.cxbz and cyb.zcyy='WSMP')");
/*  57:    */     } else {
/*  58:103 */       hql.append(" and zyml.cxbz like 'WSMP_%'");
/*  59:    */     }
/*  60:105 */     if (StringUtils.isNotBlank(text))
/*  61:    */     {
/*  62:106 */       hql.append(" and (zymc like :zymc ");
/*  63:107 */       hql.append(" or to_pyjp(zymc) like :zymc ) ");
/*  64:108 */       values.put("zymc", "%" + text.trim().toLowerCase() + "%");
/*  65:    */     }
/*  66:    */     else
/*  67:    */     {
/*  68:110 */       hql.append(" and 1=2 ");
/*  69:    */     }
/*  70:112 */     hql.append(" order by px");
/*  71:113 */     return super.find(hql.toString(), values);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public boolean zcyyIsExists()
/*  75:    */   {
/*  76:126 */     if (this.cyyysfzc == -1)
/*  77:    */     {
/*  78:127 */       String sql = "select count(column_name) from cols where table_name = upper('T_ZYGL_ZYBCXPZ') and column_name = upper('ZCYY')";
/*  79:    */       
/*  80:129 */       BigDecimal count = (BigDecimal)super.createSqlQuery(sql, new Object[0]).uniqueResult();
/*  81:130 */       if (count.longValue() > 0L) {
/*  82:131 */         this.cyyysfzc = 1;
/*  83:    */       } else {
/*  84:133 */         this.cyyysfzc = 0;
/*  85:    */       }
/*  86:    */     }
/*  87:136 */     if (this.cyyysfzc == 1) {
/*  88:137 */       return true;
/*  89:    */     }
/*  90:139 */     return false;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public Long getDefaultZymlImageId()
/*  94:    */   {
/*  95:151 */     String sql = "select objectid from t_zygl_image where type ='sys_default'";
/*  96:152 */     List<BigDecimal> list = super.createSqlQuery(sql, new Object[0]).list();
/*  97:153 */     if ((list != null) && (list.size() > 0)) {
/*  98:154 */       return Long.valueOf(((BigDecimal)list.get(0)).longValue());
/*  99:    */     }
/* 100:156 */     return null;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public List<TZyglGabzysjx> getGabSjxByZyid(Long zyId)
/* 104:    */   {
/* 105:166 */     return find("from TZyglGabzysjx where zyId=?", new Object[] { zyId });
/* 106:    */   }
/* 107:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.dao.TZyglZymlDao
 * JD-Core Version:    0.7.0.1
 */