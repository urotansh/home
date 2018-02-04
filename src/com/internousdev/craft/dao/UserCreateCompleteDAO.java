package com.internousdev.craft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.craft.util.DBConnector;

public class UserCreateCompleteDAO {
	
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	
	private String sql="INSERT INTO user_info (id,user_id,password) VALUES(?,?,?)";
	
	public void createUser(String id,String userid,String pass) throws SQLException{
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2, userid);
			preparedStatement.setString(3, pass);
			
			preparedStatement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}

}
