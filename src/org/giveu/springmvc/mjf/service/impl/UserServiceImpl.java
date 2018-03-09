package org.giveu.springmvc.mjf.service.impl;

import java.util.List;

import org.giveu.springmvc.mjf.dao.UserDao;
import org.giveu.springmvc.mjf.model.User;
import org.giveu.springmvc.mjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> findUsers() {
		return userDao.findUsers();
	}
	
	public UserServiceImpl() {
		System.out.println("============dsfsdf");
	}
	
}
