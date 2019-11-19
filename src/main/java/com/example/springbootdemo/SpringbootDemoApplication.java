package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
//@MapperScan("com.example.springbootdemo.mapper")
@ComponentScan(basePackages = {"com.example.springbootdemo.bean","com.example.springbootdemo.controller","com.example.springbootdemo.dao","com.example.springbootdemo.service","com.example.springbootdemo.serviceImpl"})
public class SpringbootDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}


}
