package com.hd.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.hd.model.Userbean;
import com.hd.service.IUserService;

public class UserServiceImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	    IUserService userService=(IUserService) ac.getBean("userServiceImpl");
	    Userbean user=userService.findById(8);
	    System.out.println(user.getUsername());
	}

	@Test
	public void testQuery() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//	    IUserService userService=(IUserService) ac.getBean("userServiceImpl");
//	    PageInfo<Userbean> pageInfo=userService.query();
//	    List<Userbean> list=pageInfo.getList();
//	    for(Userbean u:list){
//	    	System.out.println(u.getRealname());
//	    }
	}

}
