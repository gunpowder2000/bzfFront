package com.company.dao.news.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.news.NewsBean;
import com.company.dao.news.NewsDao;
import com.company.utils.ConnectionManage;

public class NewsDaoImpl extends ConnectionManage implements NewsDao  {

	// 查询新闻头展示内容（分页）

	/* (non-Javadoc)
	 * @see com.company.dao.news.impl.NewsDao#querynews(int, int)
	 */
	@Override
	public List<NewsBean> querynews( int page, int listNum){
		
		int start = (page-1)*listNum+1;
		int end = page*listNum;
		
		List<NewsBean> result=new ArrayList<NewsBean>();
		try {
			conn = init(1);
			String sql = "select * from " 
					+ "(select row_number() over( order by news_id desc) rn,news_id,news_title,news_digest,news_digest_image,news_date from tbl_news ) x " 
					+ "where x.rn >= ? and x.rn <= ?";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			rs = ps.executeQuery();

			while (rs.next()) {
				NewsBean news = new NewsBean();
				news.setNewsid(rs.getString("news_id"));
				news.setNewstitle(rs.getString("news_title"));
				news.setNewsdigest(rs.getString("news_digest"));
				news.setNewsdigestimage(rs.getString("news_digest_image"));
				news.setNewsdate(rs.getString("news_date"));
				result.add(news);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
	
	
	// 查询新闻头展示内容（总数）

	/* (non-Javadoc)
	 * @see com.company.dao.news.impl.NewsDao#querynewstotal()
	 */
	@Override
	public int querynewstotal( ){
		
		int result = 0;

		try {
			conn = init(1);
			String sql = "select count(*) from  " 
					+ "(select news_id,news_title,news_digest,news_digest_image,news_date from tbl_news ) x ";
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
	
	
	// 查询新闻展示内容（明细）
	public NewsBean querynewsdetail( String newsid){
		
		NewsBean result=new NewsBean();
		try {
			conn = init(1);
			String sql = "select news_id,news_title,news_digest,news_digest_image,news_content,news_date from tbl_news " 
					+ "where news_id =?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, newsid);
			rs = ps.executeQuery();

			while (rs.next()) {
				result.setNewsid(rs.getString("news_id"));
				result.setNewstitle(rs.getString("news_title"));
				result.setNewsdigest(rs.getString("news_digest"));
				result.setNewsdigestimage(rs.getString("news_digest_image"));
				result.setNewscontent(rs.getString("news_content"));
				result.setNewsdate(rs.getString("news_date"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
}
