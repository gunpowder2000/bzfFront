package com.company.dao.top;

import java.util.List;

import com.company.bean.top.TopBean;

public interface TopDao {

	// 查询top页面展示内容
	public abstract List<TopBean> queryTop();

}