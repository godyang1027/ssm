package com.ybd.action;

import java.util.List;

import com.ybd.pojo.Users;
import com.ybd.service.UsersService;

public class UsersAction {
	
	
	private UsersService usersService;
   //bean.xml <property> 可以通过set注入userService对象
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}



	public List<Users> findAll() {
		System.out.println("---UsersAction--调用findAll.....");
	 	 return usersService.findAll();
	}


}
