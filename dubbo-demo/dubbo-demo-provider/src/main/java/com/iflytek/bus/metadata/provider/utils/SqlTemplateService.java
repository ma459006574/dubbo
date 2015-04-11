/*  1:   */ package com.iflytek.bus.metadata.provider.utils;
/*  2:   */ 
/*  3:   */ import java.io.IOException;
/*  4:   */ import java.io.InputStream;
/*  5:   */ import java.util.Map;
/*  6:   */ import java.util.Properties;
/*  7:   */ import org.apache.commons.lang.StringUtils;
/*  8:   */ 
/*  9:   */ public class SqlTemplateService
/* 10:   */ {
/* 11:   */   private static final String DEFAULT_CONFIG_PATH = "META-INF/spring/sqlTemplate.properties";
/* 12:   */   private Properties prop;
/* 13:   */   
/* 14:   */   public SqlTemplateService()
/* 15:   */   {
/* 16:18 */     this((String)null);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public SqlTemplateService(String configFilePath)
/* 20:   */   {
/* 21:25 */     String path = configFilePath != null ? configFilePath : "META-INF/spring/sqlTemplate.properties";
/* 22:26 */     ClassLoader cl = Thread.currentThread().getContextClassLoader();
/* 23:27 */     if (cl == null) {
/* 24:28 */       cl = getClass().getClassLoader();
/* 25:   */     }
/* 26:30 */     if (cl == null) {
/* 27:31 */       throw new RuntimeException("get class load to load sqlTemplate.xml error");
/* 28:   */     }
/* 29:33 */     InputStream input = null;
/* 30:34 */     this.prop = new Properties();
/* 31:   */     try
/* 32:   */     {
/* 33:36 */       input = cl.getResourceAsStream(path);
/* 34:37 */       this.prop.load(input); return;
/* 35:   */     }
/* 36:   */     catch (IOException e)
/* 37:   */     {
/* 38:39 */       throw new RuntimeException("get class load to load sqlTemplate.xml error," + e.getMessage());
/* 39:   */     }
/* 40:   */     finally
/* 41:   */     {
/* 42:41 */       if (input != null) {
/* 43:   */         try
/* 44:   */         {
/* 45:43 */           input.close();
/* 46:   */         }
/* 47:   */         catch (IOException e) {}
/* 48:   */       }
/* 49:   */     }
/* 50:   */   }
/* 51:   */   
/* 52:   */   public SqlTemplateService(Map<String, String> config)
/* 53:   */   {
/* 54:55 */     this.prop = new Properties();
/* 55:56 */     if (config != null) {
/* 56:57 */       this.prop.putAll(config);
/* 57:   */     }
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String getValue(String key)
/* 61:   */   {
/* 62:62 */     if (StringUtils.isBlank(key)) {
/* 63:63 */       return null;
/* 64:   */     }
/* 65:65 */     String config = this.prop.getProperty(key);
/* 66:66 */     return config;
/* 67:   */   }
/* 68:   */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.utils.SqlTemplateService
 * JD-Core Version:    0.7.0.1
 */