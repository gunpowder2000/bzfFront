package com.company.service.work.impl;

import java.util.List;

import com.company.bean.work.WorkBean;
import com.company.dao.work.WorkDao;
import com.company.dao.work.impl.WorkDaoImpl;
import com.company.service.work.WorkService;

public class WorkServiceImpl implements WorkService  {

	// 查询人才招聘头展示内容（分页）
	/* (non-Javadoc)
	 * @see com.company.service.work.impl.WorkService#querywork(int, int)
	 */
	@Override
	public List<WorkBean> querywork(int page, int listNum){
		WorkDao  workDao = new WorkDaoImpl();
		List<WorkBean> result = workDao.querywork(page, listNum);
		
		return result;
	}
	
	// 查询人才招聘头展示内容（总数）
	/* (non-Javadoc)
	 * @see com.company.service.work.impl.WorkService#queryworktotal()
	 */
	@Override
	public int queryworktotal(){
		WorkDao  workDao = new WorkDaoImpl();
		int result = workDao.queryworktotal();
		
		return result;
	}
	
	// 查询人才招聘展示内容（明细）
	/* (non-Javadoc)
	 * @see com.company.service.work.impl.WorkService#queryworkdetail(java.lang.String)
	 */
	@Override
	public WorkBean queryworkdetail(String workid){
		WorkDao  workDao = new WorkDaoImpl();
		WorkBean result = workDao.queryworkdetail(workid);
		
		return result;
	}
}
