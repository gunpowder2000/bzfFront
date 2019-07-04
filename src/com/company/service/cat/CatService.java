package com.company.service.cat;

import java.util.List;

import com.company.bean.cat.CatBean;

public interface CatService {

	// 查询商品一级类别
	public abstract List<CatBean> queryCatFir();

	// 查询商品二级类别
	public abstract List<CatBean> queryCatSec();

}