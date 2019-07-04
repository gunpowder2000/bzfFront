package com.company.bean.goods;

public class GoodsBean {
	private String goodsid;
	private String goodsname;
	private String goodsdigest;
	private String goodspic;
	private String goodsparam;
	private String goodsyinian;
	private String goodscatcode;
	private String goodscatname;
	private String goodsfathercatcode;
	private String goodsfathercatname;
	
	public GoodsBean(){
		super();
	}

	public GoodsBean(String goodsid, String goodsname, String goodsdigest,
			String goodspic, String goodsparam, String goodsyinian,
			String goodscatcode, String goodscatname,
			String goodsfathercatcode, String goodsfathercatname) {
		super();
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsdigest = goodsdigest;
		this.goodspic = goodspic;
		this.goodsparam = goodsparam;
		this.goodsyinian = goodsyinian;
		this.goodscatcode = goodscatcode;
		this.goodscatname = goodscatname;
		this.goodsfathercatcode = goodsfathercatcode;
		this.goodsfathercatname = goodsfathercatname;
	}

	public String getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getGoodsdigest() {
		return goodsdigest;
	}

	public void setGoodsdigest(String goodsdigest) {
		this.goodsdigest = goodsdigest;
	}

	public String getGoodspic() {
		return goodspic;
	}

	public void setGoodspic(String goodspic) {
		this.goodspic = goodspic;
	}

	public String getGoodsparam() {
		return goodsparam;
	}

	public void setGoodsparam(String goodsparam) {
		this.goodsparam = goodsparam;
	}

	public String getGoodsyinian() {
		return goodsyinian;
	}

	public void setGoodsyinian(String goodsyinian) {
		this.goodsyinian = goodsyinian;
	}

	public String getGoodscatcode() {
		return goodscatcode;
	}

	public void setGoodscatcode(String goodscatcode) {
		this.goodscatcode = goodscatcode;
	}

	public String getGoodscatname() {
		return goodscatname;
	}

	public void setGoodscatname(String goodscatname) {
		this.goodscatname = goodscatname;
	}

	public String getGoodsfathercatcode() {
		return goodsfathercatcode;
	}

	public void setGoodsfathercatcode(String goodsfathercatcode) {
		this.goodsfathercatcode = goodsfathercatcode;
	}

	public String getGoodsfathercatname() {
		return goodsfathercatname;
	}

	public void setGoodsfathercatname(String goodsfathercatname) {
		this.goodsfathercatname = goodsfathercatname;
	}

}
