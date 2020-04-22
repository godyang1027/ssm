package com.ybd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybd.dao.UsersDao;
import com.ybd.pojo.Users;
import com.ybd.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	
	@Autowired
	private UsersDao usersDao;



	public List<Users> findAll() {
		System.out.println("---UsersServiceImpl--调用findAll.....");
	 	 return usersDao.findAll();
	}

}
