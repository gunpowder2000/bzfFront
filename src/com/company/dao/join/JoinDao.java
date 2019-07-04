package com.company.dao.join;

import com.company.bean.join.JoinBean;

public interface JoinDao {

	// 查询家加盟方式展示内容
	public abstract JoinBean queryJoin(String jointype);

}