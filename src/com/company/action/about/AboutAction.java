package com.company.action.about;

import com.company.action.base.BaseAction;
import com.company.bean.about.AboutBean;
import com.company.service.about.AboutService;
import com.company.service.about.impl.AboutServiceImpl;

public class AboutAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AboutBean aboutBean;
	
	public AboutBean getAboutBean() {
		return aboutBean;
	}

	public void setAboutBean(AboutBean aboutBean) {
		this.aboutBean = aboutBean;
	}



	//  跳转关于公司
	public String loadAbout(){
		String abouttype = request.getParameter("sta");
		AboutService aboutService = new AboutServiceImpl();
		
		setAboutBean(aboutService.queryAbout(abouttype));

		return "loadAbout";
	}
}
