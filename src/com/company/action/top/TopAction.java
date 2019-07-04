package com.company.action.top;

import java.util.List;

import com.company.action.base.BaseAction;
import com.company.bean.top.TopBean;
import com.company.service.top.TopService;
import com.company.service.top.impl.TopServiceImpl;

public class TopAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<TopBean> topList;

	public List<TopBean> getTopList() {
		return topList;
	}
	
	public void setTopList(List<TopBean> topList) {
		this.topList = topList;
	}



	//  跳转top页面
	public String loadTop(){
		TopService topService = new TopServiceImpl();
		
		setTopList(topService.querytop());

		return "loadTop";
	}
}
