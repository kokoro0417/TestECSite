package com.internousdev.TestEC.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute(){

		session.put("NowLoginFlag", true);

		return SUCCESS;
	}

	public String Logout(){

		session.clear();

		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
