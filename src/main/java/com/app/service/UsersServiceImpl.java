package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Users;
import com.app.repository.UsersRepository;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
//dependency: usersrepository
	@Autowired
	private UsersRepository userRepo;

	@Override
	public List<Users> getListOfAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Users AddUserDetails(Users addUser) {
		// TODO Auto-generated method stub
		return userRepo.save(addUser);
	}

}
