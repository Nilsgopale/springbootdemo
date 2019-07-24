package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

	UserServiceImpl si;
	@RequestMapping(value="reg",method=RequestMethod.POST,consumes="application.json")
	public void insertRegister(@RequestBody User u)
	{
		si.insertUser(u);
	}
}
