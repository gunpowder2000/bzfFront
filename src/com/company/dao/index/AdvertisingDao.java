package com.company.dao.index;

import java.util.List;

import com.company.bean.index.AdvertisingBean;

public interface AdvertisingDao {

	// 查询家焦点广告展示内容
	public abstract List<AdvertisingBean> queryAd();

}