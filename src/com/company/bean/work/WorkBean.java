package com.company.bean.work;

public class WorkBean {
	private String workid;
	private String worktitle;
	private String workdigest;
	private String workcontent;
	private String workdate;
	
	public WorkBean(){
		super();
	}
	
	public WorkBean(String workid, String worktitle, String workdigest,
			String workcontent, String workdate) {
		super();
		this.workid = workid;
		this.worktitle = worktitle;
		this.workdigest = workdigest;
		this.workcontent = workcontent;
		this.workdate = workdate;
	}

	public String getWorkid() {
		return workid;
	}

	public void setWorkid(String workid) {
		this.workid = workid;
	}

	public String getWorktitle() {
		return worktitle;
	}

	public void setWorktitle(String worktitle) {
		this.worktitle = worktitle;
	}

	public String getWorkdigest() {
		return workdigest;
	}

	public void setWorkdigest(String workdigest) {
		this.workdigest = workdigest;
	}

	public String getWorkcontent() {
		return workcontent;
	}

	public void setWorkcontent(String workcontent) {
		this.workcontent = workcontent;
	}

	public String getWorkdate() {
		return workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}
}
