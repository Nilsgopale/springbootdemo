package com.example.demo;

public class UserServiceImpl implements UserService {

	UserRepositiory repo;

	@Override
	public void insertUser(User u) {
		// TODO Auto-generated method stub
		repo.save(u);
		
	}
	
	
}
