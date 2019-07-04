package com.company.dao.news;

import java.util.List;

import com.company.bean.news.NewsBean;

public interface NewsDao {

	public abstract List<NewsBean> querynews(int page, int listNum);

	public abstract int querynewstotal();

	public abstract NewsBean querynewsdetail( String newsid);

}