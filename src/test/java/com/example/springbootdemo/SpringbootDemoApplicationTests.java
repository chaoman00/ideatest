package com.example.springbootdemo;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootDemoApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void contextLoads() {
		User user  = userService.login("root","root");
		System.out.println("id="+user.getId());
	}

}
