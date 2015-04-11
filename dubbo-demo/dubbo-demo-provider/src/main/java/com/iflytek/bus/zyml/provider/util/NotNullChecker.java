/*  1:   */ package com.iflytek.bus.zyml.provider.util;
/*  2:   */ 
/*  3:   */ import com.iflytek.bus.zyml.provider.annotation.NotNull;
/*  4:   */ import java.lang.reflect.Field;
/*  5:   */ import org.apache.log4j.Logger;
/*  6:   */ 
/*  7:   */ public class NotNullChecker
/*  8:   */ {
/*  9:16 */   private static Logger logger = Logger.getLogger(NotNullChecker.class);
/* 10:   */   
/* 11:   */   public static Boolean checkNotNull(Object obj)
/* 12:   */   {
/* 13:23 */     Class<?> clazz = obj.getClass();
/* 14:24 */     Field[] fields = clazz.getDeclaredFields();
/* 15:25 */     for (Field field : fields) {
/* 16:26 */       if (field.isAnnotationPresent(NotNull.class))
/* 17:   */       {
/* 18:27 */         field.setAccessible(true);
/* 19:   */         try
/* 20:   */         {
/* 21:29 */           if (field.get(obj) == null)
/* 22:   */           {
/* 23:30 */             logger.warn(clazz.getName() + "." + field.getName() + "字段值为空！");
/* 24:31 */             return Boolean.valueOf(false);
/* 25:   */           }
/* 26:   */         }
/* 27:   */         catch (IllegalArgumentException e)
/* 28:   */         {
/* 29:34 */           e.printStackTrace();
/* 30:   */         }
/* 31:   */         catch (IllegalAccessException e)
/* 32:   */         {
/* 33:36 */           e.printStackTrace();
/* 34:   */         }
/* 35:   */       }
/* 36:   */     }
/* 37:40 */     return Boolean.valueOf(true);
/* 38:   */   }
/* 39:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.util.NotNullChecker
 * JD-Core Version:    0.7.0.1
 */