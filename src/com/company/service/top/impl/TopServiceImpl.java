package com.company.service.top.impl;

import java.util.List;

import com.company.bean.top.TopBean;
import com.company.dao.top.TopDao;
import com.company.dao.top.impl.TopDaoImpl;
import com.company.service.top.TopService;

public class TopServiceImpl implements TopService  {
	
	// 查询top展示内容
	/* (non-Javadoc)
	 * @see com.company.service.top.impl.TopService#querytop()
	 */
	@Override
	public List<TopBean> querytop(){
		TopDao  topDao = new TopDaoImpl();
		List<TopBean> result = topDao.queryTop();
		
		return result;
	}
}
