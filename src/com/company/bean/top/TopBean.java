package com.company.bean.top;

public class TopBean {
	private String topid;
	private String topname;
	
	public TopBean(){
		super();
	}
	
	public TopBean(String topid, String topname) {
		super();
		this.topid = topid;
		this.topname = topname;
	}

	public String getTopid() {
		return topid;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public String getTopname() {
		return topname;
	}

	public void setTopname(String topname) {
		this.topname = topname;
	}
}
