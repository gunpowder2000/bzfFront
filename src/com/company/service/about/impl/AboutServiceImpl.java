package com.company.service.about.impl;

import com.company.bean.about.AboutBean;
import com.company.dao.about.AboutDao;
import com.company.dao.about.impl.AboutDaoImpl;
import com.company.service.about.AboutService;

public class AboutServiceImpl implements AboutService {

	// 查询关于公司展示内容
	/* (non-Javadoc)
	 * @see com.company.service.about.impl.AboutService#queryAbout(java.lang.String)
	 */
	@Override
	public AboutBean queryAbout(String abouttype){
		AboutDao  aboutDao = new AboutDaoImpl();
		AboutBean result = aboutDao.queryAbout(abouttype);
		
		return result;
	}
}
