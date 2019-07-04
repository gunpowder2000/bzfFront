package com.company.action.base;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {	
	
	/**
	 * 
	 */
	public HttpServletRequest request=ServletActionContext.getRequest();
	public HttpServletResponse response=ServletActionContext.getResponse();
		
	
	private static final long serialVersionUID = 1L;
	private InputStream inputstream;

	public InputStream getInputstream() {
		return inputstream;
	}

	public void setInputstream(InputStream inputstream) {
		this.inputstream = inputstream;
	}

}
