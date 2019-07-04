package com.company.bean.about;

public class AboutBean {
	private String aboutid;			//关于公司ID
	private String abouttitle;		//关于公司标题
	private String abouttype;		//关于公司类型
	private String aboutcontent;	//关于公司正文
	private String aboutdigest;		//关于公司说明
	
	public AboutBean(){
		super();
	}
	
	public AboutBean(String aboutid, String abouttitle, String abouttype,
			String aboutcontent, String aboutdigest) {
		super();
		this.aboutid = aboutid;
		this.abouttitle = abouttitle;
		this.abouttype = abouttype;
		this.aboutcontent = aboutcontent;
		this.aboutdigest = aboutdigest;
	}

	public String getAboutid() {
		return aboutid;
	}

	public void setAboutid(String aboutid) {
		this.aboutid = aboutid;
	}

	public String getAbouttitle() {
		return abouttitle;
	}

	public void setAbouttitle(String abouttitle) {
		this.abouttitle = abouttitle;
	}

	public String getAbouttype() {
		return abouttype;
	}

	public void setAbouttype(String abouttype) {
		this.abouttype = abouttype;
	}

	public String getAboutcontent() {
		return aboutcontent;
	}

	public void setAboutcontent(String aboutcontent) {
		this.aboutcontent = aboutcontent;
	}

	public String getAboutdigest() {
		return aboutdigest;
	}

	public void setAboutdigest(String aboutdigest) {
		this.aboutdigest = aboutdigest;
	}
}
