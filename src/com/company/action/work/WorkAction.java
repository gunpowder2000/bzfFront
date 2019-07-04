package com.company.action.work;

import java.util.List;

import com.company.action.base.BaseAction;
import com.company.bean.work.WorkBean;
import com.company.service.work.WorkService;
import com.company.service.work.impl.WorkServiceImpl;

public class WorkAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<WorkBean> workList;
	private WorkBean workBean;
	int worktotal;
	
	public List<WorkBean> getWorkList() {
		return workList;
	}

	public void setWorkList(List<WorkBean> workList) {
		this.workList = workList;
	}

	public WorkBean getWorkBean() {
		return workBean;
	}

	public void setWorkBean(WorkBean workBean) {
		this.workBean = workBean;
	}

	public int getWorktotal() {
		return worktotal;
	}

	public void setWorktotal(int worktotal) {
		this.worktotal = worktotal;
	}
	

	//	人才招聘列表页面跳转
	public String loadWork(){
		int num = 0;
		int page = 1;
		if(request.getParameter("page") == null){
			page = 1;
		} else {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		WorkService workService = new WorkServiceImpl();
		
		//设置分页文章（每页6条记录）
		setWorkList(workService.querywork(page, 6));
		//设置分页总数
		num = workService.queryworktotal();
		
		if(num%6 > 0){
			num = num/6+1;
		} else {
			num = num/6;
		}
		setWorktotal(num);
		
		return "loadWork";
	}
	
	//	人才招聘明细页面跳转
	public String loadWorkDetail(){
		String workid = request.getParameter("workid");

		WorkService workService = new WorkServiceImpl();

		setWorkBean(workService.queryworkdetail(workid));
		
		return "loadWorkDetial";
	}
}
