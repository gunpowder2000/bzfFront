package com.company.dao.top.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.top.TopBean;
import com.company.dao.top.TopDao;
import com.company.utils.ConnectionManage;

public class TopDaoImpl extends ConnectionManage implements TopDao {

	// 查询top页面展示内容
	/* (non-Javadoc)
	 * @see com.company.dao.top.impl.TopDao#queryTop()
	 */
	@Override
	public List<TopBean> queryTop(){
		
		List<TopBean> result=new ArrayList<TopBean>();
		try {
			conn = init(1);
			String sql = "select goods_cat_code,goods_cat_name from tbl_goods_cat " +
					"where goods_cat_level =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "1");
			rs = ps.executeQuery();

			while (rs.next()) {
				TopBean tb = new TopBean();
				tb.setTopid(rs.getString("goods_cat_code"));
				tb.setTopname(rs.getString("goods_cat_name"));
				result.add(tb);
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
