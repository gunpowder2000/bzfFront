package com.company.service.index.impl;

import java.util.List;

import com.company.bean.index.AdvertisingBean;
import com.company.dao.index.AdvertisingDao;
import com.company.dao.index.impl.AdvertisingDaoImpl;
import com.company.service.index.AdvertisingService;

public class AdvertisingServiceImpl implements AdvertisingService  {

	// 查询焦点广告展示内容
	/* (non-Javadoc)
	 * @see com.company.service.index.impl.AdvertisingService#queryAd()
	 */
	@Override
	public List<AdvertisingBean> queryAd(){
		AdvertisingDao  advertisingDao = new AdvertisingDaoImpl();
		List<AdvertisingBean> result = advertisingDao.queryAd();
		
		return result;
	}
}
