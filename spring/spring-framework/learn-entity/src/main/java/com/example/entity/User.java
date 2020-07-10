package com.example.entity;

import lombok.Data;

/**
 * @author admin
 * @date 2020/7/11  2:10
 */
@Data
public class User{
	
	private String name;
	
	private Integer age;
	
	public User (String name,Integer age){
		this.name = name;
		this.age = age;
	}
	
	public User (){
	}
}
