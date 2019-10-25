package com.test.service;

import com.test.entity.User;

public interface UserSerivce {
	public int add(User user);
	public User login(String username,String password);
}
