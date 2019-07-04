package com.company.service.cat.impl;

import java.util.List;

import com.company.bean.cat.CatBean;
import com.company.dao.cat.CatDao;
import com.company.dao.cat.impl.CatDaoImpl;
import com.company.service.cat.CatService;

public class CatServiceImpl implements CatService  {

	// 查询商品一级类别
	/* (non-Javadoc)
	 * @see com.company.service.cat.impl.CatService#queryCatFir()
	 */
	@Override
	public List<CatBean> queryCatFir(){
		CatDao  catDao = new CatDaoImpl();
		 List<CatBean> result = catDao.queryCatFir();
		
		return result;
	}
	
	
	// 查询商品二级类别
		/* (non-Javadoc)
		 * @see com.company.service.cat.impl.CatService#queryCatSec()
		 */
		@Override
		public List<CatBean> queryCatSec(){
			CatDao  catDao = new CatDaoImpl();
			 List<CatBean> result = catDao.queryCatSec();
			
			return result;
		}
}
