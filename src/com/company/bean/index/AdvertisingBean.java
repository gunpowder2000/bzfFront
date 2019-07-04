package com.company.bean.index;

public class AdvertisingBean {
	private String adid;
	private String adtitle;
	private String adimage;
	private String adurl;
	
	public AdvertisingBean(){
		super();
	}
	
	public AdvertisingBean(String adid, String adtitle, String adimage,
			String adurl) {
		super();
		this.adid = adid;
		this.adtitle = adtitle;
		this.adimage = adimage;
		this.adurl = adurl;
	}

	public String getAdid() {
		return adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}

	public String getAdtitle() {
		return adtitle;
	}

	public void setAdtitle(String adtitle) {
		this.adtitle = adtitle;
	}

	public String getAdimage() {
		return adimage;
	}

	public void setAdimage(String adimage) {
		this.adimage = adimage;
	}

	public String getAdurl() {
		return adurl;
	}

	public void setAdurl(String adurl) {
		this.adurl = adurl;
	}

}
