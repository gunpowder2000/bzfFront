package com.company.dao.join.impl;


import java.sql.SQLException;

import com.company.bean.join.JoinBean;
import com.company.dao.join.JoinDao;
import com.company.utils.ConnectionManage;

public class JoinDaoImpl extends ConnectionManage implements JoinDao  {

	// 查询家加盟方式展示内容
	/* (non-Javadoc)
	 * @see com.company.dao.join.impl.JoinDao#queryJoin(java.lang.String)
	 */
	@Override
	public JoinBean queryJoin(String jointype){
		
		JoinBean result=new JoinBean();
		try {
			conn = init(1);
			String sql = "select document_id,document_title,document_type_code,document_content,document_digest " +
					"from tbl_document " +
					"where document_type_code =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, jointype);
			rs = ps.executeQuery();

			while (rs.next()) {
				result.setJoinid(rs.getString("document_id"));
				result.setJointitle(rs.getString("document_title"));
				result.setJointype(rs.getString("document_type_code"));
				result.setJoincontent(rs.getString("document_content"));
				result.setJoindigest(rs.getString("document_digest"));
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
