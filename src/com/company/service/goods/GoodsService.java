package com.company.service.goods;

import java.util.List;

import com.company.bean.goods.GoodsBean;

public interface GoodsService {

	// 查询商品头展示内容（分页）
	public abstract List<GoodsBean> querygoods(String catcode, int page,
			int listNum);

	// 查询商品头展示内容（总数）
	public abstract int querygoodstotal(String catcode);

	// 面包屑 （类别）
	public abstract String querycat(String catcode);
	
	//商品明细内容展示
	public abstract GoodsBean querygoodsdetail(String goodsid);
}