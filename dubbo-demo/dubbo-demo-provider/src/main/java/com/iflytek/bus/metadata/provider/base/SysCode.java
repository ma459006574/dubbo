package com.iflytek.bus.metadata.provider.base;

public class SysCode
{
  public static final String DATE_FORMATE_String14 = "yyyyMMddHHmmss";
  public static final String DATE_FORMATE_String19 = "yyyy-MM-dd HH:mm:ss";
  public static final String DATE_FORMATE_String10 = "yyyy-MM-dd";
  public static final String YES = "1";
  public static final String NO = "0";
  public static final String ADD_HISSTORY = "创建内容";
  public static final String SSLX_SSJZ = "0";
  public static final String SSLX_YWXT = "1";
  public static final String SFBZH_YES = "Y";
  public static final String SFBZH_TXT_YES = "是";
  public static final String SFBZH_NO = "N";
  public static final String ZYML_ZYLX_VIEW = "1";
  public static final String ZYML_ZYLX_TABLE = "0";
  public static final String MDM_SSTYPE_VIEW = "dataView";
  public static final String ZYML_SSJZXT_UNKNOWN = "0";
  public static final String MDM_LYLX_CQL = "1";
  public static final String MDM_LYLX_ZDL = "4";
  
  public static abstract interface ZYMLTYPE
  {
    public static final String COMMONZYML = "COMMONZYML";
    public static final String GALZYML = "GABZYML";
  }
  
  public static abstract interface SJYLX
  {
    public static final String ORACLE = "0";
    public static final String SQLSERVER = "1";
    public static final String MYSQL = "2";
    public static final String MONGODB = "3";
  }
  
  public static abstract interface JSYSJ
  {
    public static final String SEQUENCE = "sequence";
    public static final String PROCEDURE = "storedProcedure";
    public static final String PACKAGE = "package";
    public static final String TRIGGER = "trigger";
    public static final String TABLE = "dataTable";
    public static final String VIEW = "dataView";
    public static final String FUNCTION = "function";
  }
}


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.base.SysCode
 * JD-Core Version:    0.7.0.1
 */