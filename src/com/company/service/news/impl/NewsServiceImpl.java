package com.company.service.news.impl;

import java.util.List;

import com.company.bean.news.NewsBean;
import com.company.dao.news.NewsDao;
import com.company.dao.news.impl.NewsDaoImpl;
import com.company.service.news.NewsService;

public class NewsServiceImpl implements NewsService  {

	// 查询新闻头展示内容（分页）
	/* (non-Javadoc)
	 * @see com.company.service.news.impl.NewsService#queryJoin(int, int)
	 */
	@Override
	public List<NewsBean> querynews(int page, int listNum){
		NewsDao  newsDao = new NewsDaoImpl();
		List<NewsBean> result = newsDao.querynews(page, listNum);
		
		return result;
	}
	
	// 查询新闻头展示内容（总数）
	/* (non-Javadoc)
	 * @see com.company.service.news.impl.NewsService#querynewstotal()
	 */
	@Override
	public int querynewstotal(){
		NewsDao  newsDao = new NewsDaoImpl();
		int result = newsDao.querynewstotal();
		
		return result;
	}
	
	// 查询新闻头展示内容（明细）
	public NewsBean querynewsdetail(String newsid){
		NewsDao  newsDao = new NewsDaoImpl();
		NewsBean result = newsDao.querynewsdetail(newsid);
		
		return result;
	}
}
