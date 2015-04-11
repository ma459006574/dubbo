/*   1:    */ package com.iflytek.bus.metadata.provider.dao;
/*   2:    */ 
/*   3:    */ import com.iflytek.bus.metadata.provider.base.QueryDatabaseInfo;
/*   4:    */ import com.iflytek.bus.metadata.provider.domain.TMdmDatasource;
/*   5:    */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*   6:    */ import java.sql.Connection;
/*   7:    */ import java.sql.PreparedStatement;
/*   8:    */ import java.sql.ResultSet;
/*   9:    */ import java.sql.SQLException;
/*  10:    */ import java.util.HashMap;
/*  11:    */ import org.apache.commons.lang.StringUtils;
/*  12:    */ 
/*  13:    */ public class TMdmDatasourceDao
/*  14:    */   extends HibernateEntityDao<TMdmDatasource>
/*  15:    */ {
/*  16:    */   public HashMap<String, String> queryDatabaseInfo(Connection conn, String type, String name, String sz)
/*  17:    */   {
/*  18: 41 */     StringBuffer sql = new StringBuffer();
/*  19: 42 */     sql.append("select * from (");
/*  20: 43 */     if ("dataTable".equals(type)) {
/*  21: 44 */       sql.append(QueryDatabaseInfo.TABLE);
/*  22: 45 */     } else if ("dataView".equals(type)) {
/*  23: 46 */       sql.append(QueryDatabaseInfo.VIEW);
/*  24: 47 */     } else if ("storedProcedure".equals(type)) {
/*  25: 48 */       sql.append(QueryDatabaseInfo.PROCEDURE);
/*  26: 49 */     } else if ("function".equals(type)) {
/*  27: 50 */       sql.append(QueryDatabaseInfo.FUNCTION);
/*  28: 51 */     } else if ("package".equals(type)) {
/*  29: 52 */       sql.append(QueryDatabaseInfo.PACKAGE);
/*  30: 53 */     } else if ("sequence".equals(type)) {
/*  31: 54 */       sql.append(QueryDatabaseInfo.SEQUENCE);
/*  32: 55 */     } else if ("trigger".equals(type)) {
/*  33: 56 */       sql.append(QueryDatabaseInfo.TRIGGER);
/*  34:    */     }
/*  35: 58 */     sql.append(") where 1=1");
/*  36: 59 */     if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name))) {
/*  37: 60 */       sql.append(" AND OWNER = ? AND NAMES = ?");
/*  38:    */     }
/*  39: 62 */     PreparedStatement ps = null;
/*  40: 63 */     ResultSet rs = null;
/*  41: 64 */     HashMap<String, String> result = new HashMap();
/*  42:    */     try
/*  43:    */     {
/*  44: 66 */       ps = conn.prepareStatement(sql.toString());
/*  45: 67 */       if ((StringUtils.isNotBlank(type)) && (StringUtils.isNotBlank(name)))
/*  46:    */       {
/*  47: 68 */         ps.setString(1, sz);
/*  48: 69 */         ps.setString(2, name);
/*  49:    */       }
/*  50: 71 */       rs = ps.executeQuery();
/*  51: 72 */       while (rs.next()) {
/*  52: 73 */         if ("dataTable".equals(type))
/*  53:    */         {
/*  54: 74 */           result.put("OWNER", rs.getString("OWNER"));
/*  55: 75 */           result.put("NAMES", rs.getString("NAMES"));
/*  56: 76 */           result.put("TABLESPACE_NAME", rs.getString("TABLESPACE_NAME"));
/*  57: 77 */           result.put("TEMPORARY", rs.getString("TEMPORARY"));
/*  58: 78 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/*  59: 79 */           result.put("COMMENTS", rs.getString("COMMENTS"));
/*  60: 80 */           queryTablePK(result, conn, name, sz);
/*  61:    */         }
/*  62: 81 */         else if ("dataView".equals(type))
/*  63:    */         {
/*  64: 82 */           result.put("OWNER", rs.getString("OWNER"));
/*  65: 83 */           result.put("NAMES", rs.getString("NAMES"));
/*  66: 84 */           result.put("TEXT", rs.getString("TEXT"));
/*  67: 85 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/*  68:    */         }
/*  69: 86 */         else if ("storedProcedure".equals(type))
/*  70:    */         {
/*  71: 87 */           result.put("OWNER", rs.getString("OWNER"));
/*  72: 88 */           result.put("NAMES", rs.getString("NAMES"));
/*  73: 89 */           result.put("OBJECT_TYPE", rs.getString("OBJECT_TYPE"));
/*  74: 90 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/*  75: 91 */           queryFunctionProcedureParm(result, conn, name, sz);
/*  76:    */         }
/*  77: 92 */         else if ("function".equals(type))
/*  78:    */         {
/*  79: 93 */           result.put("OWNER", rs.getString("OWNER"));
/*  80: 94 */           result.put("NAMES", rs.getString("NAMES"));
/*  81: 95 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/*  82: 96 */           queryFunctionProcedureParm(result, conn, name, sz);
/*  83:    */         }
/*  84: 97 */         else if ("package".equals(type))
/*  85:    */         {
/*  86: 98 */           result.put("OWNER", rs.getString("OWNER"));
/*  87: 99 */           result.put("NAMES", rs.getString("NAMES"));
/*  88:100 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/*  89:101 */           result.put("PROCEDURE_NAME", rs.getString("PROCEDURE_NAME"));
/*  90:    */         }
/*  91:102 */         else if ("sequence".equals(type))
/*  92:    */         {
/*  93:103 */           result.put("OWNER", rs.getString("OWNER"));
/*  94:104 */           result.put("NAMES", rs.getString("NAMES"));
/*  95:105 */           result.put("MIN_VALUE", rs.getString("MIN_VALUE"));
/*  96:106 */           result.put("MAX_VALUE", rs.getString("MAX_VALUE"));
/*  97:107 */           result.put("INCREMENT_BY", rs.getString("INCREMENT_BY"));
/*  98:108 */           result.put("LAST_NUMBER", rs.getString("LAST_NUMBER"));
/*  99:109 */           result.put("OBJECT_ID", rs.getString("OBJECT_ID"));
/* 100:    */         }
/* 101:110 */         else if ("trigger".equals(type))
/* 102:    */         {
/* 103:111 */           result.put("OWNER", rs.getString("OWNER"));
/* 104:112 */           result.put("NAMES", rs.getString("NAMES"));
/* 105:113 */           result.put("TRIGGER_TYPE", rs.getString("TRIGGER_TYPE"));
/* 106:114 */           result.put("TRIGGERING_EVENT", rs.getString("TRIGGERING_EVENT"));
/* 107:115 */           result.put("TABLE_OWNER", rs.getString("TABLE_OWNER"));
/* 108:116 */           result.put("BASE_OBJECT_TYPE", rs.getString("BASE_OBJECT_TYPE"));
/* 109:117 */           result.put("TABLE_NAME", rs.getString("TABLE_NAME"));
/* 110:    */         }
/* 111:    */       }
/* 112:130 */       return result;
/* 113:    */     }
/* 114:    */     catch (SQLException e)
/* 115:    */     {
/* 116:121 */       e.printStackTrace();
/* 117:    */     }
/* 118:    */     finally
/* 119:    */     {
/* 120:    */       try
/* 121:    */       {
/* 122:124 */         rs.close();
/* 123:125 */         ps.close();
/* 124:    */       }
/* 125:    */       catch (SQLException e)
/* 126:    */       {
/* 127:127 */         e.printStackTrace();
/* 128:    */       }
/* 129:    */     }
/* 130:    */
return result;   }
/* 131:    */   
/* 132:    */   public void queryTablePK(HashMap<String, String> result, Connection conn, String name, String sz)
/* 133:    */   {
/* 134:146 */     StringBuffer sql = new StringBuffer();
/* 135:147 */     sql.append(QueryDatabaseInfo.PK);
/* 136:148 */     PreparedStatement ps = null;
/* 137:149 */     ResultSet rs = null;
/* 138:150 */     StringBuffer pk = new StringBuffer();
/* 139:    */     try
/* 140:    */     {
/* 141:152 */       ps = conn.prepareStatement(sql.toString());
/* 142:153 */       ps.setString(1, name);
/* 143:154 */       ps.setString(2, sz);
/* 144:155 */       rs = ps.executeQuery();
/* 145:156 */       while (rs.next())
/* 146:    */       {
/* 147:157 */         pk.append(rs.getString("COLUMN_NAME"));
/* 148:158 */         pk.append(",");
/* 149:    */       }
/* 150:160 */       if (pk.length() > 0) {
/* 151:161 */         result.put("PK", pk.substring(0, pk.length() - 1));
/* 152:    */       } else {
/* 153:163 */         result.put("PK", "");
/* 154:    */       }
/* 155:    */       return;
/* 156:    */     }
/* 157:    */     catch (SQLException e)
/* 158:    */     {
/* 159:166 */       e.printStackTrace();
/* 160:    */     }
/* 161:    */     finally
/* 162:    */     {
/* 163:    */       try
/* 164:    */       {
/* 165:169 */         ps.close();
/* 166:170 */         rs.close();
/* 167:    */       }
/* 168:    */       catch (SQLException e)
/* 169:    */       {
/* 170:172 */         e.printStackTrace();
/* 171:    */       }
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void queryFunctionProcedureParm(HashMap<String, String> result, Connection conn, String name, String sz)
/* 176:    */   {
/* 177:190 */     StringBuffer sql = new StringBuffer();
/* 178:191 */     sql.append(QueryDatabaseInfo.FUNCTION_PROCEDURE_PARM);
/* 179:192 */     PreparedStatement ps = null;
/* 180:193 */     ResultSet rs = null;
/* 181:    */     try
/* 182:    */     {
/* 183:195 */       ps = conn.prepareStatement(sql.toString());
/* 184:196 */       ps.setString(1, sz);
/* 185:197 */       ps.setString(2, name);
/* 186:198 */       rs = ps.executeQuery();
/* 187:199 */       while (rs.next()) {
/* 188:200 */         result.put(rs.getString("IN_OUT"), rs.getString("XXNR"));
/* 189:    */       }
/* 190:    */       return;
/* 191:    */     }
/* 192:    */     catch (SQLException e)
/* 193:    */     {
/* 194:203 */       e.printStackTrace();
/* 195:    */     }
/* 196:    */     finally
/* 197:    */     {
/* 198:    */       try
/* 199:    */       {
/* 200:206 */         ps.close();
/* 201:207 */         rs.close();
/* 202:    */       }
/* 203:    */       catch (SQLException e)
/* 204:    */       {
/* 205:209 */         e.printStackTrace();
/* 206:    */       }
/* 207:    */     }
/* 208:    */   }
/* 209:    */   
/* 210:    */   public Long datasourceUniqueness(String ip, Long projectId)
/* 211:    */   {
/* 212:224 */     String hql = "from TMdmDatasource where dsip = ? and projectid=?";
/* 213:225 */     return Long.valueOf(countHqlResult(hql, new Object[] { ip, projectId }));
/* 214:    */   }
/* 215:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.dao.TMdmDatasourceDao
 * JD-Core Version:    0.7.0.1
 */