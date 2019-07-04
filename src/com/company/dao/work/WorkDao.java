package com.company.dao.work;

import java.util.List;

import com.company.bean.work.WorkBean;

public interface WorkDao {

	public abstract List<WorkBean> querywork(int page, int listNum);

	public abstract int queryworktotal();

	public abstract WorkBean queryworkdetail(String workid);

}