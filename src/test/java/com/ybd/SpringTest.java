package com.ybd;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ybd.action.UsersAction;
import com.ybd.pojo.Users;

public class SpringTest



{

	@Test
	public void run() {
		// 1.获取核心容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		UsersAction action = (UsersAction) ac.getBean("usersAction");
		List<Users> list = action.findAll();
		System.out.println(list);
		for (Users users : list) {
			System.out.println( users.getUname());
		}
		
	}

}
