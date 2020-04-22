package com.ybd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ybd.pojo.Users;


@Repository("usersDao")
public interface UsersDao {

	public List <Users> findAll();
	
	
	
  
}