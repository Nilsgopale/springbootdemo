package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl si;
	
	@RequestMapping(value="/reg",method=RequestMethod.POST,consumes="application/json")
	public void insertRegister(@RequestBody User u)
	{
		si.insertUser(u);
	}
}
