package com.company.dao.goods;

import java.util.List;

import com.company.bean.goods.GoodsBean;

public interface GoodsDao {

	public abstract List<GoodsBean> querygoods(String catcode, int page,
			int listNum);

	public abstract int querygoodstotal(String catcode);
	
	public abstract String querycat(String catcode);

	public abstract GoodsBean querygoodsdetail( String goodsid);
}