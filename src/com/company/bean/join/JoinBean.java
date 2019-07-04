package com.company.bean.join;

public class JoinBean {
	private String joinid;			//加盟方式ID
	private String jointitle;		//加盟方式标题
	private String jointype;		//加盟方式类型
	private String joincontent;	//加盟方式正文
	private String joindigest;		//加盟方式说明
	
	public JoinBean(){
		super();
	}

	public JoinBean(String joinid, String jointitle, String jointype,
			String joincontent, String joindigest) {
		super();
		this.joinid = joinid;
		this.jointitle = jointitle;
		this.jointype = jointype;
		this.joincontent = joincontent;
		this.joindigest = joindigest;
	}

	public String getJoinid() {
		return joinid;
	}

	public void setJoinid(String joinid) {
		this.joinid = joinid;
	}

	public String getJointitle() {
		return jointitle;
	}

	public void setJointitle(String jointitle) {
		this.jointitle = jointitle;
	}

	public String getJointype() {
		return jointype;
	}

	public void setJointype(String jointype) {
		this.jointype = jointype;
	}

	public String getJoincontent() {
		return joincontent;
	}

	public void setJoincontent(String joincontent) {
		this.joincontent = joincontent;
	}

	public String getJoindigest() {
		return joindigest;
	}

	public void setJoindigest(String joindigest) {
		this.joindigest = joindigest;
	}
}
