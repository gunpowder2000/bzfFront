package com.company.service.work;

import java.util.List;

import com.company.bean.work.WorkBean;

public interface WorkService {

	// 查询人才招聘头展示内容（分页）
	public abstract List<WorkBean> querywork(int page, int listNum);

	// 查询人才招聘头展示内容（总数）
	public abstract int queryworktotal();

	// 查询人才招聘展示内容（明细）
	public abstract WorkBean queryworkdetail(String workid);

}