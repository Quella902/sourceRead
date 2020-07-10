package com.example.learnaop.controller;

import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @date 2020/7/11  2:03
 */
@RestController
public class TestController{


	@GetMapping("/getUser")
	public User run1(){
		
		return new User("东子",30);
		
	}


}
