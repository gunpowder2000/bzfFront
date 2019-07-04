package com.company.bean.news;

public class NewsBean {

	private String newsid;
	private String newstitle;
	private String newsdigest;
	private String newsdigestimage;
	private String newscontent;
	private String newsdate;
	
	public NewsBean(){
		super();
	}
	
	public NewsBean(String newsid, String newstitle, String newsdigest,
			String newsdigestimage, String newscontent, String newsdate) {
		super();
		this.newsid = newsid;
		this.newstitle = newstitle;
		this.newsdigest = newsdigest;
		this.newsdigestimage = newsdigestimage;
		this.newscontent = newscontent;
		this.newsdate = newsdate;
	}

	public String getNewsid() {
		return newsid;
	}

	public void setNewsid(String newsid) {
		this.newsid = newsid;
	}

	public String getNewstitle() {
		return newstitle;
	}

	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}

	public String getNewsdigest() {
		return newsdigest;
	}

	public void setNewsdigest(String newsdigest) {
		this.newsdigest = newsdigest;
	}

	public String getNewsdigestimage() {
		return newsdigestimage;
	}

	public void setNewsdigestimage(String newsdigestimage) {
		this.newsdigestimage = newsdigestimage;
	}

	public String getNewscontent() {
		return newscontent;
	}

	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}

	public String getNewsdate() {
		return newsdate;
	}

	public void setNewsdate(String newsdate) {
		this.newsdate = newsdate;
	}
}
