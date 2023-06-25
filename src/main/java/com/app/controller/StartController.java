package com.app.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Users;
import com.app.service.UsersService;

@RestController
@RequestMapping("/users")
public class StartController {
	// dependency : usersService
	@Autowired
	private UsersService userSer;

	public StartController() {
		System.out.println("in the home page controller : " + getClass());
	}

	@GetMapping
	public List<Users> gettingListOfAllUsers() {
		System.out.println("in the method of getting the list of all the users: " + getClass());
		return userSer.getListOfAllUsers();
	}

	@PostMapping
	public Users addNewUsers(@RequestBody Users addUser) {
		return userSer.AddUserDetails(addUser);

	}
}
