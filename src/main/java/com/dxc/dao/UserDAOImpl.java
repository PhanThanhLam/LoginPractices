/*
	Code of me
*/
package com.dxc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.co.ConnectionMysql;
import com.dxc.model.User;

public class UserDAOImpl implements UserDAO {
	
	public boolean validate(User user) {
		boolean status = false;
		
		Connection con = ConnectionMysql.getCurrentConnection();
		PreparedStatement preparedStatement = null;
		ResultSet result = null;

		try {
			String sql = "select * from user where username = ? and password = ?";
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassWord());
			result = preparedStatement.executeQuery();

			status =result.next();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionMysql.cleanup(result, preparedStatement, con);
		}
		return status;
	}

	@Override
	public User user() {
		Connection con = ConnectionMysql.getCurrentConnection();
		User user=new User();
		 Statement statement=null;
		 ResultSet result = null;
		 
		 try {
			 String sql ="select * from user";
			 statement=con.createStatement();
			 result=statement.executeQuery(sql);
			 
			 while(result.next()) {
				 user.setUserName(result.getString("username"));
				 user.setPassWord(result.getString("password"));
				 user.setFirstName(result.getString("firstname"));
				 user.setLastName(result.getString("lastname"));
			 }
		 }catch(SQLException e){
			 e.printStackTrace(); 
		 }finally {
				ConnectionMysql.cleanup(result, statement, con);
		}
		 
		 
		return user;
	}

	@Override
	public void update(User user, String str) {
		Connection con = ConnectionMysql.getCurrentConnection();
		try {
			String sql="update user.user set password = ? where username = ?";
			PreparedStatement  preparedStatement=null;
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, str);
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.executeUpdate();
			con.close();
		} catch (Exception e) {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		}finally {
			
		}
	}
	

}
