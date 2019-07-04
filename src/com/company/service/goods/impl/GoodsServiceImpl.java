package com.company.service.goods.impl;

import java.util.List;

import com.company.bean.goods.GoodsBean;
import com.company.dao.goods.GoodsDao;
import com.company.dao.goods.impl.GoodsDaoImpl;
import com.company.service.goods.GoodsService;

public class GoodsServiceImpl implements GoodsService  {

	// 查询商品头展示内容（分页）
	/* (non-Javadoc)
	 * @see com.company.service.goods.impl.GoodsService#querygoods(java.lang.String, int, int)
	 */
	@Override
	public List<GoodsBean> querygoods(String catcode, int page, int listNum){
		GoodsDao  goodsDao = new GoodsDaoImpl();
		List<GoodsBean> result = goodsDao.querygoods(catcode, page, listNum);
		
		return result;
	}
	
	// 查询商品头展示内容（总数）
	/* (non-Javadoc)
	 * @see com.company.service.goods.impl.GoodsService#querygoodstotal(java.lang.String)
	 */
	@Override
	public int querygoodstotal(String catcode){
		GoodsDao  goodsDao = new GoodsDaoImpl();
		int result = goodsDao.querygoodstotal(catcode);
		
		return result;
	}
	
	// 面包屑 （类别）
	public String querycat(String catcode){
		GoodsDao  goodsDao = new GoodsDaoImpl();
		String result = goodsDao.querycat(catcode);
		
		return result;
	}
	
	// 商品明细内容展示
	public GoodsBean querygoodsdetail(String goodsid){
		GoodsDao  goodsDao = new GoodsDaoImpl();
		GoodsBean result = goodsDao.querygoodsdetail(goodsid);
		
		return result;
	}
}
