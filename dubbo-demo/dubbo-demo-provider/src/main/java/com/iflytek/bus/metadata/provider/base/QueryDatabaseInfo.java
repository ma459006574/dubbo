/*   1:    */ package com.iflytek.bus.metadata.provider.base;
/*   2:    */ 
/*   3:    */ public class QueryDatabaseInfo
/*   4:    */ {
/*   5: 35 */   public static String TABLE = "SELECT T1.OBJECT_ID,T.OWNER AS OWNER, T.TABLE_NAME AS NAMES, T.TABLESPACE_NAME, T.TEMPORARY,T2.COMMENTS FROM ALL_TABLES T,ALL_OBJECTS T1, ALL_TAB_COMMENTS T2 WHERE T1.OWNER = T2.OWNER(+) AND T1.OBJECT_NAME = T2.TABLE_NAME(+) AND T.OWNER = T1.OWNER AND T.TABLE_NAME = T1.OBJECT_NAME AND  T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T.DROPPED = 'NO'";
/*   6: 53 */   public static String COL = "SELECT T.OWNER AS OWNER,T.TABLE_NAME AS NAMES,T.COLUMN_NAME,T1.COMMENTS,T.DATA_TYPE,T.DATA_LENGTH,T.NULLABLE,T.DATA_DEFAULT FROM ALL_TAB_COLUMNS T, ALL_COL_COMMENTS T1 WHERE T.COLUMN_NAME = T1.COLUMN_NAME AND T.TABLE_NAME = T1.TABLE_NAME AND T.OWNER = T1.OWNER AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T.TABLE_NAME NOT LIKE 'BIN%'";
/*   7: 70 */   public static String INDEX = "SELECT T.INDEX_OWNER,T.INDEX_NAME ,T.TABLE_OWNER,T.TABLE_NAME,T2.COLUMN_EXPRESSION,T.COLUMN_NAME,T1.INDEX_TYPE FROM ALL_IND_COLUMNS T ,ALL_INDEXES T1, ALL_IND_EXPRESSIONS T2 WHERE T.INDEX_OWNER = T1.OWNER AND T.INDEX_NAME = T1.INDEX_NAME AND T1.OWNER = T2.INDEX_OWNER(+) AND T1.INDEX_NAME = T2.INDEX_NAME(+) AND  T1.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T.TABLE_NAME NOT LIKE 'BIN%'";
/*   8: 86 */   public static String PROCEDURE = "SELECT T.OWNER AS OWNER, T.OBJECT_NAME AS NAMES, T1.OBJECT_TYPE, T1.OBJECT_ID FROM ALL_PROCEDURES T, ALL_OBJECTS T1 WHERE T.OWNER = T1.OWNER AND T.OBJECT_NAME = T1.OBJECT_NAME AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T1.OBJECT_TYPE = 'PROCEDURE'";
/*   9:100 */   public static String FUNCTION = "SELECT T.OWNER AS OWNER, T.OBJECT_NAME AS NAMES, T1.OBJECT_TYPE, T1.OBJECT_ID  FROM ALL_PROCEDURES T, ALL_OBJECTS T1 WHERE T.OWNER = T1.OWNER AND T.OBJECT_NAME = T1.OBJECT_NAME AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T1.OBJECT_TYPE = 'FUNCTION'";
/*  10:116 */   public static String PACKAGE = "SELECT T.OWNER AS OWNER, T.OBJECT_NAME AS NAMES,WMSYS.WM_CONCAT(T.PROCEDURE_NAME) AS PROCEDURE_NAME, T1.OBJECT_TYPE, T1.OBJECT_ID  FROM ALL_PROCEDURES T, ALL_OBJECTS T1 WHERE T.OWNER = T1.OWNER AND T.OBJECT_NAME = T1.OBJECT_NAME AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T1.OBJECT_TYPE = 'PACKAGE' GROUP BY T.OWNER,T.OBJECT_NAME,T1.OBJECT_TYPE,T1.OBJECT_ID";
/*  11:135 */   public static String SEQUENCE = "SELECT T1.OBJECT_ID,T.SEQUENCE_OWNER AS OWNER,T.SEQUENCE_NAME AS NAMES ,T.MIN_VALUE ,T.MAX_VALUE ,T.INCREMENT_BY,T.LAST_NUMBER FROM ALL_SEQUENCES T,ALL_OBJECTS T1 WHERE T.SEQUENCE_OWNER = T1.OWNER AND T.SEQUENCE_NAME = T1.OBJECT_NAME AND SEQUENCE_OWNER   NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC')";
/*  12:147 */   public static String VIEW = "SELECT T1.OBJECT_ID,T.OWNER AS OWNER,T.VIEW_NAME AS NAMES,T.TEXT FROM ALL_VIEWS T  ,ALL_OBJECTS T1 WHERE T.OWNER = T1.OWNER AND T.VIEW_NAME = T1.OBJECT_NAME AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC')";
/*  13:159 */   public static String VIEW_COL = "SELECT T.OWNER,T.TABLE_NAME,T.COLUMN_NAME,T1.COMMENTS,T.DATA_TYPE,T.DATA_LENGTH,T.NULLABLE,T.DATA_DEFAULT FROM  ALL_TAB_COLUMNS T, ALL_COL_COMMENTS T1 ,ALL_VIEWS T2 WHERE T.OWNER = T2.OWNER AND T.TABLE_NAME = T2.VIEW_NAME AND T.COLUMN_NAME = T1.COLUMN_NAME AND T.TABLE_NAME = T1.TABLE_NAME AND T.OWNER = T1.OWNER AND T.OWNER NOT IN ('BI','PM', 'SH', 'IX', 'OE','HR', 'SCOTT', 'MGMT_VIEW', 'MDDATA','SYSMAN', 'MDSYS', 'SI_INFORMTN_SCHEMA', 'ORDPLUGINS', 'ORDSYS', 'OLAPSYS','ANONYMOUS','XDB', 'CTXSYS','EXFSYS','WMSYS', 'DBSNMP','TSMSYS','DMSYS', 'DIP', 'OUTLN', 'SYSTEM', 'SYS','PUBLIC') AND T.TABLE_NAME NOT LIKE 'BIN%'";
/*  14:175 */   public static String FUNCTION_PROCEDURE_PARM = "SELECT X.OWNER, X.OBJECT_NAME,IN_OUT, WMSYS.WM_CONCAT(X.ARGUMENT) AS XXNR FROM (SELECT T.OWNER,T.OBJECT_NAME,T.ARGUMENT_NAME||'('||T.DATA_TYPE||')' ARGUMENT,T.OBJECT_ID,T.IN_OUT,ROWNUM ROW_ID FROM ALL_ARGUMENTS T WHERE T.OWNER NOT IN ('BI','PM','SH','IX','OE','HR','SCOTT','MGMT_VIEW','MDDATA','SYSMAN', 'MDSYS','SI_INFORMTN_SCHEMA','ORDPLUGINS','ORDSYS','OLAPSYS','ANONYMOUS','XDB','CTXSYS','EXFSYS','WMSYS','DBSNMP','TSMSYS','DMSYS','DIP','OUTLN','SYSTEM','SYS','PUBLIC')) X WHERE X.ARGUMENT <> '()' AND X.OWNER = ? AND X.OBJECT_NAME = ? GROUP BY X.OBJECT_NAME,X.IN_OUT,X.OWNER";
/*  15:193 */   public static String TRIGGER = "SELECT T.OWNER AS OWNER,T.TRIGGER_NAME AS NAMES,T.TRIGGER_TYPE ,T.TRIGGERING_EVENT ,T.TABLE_OWNER ,T.BASE_OBJECT_TYPE ,T.TABLE_NAME FROM ALL_TRIGGERS T  WHERE T.OWNER NOT IN ('BI','PM','SH','IX','OE','HR','SCOTT','MGMT_VIEW','MDDATA','SYSMAN','MDSYS','SI_INFORMTN_SCHEMA','ORDPLUGINS','ORDSYS','OLAPSYS','ANONYMOUS','XDB','CTXSYS','EXFSYS','WMSYS','DBSNMP','TSMSYS','DMSYS','DIP','OUTLN','SYSTEM','SYS','PUBLIC')";
/*  16:209 */   public static String PK = "SELECT T1.CONSTRAINT_NAME, T1.COLUMN_NAME, T1.TABLE_NAME, T1.OWNER FROM ALL_CONSTRAINTS T, ALL_CONS_COLUMNS T1 WHERE T.OWNER = T1.OWNER AND T.CONSTRAINT_NAME = T1.CONSTRAINT_NAME AND T.TABLE_NAME = T1.TABLE_NAME AND T.CONSTRAINT_TYPE = 'P' AND T1.TABLE_NAME = ? AND T1.OWNER = ?";
/*  17:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.base.QueryDatabaseInfo
 * JD-Core Version:    0.7.0.1
 */