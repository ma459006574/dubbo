/*  1:   */ package com.iflytek.bus.zyml.provider.dao;
/*  2:   */ 
/*  3:   */ import com.iflytek.bus.zyml.provider.domain.TZyglZycxlpz;
/*  4:   */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*  5:   */ import java.util.List;
/*  6:   */ 
/*  7:   */ public class TZyglZycxlpzDao
/*  8:   */   extends HibernateEntityDao<TZyglZycxlpz>
/*  9:   */ {
/* 10:   */   public List<TZyglZycxlpz> getTZyglZycxlpzsByCxbz(String cxbz)
/* 11:   */   {
/* 12:43 */     return findBy("cxbz", cxbz);
/* 13:   */   }
/* 14:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.dao.TZyglZycxlpzDao
 * JD-Core Version:    0.7.0.1
 */