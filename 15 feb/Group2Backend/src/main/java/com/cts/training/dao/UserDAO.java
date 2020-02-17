package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.User;

//import com.cts.training.bean.User;

public interface UserDAO {
	
	public boolean saveOrUpdateUser(User user);

	public boolean removeUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();

}
