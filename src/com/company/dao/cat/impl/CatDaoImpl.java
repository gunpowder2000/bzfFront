package com.company.dao.cat.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.cat.CatBean;
import com.company.dao.cat.CatDao;
import com.company.utils.ConnectionManage;

public class CatDaoImpl extends ConnectionManage implements CatDao {

	// 查询商品一级类别
	/* (non-Javadoc)
	 * @see com.company.dao.cat.impl.CatDao#queryCatFir()
	 */
	@Override
	public List<CatBean> queryCatFir(){
		List<CatBean> result = new ArrayList<CatBean>();
		
		try {
			conn = init(1);
			String sql = "select goods_cat_code,goods_cat_name,goods_cat_level,goods_cat_father_code " +
					"from tbl_goods_cat " +
					"where goods_cat_level ='1'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				CatBean cb=new CatBean();
				cb.setCatcode(rs.getString("goods_cat_code"));
				cb.setCatname(rs.getString("goods_cat_name"));
				cb.setCatlevel(rs.getString("goods_cat_level"));
				cb.setCatfathercode(rs.getString("goods_cat_father_code"));
				result.add(cb);
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
	
	
	// 查询商品二级类别
	/* (non-Javadoc)
	 * @see com.company.dao.cat.impl.CatDao#queryCatSec()
	 */
	@Override
	public List<CatBean> queryCatSec(){
		List<CatBean> result = new ArrayList<CatBean>();
		
		try {
			conn = init(1);
			String sql = "select goods_cat_code,goods_cat_name,goods_cat_level,goods_cat_father_code " +
					"from tbl_goods_cat " +
					"where goods_cat_level ='2'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				CatBean cb=new CatBean();
				cb.setCatcode(rs.getString("goods_cat_code"));
				cb.setCatname(rs.getString("goods_cat_name"));
				cb.setCatlevel(rs.getString("goods_cat_level"));
				cb.setCatfathercode(rs.getString("goods_cat_father_code"));
				result.add(cb);
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
