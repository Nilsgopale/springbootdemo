package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	UserRepositiory repo;

	@Override
	public void insertUser(User u) {
		// TODO Auto-generated method stub
		repo.save(u);
		
	}
	
	
}
