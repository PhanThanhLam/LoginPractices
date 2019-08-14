/*
	Code of me
*/
package com.dxc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.co.ConnectionMysql;
import com.dxc.model.User;

public class UserDAOImpl implements UserDAO{


	public List<User> listUser() {
		List<User> list = new ArrayList<User>();
		Connection con=ConnectionMysql.getCurrentConnection();
		
		Statement statement =null;
		ResultSet result=null;
		
		try {
			String sql="select * from user";
			statement = con.createStatement();
			result = statement.executeQuery(sql);
			
			User user=new User();
			while(result.next()) {
				user.setUserName(result.getString("username"));
				user.setPassWord(result.getString("password"));
				user.setFirstName(result.getString("firstname"));
				user.setLastName(result.getString("lastname"));
			}
			list.add(user);
			
		} catch (SQLException e) {
			System.out.println("Dont osdafds");
			e.printStackTrace();
		} finally {
			ConnectionMysql.cleanup(result, statement, con);
		}
		return list;
	}
	
}
