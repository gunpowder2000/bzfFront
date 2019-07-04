package com.company.dao.about;

import com.company.bean.about.AboutBean;

public interface AboutDao {

	// 查询关于公司展示内容
	public abstract AboutBean queryAbout(String abouttype);

}