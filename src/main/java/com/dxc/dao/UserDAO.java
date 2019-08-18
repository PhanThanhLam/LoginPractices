/*
	Code of me
*/
package com.dxc.dao;

import java.sql.SQLException;
import java.util.List;

import com.dxc.model.User;

public interface UserDAO {
	public boolean validate(User user);
	public User user();
	public void update(User user, String str);
}
