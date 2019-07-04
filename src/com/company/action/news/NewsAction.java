package com.company.action.news;

import java.util.List;

import com.company.action.base.BaseAction;
import com.company.bean.news.NewsBean;
import com.company.service.news.NewsService;
import com.company.service.news.impl.NewsServiceImpl;

public class NewsAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<NewsBean> newsList;
	private NewsBean newsBean;
	int newstotal;
	
	

	public List<NewsBean> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsBean> newsList) {
		this.newsList = newsList;
	}

	public NewsBean getNewsBean() {
		return newsBean;
	}

	public void setNewsBean(NewsBean newsBean) {
		this.newsBean = newsBean;
	}

	public int getNewstotal() {
		return newstotal;
	}

	public void setNewstotal(int newstotal) {
		this.newstotal = newstotal;
	}

	
	//	品牌新闻列表页面跳转
	public String loadNews(){
		int num = 0;
		int page = 1;
		if(request.getParameter("page") == null){
			page = 1;
		} else {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		NewsService newsService = new NewsServiceImpl();
		
		//设置分页文章（每页6条记录）
		setNewsList(newsService.querynews(page, 6));
		//设置分页总数
		num = newsService.querynewstotal();
		
		if(num%6 > 0){
			num = num/6+1;
		} else {
			num = num/6;
		}
		setNewstotal(num);
		
		return "loadNews";
	}
	
	
	//	品牌新闻明细页面跳转
	public String loadNewsDetail(){
		String newsid = request.getParameter("newsid");

		NewsService newsService = new NewsServiceImpl();

		setNewsBean(newsService.querynewsdetail(newsid));
		
		return "loadNewsDetial";
	}
}
