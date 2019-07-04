package com.company.action.goods;

import java.util.List;

import com.company.action.base.BaseAction;
import com.company.bean.cat.CatBean;
import com.company.bean.goods.GoodsBean;
import com.company.service.cat.CatService;
import com.company.service.cat.impl.CatServiceImpl;
import com.company.service.goods.GoodsService;
import com.company.service.goods.impl.GoodsServiceImpl;

public class GoodsAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CatBean> catFirList;
	private List<CatBean> catSecList;
	
	private List<GoodsBean> goodsList;
	int goodstotal;

	private String bigCatName;
	private String midCatName;
	
	private GoodsBean goodsBean;
	
	public List<CatBean> getCatFirList() {
		return catFirList;
	}

	public void setCatFirList(List<CatBean> catFirList) {
		this.catFirList = catFirList;
	}

	public List<CatBean> getCatSecList() {
		return catSecList;
	}

	public void setCatSecList(List<CatBean> catSecList) {
		this.catSecList = catSecList;
	}

	public List<GoodsBean> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsBean> goodsList) {
		this.goodsList = goodsList;
	}
	
	public int getGoodstotal() {
		return goodstotal;
	}

	public void setGoodstotal(int goodstotal) {
		this.goodstotal = goodstotal;
	}

	public String getBigCatName() {
		return bigCatName;
	}

	public void setBigCatName(String bigCatName) {
		this.bigCatName = bigCatName;
	}

	public String getMidCatName() {
		return midCatName;
	}

	public void setMidCatName(String midCatName) {
		this.midCatName = midCatName;
	}

	public GoodsBean getGoodsBean() {
		return goodsBean;
	}

	public void setGoodsBean(GoodsBean goodsBean) {
		this.goodsBean = goodsBean;
	}

	//  跳转商品列表
	public String loadGoods(){
		int num = 0;
		int page = 1;
		String catcode = "";
		
		if(request.getParameter("catcode") == null){
			catcode = "%";
		} else {
			catcode = request.getParameter("catcode");
		}
		
		
		
		if(request.getParameter("page") == null){
			page = 1;
		} else {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		CatService catService = new CatServiceImpl();
		GoodsService goodsService = new GoodsServiceImpl();
		
		setCatFirList(catService.queryCatFir());
		setCatSecList(catService.queryCatSec());
		
		// 设置面包屑
		if("%".endsWith(catcode)){
			setBigCatName("");
			setMidCatName("");
		} else if(catcode.length() > 4){
			setBigCatName("&gt;"+goodsService.querycat(catcode.substring(0,4)));
			setMidCatName("&gt;"+goodsService.querycat(catcode));
		} else if(catcode.length() == 4){
			setBigCatName("&gt;"+goodsService.querycat(catcode));
			setMidCatName("");
		}
		
		//设置分页文章（每页6条记录）
		setGoodsList(goodsService.querygoods(catcode, page, 6));
		//设置分页总数
		num = goodsService.querygoodstotal(catcode);
		
		if(num%6 > 0){
			num = num/6+1;
		} else {
			num = num/6;
		}
		setGoodstotal(num);
		
		return "loadGoods";
	}

	
	//	商品明细页面跳转
	public String loadGoodsDetail(){
		String goodsid = request.getParameter("goodsid");

		CatService catService = new CatServiceImpl();
		GoodsService goodsService = new GoodsServiceImpl();

		setCatFirList(catService.queryCatFir());
		setCatSecList(catService.queryCatSec());
		
		setGoodsBean(goodsService.querygoodsdetail(goodsid));
		
		return "loadGoodsDetial";
	}
}
