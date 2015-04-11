/*  1:   */ package com.iflytek.bus.metadata.provider.utils;
/*  2:   */ 
/*  3:   */ import com.iflytek.iframework.utils.DateUtils;
/*  4:   */ import java.text.SimpleDateFormat;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class DateUtil
/*  8:   */   extends DateUtils
/*  9:   */ {
/* 10:17 */   public static String FORMATTER_L = "yyyy-MM-dd HH:mm:ss";
/* 11:21 */   public static String FORMATTER_S = "yyyy-MM-dd";
/* 12:25 */   public static String GAB_FORMATTER_L = "yyyyMMddHHmmss";
/* 13:29 */   public static String GAB_FORMATTER_S = "yyyyMMdd";
/* 14:   */   
/* 15:   */   public static String getDateTimeStr(String format)
/* 16:   */   {
/* 17:36 */     return doFormatDate(new Date(), format);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static String doFormatDate(Date date, String format)
/* 21:   */   {
/* 22:46 */     if (date == null) {
/* 23:47 */       return null;
/* 24:   */     }
/* 25:48 */     return new SimpleDateFormat(format).format(date);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public static String getGabDate()
/* 29:   */   {
/* 30:56 */     return getDateTimeStr(GAB_FORMATTER_L);
/* 31:   */   }
/* 32:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.utils.DateUtil
 * JD-Core Version:    0.7.0.1
 */