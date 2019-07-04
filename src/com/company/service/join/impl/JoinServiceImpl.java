package com.company.service.join.impl;

import com.company.bean.join.JoinBean;
import com.company.dao.join.JoinDao;
import com.company.dao.join.impl.JoinDaoImpl;
import com.company.service.join.JoinService;

public class JoinServiceImpl implements JoinService {

	// 查询加盟方式展示内容

	/* (non-Javadoc)
	 * @see com.company.service.join.impl.JoinService#queryJoin(java.lang.String)
	 */
	@Override
	public JoinBean queryJoin(String jointype){
		JoinDao  joinDao = new JoinDaoImpl();
		JoinBean result = joinDao.queryJoin(jointype);
		
		return result;
	}
}
