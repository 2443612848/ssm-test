package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.UserSerivce;

@Service("userSerivce")
public class UserSerivceImpl implements UserSerivce {
	
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int add(User user) {
		return userDao.add(user);
	}

	public User login(String username, String password) {
		return userDao.login(username, password);
	}
	
}
