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

}
