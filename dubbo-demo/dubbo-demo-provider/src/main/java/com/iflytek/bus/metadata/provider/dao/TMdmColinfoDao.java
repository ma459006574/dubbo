/*   1:    */ package com.iflytek.bus.metadata.provider.dao;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.metadata.provider.base.QueryDatabaseInfo;
/*   4:    */ import com.iflytek.bus.metadata.provider.domain.TMdmColinfo;
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
/*  15:    */ public class TMdmColinfoDao
/*  16:    */   extends HibernateEntityDao<TMdmColinfo>
/*  17:    */ {
/*  18:    */   public List<TMdmColinfo> queryVeiwColInfo(Connection conn, String type, String name, String sz)
/*  19:    */   {
/*  20: 39 */     StringBuffer sql = new StringBuffer();
/*  21: 40 */     sql.append(QueryDatabaseInfo.VIEW_COL);
/*  22: 41 */     if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name))) {
/*  23: 42 */       sql.append(" AND T.OWNER = ? AND T.TABLE_NAME = ? ");
/*  24:    */     }
/*  25: 44 */     sql.append("order by T.COLUMN_ID");
/*  26: 45 */     PreparedStatement ps = null;
/*  27: 46 */     ResultSet rs = null;
/*  28: 47 */     ArrayList result = new ArrayList();
/*  29:    */     try
/*  30:    */     {
/*  31: 49 */       ps = conn.prepareStatement(sql.toString());
/*  32: 50 */       if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name)))
/*  33:    */       {
/*  34: 51 */         ps.setString(1, sz);
/*  35: 52 */         ps.setString(2, name);
/*  36:    */       }
/*  37: 54 */       rs = ps.executeQuery();
/*  38: 55 */       while (rs.next())
/*  39:    */       {
/*  40: 56 */         TMdmColinfo bean = new TMdmColinfo();
/*  41: 57 */         bean.setColdescription(rs.getString("COMMENTS"));
/*  42: 58 */         bean.setColisempty(rs.getString("NULLABLE"));
/*  43: 59 */         bean.setCollength(rs.getString("DATA_LENGTH"));
/*  44: 60 */         bean.setColname(rs.getString("COLUMN_NAME"));
/*  45: 61 */         bean.setColtype(rs.getString("DATA_TYPE"));
/*  46: 62 */         bean.setDefaultvalue(rs.getString("DATA_DEFAULT"));
/*  47: 63 */         bean.setStore(rs.getString("OWNER"));
/*  48: 64 */         result.add(bean);
/*  49:    */       }
/*  50: 76 */       return result;
/*  51:    */     }
/*  52:    */     catch (SQLException e)
/*  53:    */     {
/*  54: 67 */       e.printStackTrace();
/*  55:    */     }
/*  56:    */     finally
/*  57:    */     {
/*  58:    */       try
/*  59:    */       {
/*  60: 70 */         ps.close();
/*  61: 71 */         rs.close();
/*  62:    */       }
/*  63:    */       catch (SQLException e)
/*  64:    */       {
/*  65: 73 */         e.printStackTrace();
/*  66:    */       }
/*  67:    */     }
/*  68:    */
return result;   }
/*  69:    */   
/*  70:    */   public List<TMdmColinfo> queryTableColInfo(Connection conn, String type, String name, String sz)
/*  71:    */   {
/*  72: 92 */     StringBuffer sql = new StringBuffer();
/*  73: 93 */     sql.append(QueryDatabaseInfo.COL);
/*  74: 94 */     if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name))) {
/*  75: 95 */       sql.append(" AND T.OWNER = ? AND T.TABLE_NAME = ? ");
/*  76:    */     }
/*  77: 97 */     sql.append("order by T.COLUMN_ID");
/*  78: 98 */     PreparedStatement ps = null;
/*  79: 99 */     ResultSet rs = null;
/*  80:100 */     List<TMdmColinfo> result = new ArrayList();
/*  81:    */     try
/*  82:    */     {
/*  83:102 */       ps = conn.prepareStatement(sql.toString());
/*  84:103 */       if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name)))
/*  85:    */       {
/*  86:104 */         ps.setString(1, sz);
/*  87:105 */         ps.setString(2, name);
/*  88:    */       }
/*  89:107 */       rs = ps.executeQuery();
/*  90:108 */       while (rs.next())
/*  91:    */       {
/*  92:109 */         TMdmColinfo bean = new TMdmColinfo();
/*  93:110 */         bean.setColdescription(rs.getString("COMMENTS"));
/*  94:111 */         bean.setColisempty(rs.getString("NULLABLE"));
/*  95:112 */         bean.setCollength(rs.getString("DATA_LENGTH"));
/*  96:113 */         bean.setColname(rs.getString("COLUMN_NAME"));
/*  97:114 */         bean.setColtype(rs.getString("DATA_TYPE"));
/*  98:115 */         bean.setDefaultvalue(rs.getString("DATA_DEFAULT"));
/*  99:    */         
/* 100:117 */         bean.setStore(rs.getString("OWNER"));
/* 101:118 */         result.add(bean);
/* 102:    */       }
/* 103:131 */       return result;
/* 104:    */     }
/* 105:    */     catch (SQLException e)
/* 106:    */     {
/* 107:121 */       e.printStackTrace();
/* 108:    */     }
/* 109:    */     finally
/* 110:    */     {
/* 111:    */       try
/* 112:    */       {
/* 113:124 */         ps.close();
/* 114:125 */         rs.close();
/* 115:    */       }
/* 116:    */       catch (SQLException e)
/* 117:    */       {
/* 118:128 */         e.printStackTrace();
/* 119:    */       }
/* 120:    */     }
/* 121:    */
return result;   }
/* 122:    */   
/* 123:    */   public void updateColinfo(Object[] colinfoids, Long mdid)
/* 124:    */   {
/* 125:143 */     if ((mdid == null) || (colinfoids == null) || (colinfoids.length == 0)) {
/* 126:144 */       return;
/* 127:    */     }
/* 128:146 */     StringBuffer sql = new StringBuffer();
/* 129:147 */     sql.append("update TMdmColinfo SET mdid=:mdid where objectid in (:colinfoids)");
/* 130:148 */     super.createQuery(sql.toString(), new Object[0]).setParameter("mdid", mdid).setParameterList("colinfoids", colinfoids).executeUpdate();
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void removeByMdid(Long mdid)
/* 134:    */   {
/* 135:156 */     String hql = "delete from TMdmColinfo where mdid = ?";
/* 136:157 */     super.createQuery(hql, new Object[] { mdid }).executeUpdate();
/* 137:    */   }
/* 138:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.dao.TMdmColinfoDao
 * JD-Core Version:    0.7.0.1
 */