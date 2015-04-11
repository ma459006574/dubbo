/*  1:   */ package com.iflytek.bus.zyml.provider.dao;
/*  2:   */ 
/*  3:   */ import com.iflytek.bus.zyml.provider.domain.TZyglZylbfl;
/*  4:   */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*  5:   */ import java.util.ArrayList;
/*  6:   */ import java.util.HashMap;
/*  7:   */ import java.util.Iterator;
/*  8:   */ import java.util.List;
/*  9:   */ import java.util.Map;
/* 10:   */ import org.apache.commons.lang.StringUtils;
/* 11:   */ 
/* 12:   */ public class TZyglZylbflDao
/* 13:   */   extends HibernateEntityDao<TZyglZylbfl>
/* 14:   */ {
/* 15:   */   public List<TZyglZylbfl> getTZyglZylbflsByZymlMcOrjp(String mcOrJp)
/* 16:   */   {
/* 17:48 */     StringBuilder hql = new StringBuilder();
/* 18:49 */     hql.append("from TZyglZylbfl zylb where 1=1");
/* 19:50 */     Map<String, Object> values = new HashMap();
/* 20:51 */     hql.append(" and zylb.sjzylbbm is null");
/* 21:52 */     if (StringUtils.isNotBlank(mcOrJp))
/* 22:   */     {
/* 23:53 */       hql.append(" and exists (select 1 from TZyglZyml zyml,TZyglZycxlpz cxl  ");
/* 24:54 */       hql.append(" where substr(zylb.zylbbm,0,2)=substr(zyml.zylbbm,0,2)");
/* 25:55 */       hql.append(" and zyml.cxbz is not null");
/* 26:56 */       hql.append(" and zyml.zymc like :zymc");
/* 27:57 */       hql.append(" and cxl.dalx='1' and cxl.cxbz=zyml.cxbz)");
/* 28:58 */       values.put("zymc", "%" + mcOrJp.trim() + "%");
/* 29:   */     }
/* 30:   */     else
/* 31:   */     {
/* 32:60 */       hql.append(" and exists (select 1 from TZyglZyml zyml,TZyglZycxlpz cxl  ");
/* 33:61 */       hql.append(" where substr(zylb.zylbbm,0,2)=substr(zyml.zylbbm,0,2)");
/* 34:62 */       hql.append(" and zyml.cxbz is not null");
/* 35:63 */       hql.append(" and cxl.dalx='1' and cxl.cxbz=zyml.cxbz)");
/* 36:   */     }
/* 37:65 */     hql.append(" order by zylbbm");
/* 38:66 */     return super.find(hql.toString(), values);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public List<TZyglZylbfl> getZylbflList()
/* 42:   */   {
/* 43:74 */     String rootHql = " from TZyglZylbfl where sjzylbbm is null order by zylbbm";
/* 44:75 */     List<TZyglZylbfl> rootList = super.find(rootHql, new Object[0]);
/* 45:   */     
/* 46:77 */     String childHql = " from TZyglZylbfl where sjzylbbm is not null order by zylbbm";
/* 47:78 */     List<TZyglZylbfl> childList = super.find(childHql, new Object[0]);
/* 48:80 */     for (Iterator i$ = childList.iterator(); i$.hasNext();)
/* 49:   */     {
/* 50:80 */       TZyglZylbfl child = (TZyglZylbfl)i$.next();
/* 51:81 */       for (TZyglZylbfl parent : rootList) {
/* 52:82 */         if (StringUtils.equals(parent.getZylbbm(), child.getSjzylbbm()))
/* 53:   */         {
/* 54:83 */           if (parent.getChildList() == null)
/* 55:   */           {
/* 56:84 */             List<TZyglZylbfl> list = new ArrayList();
/* 57:85 */             parent.setChildList(list);
/* 58:   */           }
/* 59:87 */           parent.getChildList().add(child);
/* 60:   */         }
/* 61:   */       }
/* 62:   */     }
/* 63:   */     TZyglZylbfl child;
/* 64:91 */     return rootList;
/* 65:   */   }
/* 66:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.dao.TZyglZylbflDao
 * JD-Core Version:    0.7.0.1
 */