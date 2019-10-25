package com.test.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.test.entity.User;

public interface UserDao {
	
	@Insert("INSERT INTO user(username,password) VALUES(#{username},#{password})")
	public int add(@Param("user") User user);
	
	@Select("SELECT * FROM user WHERE username=#{username} AND password=#{password}")
	public User login(@Param("username") String username,@Param("password") String password);
}
