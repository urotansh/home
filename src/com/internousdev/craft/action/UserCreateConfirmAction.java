package com.internousdev.craft.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;
	
	private String result;
	
	public String execute() {
		
		result=SUCCESS;
		
		session.put("loginUserId", loginUserId);
		session.put("loginPassword", loginPassword);
		session.put("userName", userName);
		
		return result;
	}
	
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword=loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	@Override
	public void setSession(Map<String,Object> session) {
		this.session=session;
	}

}
