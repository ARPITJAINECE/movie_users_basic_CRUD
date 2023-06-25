package com.app.service;

import java.util.List;

import com.app.entities.Users;

public interface UsersService {
// add a method to get a list of all the users
	List<Users> getListOfAllUsers();

	// add a method to add the users
	Users AddUserDetails(Users addUser);
}
