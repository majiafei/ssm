package org.giveu.springmvc.mjf.dao;

import java.util.List;

import org.giveu.springmvc.mjf.model.User;

public interface UserDao {

	
	public List<User> findUsers();
	
	
}
