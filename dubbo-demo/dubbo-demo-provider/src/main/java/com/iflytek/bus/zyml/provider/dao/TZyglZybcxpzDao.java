/*  1:   */ package com.iflytek.bus.zyml.provider.dao;
/*  2:   */ 
/*  3:   */ import com.iflytek.bus.zyml.provider.domain.TZyglZybcxpz;
/*  4:   */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*  5:   */ import java.util.List;
/*  6:   */ import org.apache.commons.lang.StringUtils;
/*  7:   */ import org.slf4j.Logger;
/*  8:   */ 
/*  9:   */ public class TZyglZybcxpzDao
/* 10:   */   extends HibernateEntityDao<TZyglZybcxpz>
/* 11:   */ {
/* 12:   */   public List<TZyglZybcxpz> getZybcxpzListByZcyy(Long edid, String zcyy)
/* 13:   */   {
/* 14:18 */     if (StringUtils.isNotBlank(zcyy))
/* 15:   */     {
/* 16:19 */       String hql = "from TZyglZybcxpz where zymlid = (select objectid from TZyglZyml where mdid = ?) and zcyy = ? ";
/* 17:20 */       return super.find(hql, new Object[] { edid, zcyy });
/* 18:   */     }
/* 19:22 */     String hql = "from TZyglZybcxpz where zymlid = (select objectid from TZyglZyml where mdid = ?)";
/* 20:23 */     return super.find(hql, new Object[] { edid });
/* 21:   */   }
/* 22:   */   
/* 23:   */   public Boolean uniqueValidate(String cxbz, String sjb, String zcyy)
/* 24:   */   {
/* 25:34 */     if ((StringUtils.isNotBlank(cxbz)) && (StringUtils.isNotBlank(sjb)) && (StringUtils.isNotBlank(zcyy)))
/* 26:   */     {
/* 27:36 */       String sql = "select 1 from T_ZYGL_ZYBCXPZ where cxbz = ? or (upper(sjb) = upper(?) and zcyy = ?)";
/* 28:37 */       Long count = Long.valueOf(super.countSqlResult(sql, new Object[] { cxbz, sjb, zcyy }));
/* 29:38 */       return Boolean.valueOf(count.longValue() == 0L);
/* 30:   */     }
/* 31:40 */     this.logger.warn("查询标识/数据表/支撑应用为空值！");
/* 32:41 */     return Boolean.valueOf(false);
/* 33:   */   }
/* 34:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.dao.TZyglZybcxpzDao
 * JD-Core Version:    0.7.0.1
 */