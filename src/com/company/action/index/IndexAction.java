package com.company.action.index;

import java.util.List;

import com.company.action.base.BaseAction;
import com.company.bean.index.AdvertisingBean;
import com.company.service.index.AdvertisingService;
import com.company.service.index.impl.AdvertisingServiceImpl;

public class IndexAction  extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<AdvertisingBean> adList;

	public List<AdvertisingBean> getAdList() {
		return adList;
	}

	public void setAdList(List<AdvertisingBean> adList) {
		this.adList = adList;
	}


	// 首页加载
	public String index() {
		AdvertisingService adService = new AdvertisingServiceImpl();
		setAdList(adService.queryAd());
		
		return SUCCESS;
	}
}
