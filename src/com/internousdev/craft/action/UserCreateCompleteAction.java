package com.internousdev.craft.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craft.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	
	private String loginUserId;
	private String userName;
	private String loginPassword;
	
	public Map<String,Object> session;
	
	private String result;
	
	private UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();
	
	public String execute() throws SQLException{
		
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
				session.get("userName").toString(),
				session.get("loginPassword").toString());
		
		result=SUCCESS;
		
		return result;
	}
	
	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	

}
}
