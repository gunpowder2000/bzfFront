package com.company.service.index;

import java.util.List;

import com.company.bean.index.AdvertisingBean;

public interface AdvertisingService {

	// 查询焦点广告展示内容
	public abstract List<AdvertisingBean> queryAd();

}