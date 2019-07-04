package com.company.service.top;

import java.util.List;

import com.company.bean.top.TopBean;

public interface TopService {

	// 查询top展示内容
	public abstract List<TopBean> querytop();

}