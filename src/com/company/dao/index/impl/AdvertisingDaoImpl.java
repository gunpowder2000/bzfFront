package com.company.dao.index.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.index.AdvertisingBean;
import com.company.dao.index.AdvertisingDao;
import com.company.utils.ConnectionManage;

public class AdvertisingDaoImpl extends ConnectionManage implements AdvertisingDao  {

	// 查询焦点广告展示内容
	/* (non-Javadoc)
	 * @see com.company.dao.index.impl.AdvertisingDao#queryAd()
	 */
	@Override
	public List<AdvertisingBean> queryAd(){
		
		List<AdvertisingBean> result = new ArrayList<AdvertisingBean>();
		
		try {
			conn = init(1);
			String sql = "select index_id,index_title,index_image,index_image_url " +
					"from tbl_index ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				AdvertisingBean adBean=new AdvertisingBean();
				adBean.setAdid(rs.getString("index_id"));
				adBean.setAdtitle(rs.getString("index_title"));
				adBean.setAdimage(rs.getString("index_image"));
				adBean.setAdurl(rs.getString("index_image_url"));
				result.add(adBean);
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
