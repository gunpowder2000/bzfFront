package com.company.dao.goods.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.goods.GoodsBean;
import com.company.dao.goods.GoodsDao;
import com.company.utils.ConnectionManage;

public class GoodsDaoImpl extends ConnectionManage implements GoodsDao  {

	// 查询商品头展示内容（分页）

	/* (non-Javadoc)
	 * @see com.company.dao.goods.impl.GoodsDao#querygoods(java.lang.String, int, int)
	 */
	@Override
	public List<GoodsBean> querygoods( String catcode, int page, int listNum){
		
		int start = (page-1)*listNum+1;
		int end = page*listNum;
		
		List<GoodsBean> result=new ArrayList<GoodsBean>();
		try {
			conn = init(1);
			String sql = "select * from " 
					+ "(select row_number() over( order by goods_id desc) rn,goods_id,goods_name,goods_digest,goods_pic from tbl_goods where goods_cat_code like ?+'%'  ) x " 
					+ "where x.rn >= ? and x.rn <= ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, catcode);
			ps.setInt(2, start);
			ps.setInt(3, end);
			rs = ps.executeQuery();

			while (rs.next()) {
				GoodsBean goods = new GoodsBean();
				goods.setGoodsid(rs.getString("goods_id"));
				goods.setGoodsname(rs.getString("goods_name"));
				goods.setGoodsdigest(rs.getString("goods_digest"));
				goods.setGoodspic(rs.getString("goods_pic"));
				result.add(goods);
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
	
	
	// 查询商品头展示内容（总数）

	/* (non-Javadoc)
	 * @see com.company.dao.goods.impl.GoodsDao#querygoodstotal(java.lang.String)
	 */
	@Override
	public int querygoodstotal(String catcode){
		
		int result = 0;

		try {
			conn = init(1);
			String sql = "select count(*) from  " 
					+ "(select goods_id,goods_name,goods_digest,goods_pic from tbl_goods where goods_cat_code like ?+'%'  ) x ";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, catcode);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = rs.getInt(1);
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
	
	
	// 面包屑 （类别）
	public String querycat(String catcode){
		
		String result = "";

		try {
			conn = init(1);
			String sql = "select goods_cat_name from tbl_goods_cat where goods_cat_code =?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, catcode);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = rs.getString(1);
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

	
	// 商品明细内容展示
	public GoodsBean querygoodsdetail( String goodsid){
		
		GoodsBean result = new GoodsBean();
		try {
			conn = init(1);
			String sql = "select distinct ta.goods_id,ta.goods_name,ta.goods_digest,ta.goods_pic, " +
					"ta.goods_param,ta.goods_yinian,ta.goods_cat_code,tb.goods_cat_name, " +
					"tc.goods_cat_father_code,td.goods_cat_name as goods_cat_father_name " +
					"from tbl_goods	ta " +
					"left join tbl_goods_cat		tb " +
					"on ta.goods_cat_code = tb.goods_cat_code " +
					"left join tbl_goods_cat		tc " +
					"on tb.goods_cat_father_code = tc.goods_cat_father_code " +
					"left join tbl_goods_cat		td " +
					"on tc.goods_cat_father_code = td.goods_cat_code  where goods_id =?  ";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, goodsid);
			rs = ps.executeQuery();

			while (rs.next()) {
				
				result.setGoodsid(rs.getString("goods_id"));
				result.setGoodsname(rs.getString("goods_name"));
				result.setGoodsdigest(rs.getString("goods_digest"));
				result.setGoodspic(rs.getString("goods_pic"));
				result.setGoodsparam(rs.getString("goods_param"));
				result.setGoodsyinian(rs.getString("goods_yinian"));
				result.setGoodscatcode(rs.getString("goods_cat_code"));
				result.setGoodscatname(rs.getString("goods_cat_name"));
				result.setGoodsfathercatcode(rs.getString("goods_cat_father_code"));
				result.setGoodsfathercatname(rs.getString("goods_cat_father_name"));
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
