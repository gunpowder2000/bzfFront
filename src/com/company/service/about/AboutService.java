package com.company.service.about;

import com.company.bean.about.AboutBean;

public interface AboutService {

	// 查询关于公司展示内容
	public abstract AboutBean queryAbout(String abouttype);

}