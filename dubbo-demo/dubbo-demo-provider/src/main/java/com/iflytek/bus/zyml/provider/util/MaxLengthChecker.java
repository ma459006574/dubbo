/*  1:   */ package com.iflytek.bus.zyml.provider.util;
/*  2:   */ 
/*  3:   */ import com.iflytek.bus.zyml.provider.annotation.MaxLength;
/*  4:   */ import java.lang.reflect.Field;
/*  5:   */ import org.apache.log4j.Logger;
/*  6:   */ 
/*  7:   */ public class MaxLengthChecker
/*  8:   */ {
/*  9:16 */   private static Logger logger = Logger.getLogger(MaxLengthChecker.class);
/* 10:   */   
/* 11:   */   public static Boolean checkMaxLength(Object obj)
/* 12:   */   {
/* 13:23 */     Class<?> clazz = obj.getClass();
/* 14:24 */     Field[] fields = clazz.getDeclaredFields();
/* 15:25 */     for (Field field : fields) {
/* 16:26 */       if (field.isAnnotationPresent(MaxLength.class))
/* 17:   */       {
/* 18:27 */         MaxLength m = (MaxLength)field.getAnnotation(MaxLength.class);
/* 19:28 */         field.setAccessible(true);
/* 20:   */         try
/* 21:   */         {
/* 22:30 */           if ((field.get(obj) != null) && (field.get(obj).toString().getBytes().length > m.value()))
/* 23:   */           {
/* 24:31 */             logger.warn(clazz.getName() + "." + field.getName() + "字段值超长！");
/* 25:32 */             return Boolean.valueOf(false);
/* 26:   */           }
/* 27:   */         }
/* 28:   */         catch (IllegalArgumentException e)
/* 29:   */         {
/* 30:35 */           e.printStackTrace();
/* 31:   */         }
/* 32:   */         catch (IllegalAccessException e)
/* 33:   */         {
/* 34:37 */           e.printStackTrace();
/* 35:   */         }
/* 36:   */       }
/* 37:   */     }
/* 38:41 */     return Boolean.valueOf(true);
/* 39:   */   }
/* 40:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.zyml.provider.util.MaxLengthChecker
 * JD-Core Version:    0.7.0.1
 */