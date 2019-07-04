package com.company.dao.about.impl;


import java.sql.SQLException;

import com.company.bean.about.AboutBean;
import com.company.dao.about.AboutDao;
import com.company.utils.ConnectionManage;

public class AboutDaoImpl extends ConnectionManage implements AboutDao {

	// 查询关于公司展示内容
	/* (non-Javadoc)
	 * @see com.company.dao.about.impl.AboutDao#queryAbout(java.lang.String)
	 */
	@Override
	public AboutBean queryAbout(String abouttype){
		
		AboutBean result=new AboutBean();
		try {
			conn = init(1);
			String sql = "select document_id,document_title,document_type_code,document_content,document_digest " +
					"from tbl_document " +
					"where document_type_code =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, abouttype);
			rs = ps.executeQuery();

			while (rs.next()) {
				result.setAboutid(rs.getString("document_id"));
				result.setAbouttitle(rs.getString("document_title"));
				result.setAbouttype(rs.getString("document_type_code"));
				result.setAboutcontent(rs.getString("document_content"));
				result.setAboutdigest(rs.getString("document_digest"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
}
