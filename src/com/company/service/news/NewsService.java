package com.company.service.news;

import java.util.List;

import com.company.bean.news.NewsBean;

public interface NewsService {

	// 查询新闻头展示内容（分页）
	public abstract List<NewsBean> querynews(int page, int listNum);

	// 查询新闻头展示内容（总数）
	public abstract int querynewstotal();

	// 查询新闻头展示内容（明细）
	public abstract NewsBean querynewsdetail(String newsid);
}