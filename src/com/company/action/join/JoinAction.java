package com.company.action.join;

import com.company.action.base.BaseAction;
import com.company.bean.join.JoinBean;
import com.company.service.join.JoinService;
import com.company.service.join.impl.JoinServiceImpl;

public class JoinAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JoinBean joinBean;

	public JoinBean getJoinBean() {
		return joinBean;
	}

	public void setJoinBean(JoinBean joinBean) {
		this.joinBean = joinBean;
	}




	//  跳转加盟方式
	public String loadJoin(){
		String jointype = request.getParameter("sta");
		JoinService joinService = new JoinServiceImpl();
		
		setJoinBean(joinService.queryJoin(jointype));

		return "loadJoin";
	}
}
