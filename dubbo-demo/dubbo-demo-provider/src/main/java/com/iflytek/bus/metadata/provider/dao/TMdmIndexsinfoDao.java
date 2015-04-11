/*   1:    */ package com.iflytek.bus.metadata.provider.dao;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.metadata.provider.base.QueryDatabaseInfo;
/*   4:    */ import com.iflytek.bus.metadata.provider.domain.TMdmIndexsinfo;
/*   5:    */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*   6:    */ import java.sql.Connection;
/*   7:    */ import java.sql.PreparedStatement;
/*   8:    */ import java.sql.ResultSet;
/*   9:    */ import java.sql.SQLException;
/*  10:    */ import java.util.ArrayList;
/*  11:    */ import java.util.List;
/*  12:    */ import org.apache.commons.lang.StringUtils;
/*  13:    */ import org.hibernate.Query;
/*  14:    */ 
/*  15:    */ public class TMdmIndexsinfoDao
/*  16:    */   extends HibernateEntityDao<TMdmIndexsinfo>
/*  17:    */ {
/*  18:    */   public List<TMdmIndexsinfo> queryIndexInfo(Connection conn, String type, String name, String sz)
/*  19:    */   {
/*  20: 39 */     StringBuffer sql = new StringBuffer();
/*  21: 40 */     sql.append(QueryDatabaseInfo.INDEX);
/*  22: 41 */     if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name))) {
/*  23: 42 */       sql.append(" AND T.TABLE_OWNER = ? AND T.TABLE_NAME = ? ");
/*  24:    */     }
/*  25: 44 */     PreparedStatement ps = null;
/*  26: 45 */     ResultSet rs = null;
/*  27: 46 */     List<TMdmIndexsinfo> result = new ArrayList();
/*  28:    */     try
/*  29:    */     {
/*  30: 48 */       ps = conn.prepareStatement(sql.toString());
/*  31: 49 */       if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name)))
/*  32:    */       {
/*  33: 50 */         ps.setString(1, sz);
/*  34: 51 */         ps.setString(2, name);
/*  35:    */       }
/*  36: 53 */       rs = ps.executeQuery();
/*  37: 54 */       while (rs.next())
/*  38:    */       {
/*  39: 55 */         TMdmIndexsinfo bean = new TMdmIndexsinfo();
/*  40: 56 */         bean.setColname(rs.getString("COLUMN_NAME"));
/*  41: 57 */         bean.setIndexsname(rs.getString("INDEX_NAME"));
/*  42: 58 */         bean.setIscompress(rs.getString("COLUMN_EXPRESSION"));
/*  43: 59 */         bean.setOwn(rs.getString("INDEX_OWNER"));
/*  44: 60 */         if ("FUNCTION-BASED NORMAL".equals(rs.getString("INDEX_TYPE")))
/*  45:    */         {
/*  46: 61 */           bean.setColname(rs.getString("COLUMN_EXPRESSION"));
/*  47: 62 */           bean.setIndexstype("NORMAL");
/*  48:    */         }
/*  49:    */         else
/*  50:    */         {
/*  51: 64 */           bean.setIndexstype(rs.getString("INDEX_TYPE"));
/*  52:    */         }
/*  53: 66 */         result.add(bean);
/*  54:    */       }
/*  55: 78 */       return result;
/*  56:    */     }
/*  57:    */     catch (SQLException e)
/*  58:    */     {
/*  59: 69 */       e.printStackTrace();
/*  60:    */     }
/*  61:    */     finally
/*  62:    */     {
/*  63:    */       try
/*  64:    */       {
/*  65: 72 */         ps.close();
/*  66: 73 */         rs.close();
/*  67:    */       }
/*  68:    */       catch (SQLException e)
/*  69:    */       {
/*  70: 75 */         e.printStackTrace();
/*  71:    */       }
/*  72:    */     }
/*  73:    */
return result;   }
/*  74:    */   
/*  75:    */   public void updateIndexinfo(Object[] indexsinfoids, Long mdid)
/*  76:    */   {
/*  77: 90 */     if ((mdid == null) || (indexsinfoids == null) || (indexsinfoids.length == 0)) {
/*  78: 91 */       return;
/*  79:    */     }
/*  80: 93 */     StringBuffer sql = new StringBuffer();
/*  81: 94 */     sql.append("update TMdmIndexsinfo SET mdid=:mdid where objectid in (:indexsinfoids)");
/*  82: 95 */     super.createQuery(sql.toString(), new Object[0]).setParameter("mdid", mdid).setParameterList("indexsinfoids", indexsinfoids).executeUpdate();
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void removeByMdid(Long mdid)
/*  86:    */   {
/*  87:103 */     String hql = "delete from TMdmIndexsinfo where mdid = ?";
/*  88:104 */     super.createQuery(hql, new Object[] { mdid }).executeUpdate();
/*  89:    */   }
/*  90:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.dao.TMdmIndexsinfoDao
 * JD-Core Version:    0.7.0.1
 */