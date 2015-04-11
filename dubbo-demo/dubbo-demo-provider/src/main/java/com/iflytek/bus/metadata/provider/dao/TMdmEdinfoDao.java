/*   1:    */ package com.iflytek.bus.metadata.provider.dao;
/*   2:    */ 
/*   3:    */ import com.alibaba.dubbo.common.utils.StringUtils;
/*   4:    */ import com.iflytek.bus.metadata.provider.domain.TMdmEdinfo;
/*   5:    */ import com.iflytek.bus.metadata.provider.utils.DateUtil;
/*   6:    */ import com.iflytek.iframework.orm.hibernate.HibernateEntityDao;
/*   7:    */ import java.util.List;
/*   8:    */ import org.hibernate.SQLQuery;
/*   9:    */ 
/*  10:    */ public class TMdmEdinfoDao
/*  11:    */   extends HibernateEntityDao<TMdmEdinfo>
/*  12:    */ {
/*  13:    */   public String getOtherYxxByEdname(String edname, String sstype, Long projectid)
/*  14:    */   {
/*  15: 33 */     String hql = "from TMdmEdinfo where edname=? and sstype=? and projectid=?";
/*  16: 34 */     List<TMdmEdinfo> edinfos = super.find(hql, new Object[] { edname, sstype, projectid });
/*  17: 35 */     return edinfos.size() > 0 ? ((TMdmEdinfo)edinfos.get(0)).getYxx() : "";
/*  18:    */   }
/*  19:    */   
/*  20:    */   public String getJiShuYxxByEdname(String edname, String sstype, Long projectid, Long sourceid, String sz)
/*  21:    */   {
/*  22: 53 */     String hql = "from TMdmEdinfo where UPPER(edname)=? and sstype=? and projectid=? and sourceid=? and UPPER(sz)=?";
/*  23: 54 */     List<TMdmEdinfo> edinfos = super.find(hql, new Object[] { edname, sstype, projectid, sourceid, sz });
/*  24: 55 */     return edinfos.size() > 0 ? ((TMdmEdinfo)edinfos.get(0)).getYxx() : "";
/*  25:    */   }
/*  26:    */   
/*  27:    */   public Long jsMetadataUniqueness(Long projectId, String mdType, String mdName, Long datasourceId, String sz)
/*  28:    */   {
/*  29: 74 */     StringBuffer hql = new StringBuffer();
/*  30: 75 */     hql.append("from TMdmEdinfo where projectid=? and sstype=? and UPPER(edname) =? and sourceid=? and UPPER(sz)=?");
/*  31: 76 */     return Long.valueOf(countHqlResult(hql.toString(), new Object[] { projectId, mdType, mdName, datasourceId, sz }));
/*  32:    */   }
/*  33:    */   
/*  34:    */   public Long otherMetadataUniqueness(Long projectId, String mdType, String mdName)
/*  35:    */   {
/*  36: 92 */     StringBuffer hql = new StringBuffer();
/*  37: 93 */     hql.append("from TMdmEdinfo where projectid=? and sstype=? and edname =?");
/*  38: 94 */     return Long.valueOf(countHqlResult(hql.toString(), new Object[] { projectId, mdType, mdName }));
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getZdNameByCode(String lxjp, String code)
/*  42:    */   {
/*  43:103 */     String sql = "select mc from t_mdm_zd where lxjp = ? and dm = ?";
/*  44:104 */     return super.createSqlQuery(sql, new Object[] { lxjp, code }).uniqueResult().toString();
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setMetadataZymlFlag(Long objectid)
/*  48:    */   {
/*  49:117 */     TMdmEdinfo edinfo = (TMdmEdinfo)super.findUniqueBy("objectid", objectid);
/*  50:118 */     if (edinfo != null)
/*  51:    */     {
/*  52:119 */       edinfo.setIsdirectory("1");
/*  53:120 */       edinfo.setUpdatetime(DateUtil.getGabDate());
/*  54:121 */       super.saveOrUpdate(edinfo);
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<TMdmEdinfo> getDictTableList(Long projectId, String edname, String description)
/*  59:    */   {
/*  60:132 */     String hql = "from TMdmEdinfo where yxx='1' and edattribute like '%\"dataTable_lylx\":\"4\"%'";
/*  61:133 */     if (projectId != null) {
/*  62:134 */       hql = hql + " and projectid = " + projectId;
/*  63:    */     }
/*  64:136 */     if (StringUtils.isNotEmpty(edname)) {
/*  65:137 */       hql = hql + " and edname like '%" + edname + "%'";
/*  66:    */     }
/*  67:139 */     if (StringUtils.isNotEmpty(description)) {
/*  68:140 */       hql = hql + " and descriptions like '%" + description + "%'";
/*  69:    */     }
/*  70:142 */     hql = hql + " order by objectid";
/*  71:143 */     return super.find(hql, new Object[0]);
/*  72:    */   }
/*  73:    */ }


/* Location:           E:\doc\project\cqga\共享平台\共享平台测试环境\dubbo-provider-2.5.3\providers\metadata-provider-1.1.4.jar
 * Qualified Name:     com.iflytek.bus.metadata.provider.dao.TMdmEdinfoDao
 * JD-Core Version:    0.7.0.1
 */