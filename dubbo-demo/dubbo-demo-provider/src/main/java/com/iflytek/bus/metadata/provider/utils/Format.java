/*   1:    */ package com.iflytek.bus.metadata.provider.utils;
/*   2:    */ 
/*   3:    */ import com.alibaba.fastjson.JSONObject;
/*   4:    */ import com.iflytek.bus.metadata.provider.domain.TMdmDatasource;
/*   5:    */ import java.text.ParseException;
/*   6:    */ import java.text.SimpleDateFormat;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;
/*  10:    */ 
/*  11:    */ public class Format
/*  12:    */ {
/*  13:    */   public static String getDataToString()
/*  14:    */   {
/*  15: 47 */     SimpleDateFormat dataFm = new SimpleDateFormat("yyyyMMddHHmmss");
/*  16: 48 */     String date = dataFm.format(new Date());
/*  17: 49 */     return date;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public static String dataFromatToString19(String time)
/*  21:    */   {
/*  22: 63 */     SimpleDateFormat dataFm19 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*  23: 64 */     SimpleDateFormat dataFm14 = new SimpleDateFormat("yyyyMMddHHmmss");
/*  24: 65 */     Date date = null;
/*  25:    */     try
/*  26:    */     {
/*  27: 67 */       date = dataFm14.parse(time);
/*  28:    */     }
/*  29:    */     catch (ParseException e)
/*  30:    */     {
/*  31: 69 */       e.printStackTrace();
/*  32:    */     }
/*  33: 71 */     return dataFm19.format(date);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static String dataFromatToString14(String time)
/*  37:    */   {
/*  38: 84 */     SimpleDateFormat dataFm19 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*  39: 85 */     SimpleDateFormat dataFm14 = new SimpleDateFormat("yyyyMMddHHmmss");
/*  40: 86 */     Date date = null;
/*  41:    */     try
/*  42:    */     {
/*  43: 88 */       date = dataFm19.parse(time);
/*  44:    */     }
/*  45:    */     catch (ParseException e)
/*  46:    */     {
/*  47: 90 */       e.printStackTrace();
/*  48:    */     }
/*  49: 92 */     return dataFm14.format(date);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static Long[] stringToLongArray(String[] values)
/*  53:    */   {
/*  54:107 */     Long[] longs = new Long[values.length];
/*  55:108 */     for (int i = 0; i < values.length; i++) {
/*  56:109 */       longs[i] = Long.valueOf(Long.parseLong(values[i]));
/*  57:    */     }
/*  58:111 */     return longs;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public static String formatEdattributeJson(String edattribute, String type, TMdmDatasource dataSource)
/*  62:    */   {
/*  63:119 */     JSONObject jo = JSONObject.parseObject(edattribute);
/*  64:120 */     Map<String, String> map = new HashMap();
/*  65:121 */     if (dataSource != null)
/*  66:    */     {
/*  67:122 */       map.put(type + "_sjy_txt", dataSource.getDsname());
/*  68:123 */       map.put(type + "_sjy", dataSource.getObjectid().toString());
/*  69:    */     }
/*  70:125 */     map.put(type + "_sz", jo.getString("OWNER"));
/*  71:126 */     map.put(type + "_bkj", jo.getString("TABLESPACE_NAME"));
/*  72:127 */     map.put(type + "_lsbxx_txt", jo.getString("TEMPORARY").equals("N") ? "否" : "是");
/*  73:128 */     map.put(type + "_lsbxx", jo.getString("TEMPORARY"));
/*  74:129 */     map.put(type + "_colinfoid", jo.getString("COLINFOID"));
/*  75:130 */     map.put(type + "_indexid", jo.getString("INDEXID"));
/*  76:131 */     map.put(type + "_zj", jo.getString("PK"));
/*  77:132 */     map.put(type + "_bz", jo.getString("COMMENTS"));
/*  78:133 */     map.put(type + "_lylx", jo.getString("SJLY"));
/*  79:134 */     map.put(type + "_lylx_txt", jo.getString("SJLY_TXT"));
/*  80:135 */     map.put(type + "_hlivexx", jo.getString("HIVE"));
/*  81:136 */     map.put(type + "_hlivexx_txt", jo.getString("HIVE_TXT"));
/*  82:137 */     map.put(type + "_sharedProperty", jo.getString("SHARE_PROPERTY"));
/*  83:138 */     map.put(type + "_sharedProperty_txt", jo.getString("SHARE_PROPERTY_TXT"));
/*  84:139 */     map.put(type + "_bzhxx", jo.getString("BZHXX"));
/*  85:140 */     map.put(type + "_bzhxx_txt", jo.getString("BZHXX_TXT"));
/*  86:141 */     return JSONObject.toJSONString(map);
/*  87:    */   }
/*  88:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.utils.Format
 * JD-Core Version:    0.7.0.1
 */