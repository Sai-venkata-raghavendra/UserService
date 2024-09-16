package com.example.UserServices.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserServices.entity.UserDetails;
import com.example.UserServices.serviceLayer.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public UserDetails saveUsers(@RequestBody UserDetails userDetails) {
		return userService.saveUsers(userDetails);
	}
	
	@GetMapping(value = "/allusers")
	public List<UserDetails> getAllUser(){
		
		return userService.getAllUser();
	}
	
	@GetMapping(value = "/user/{userid}")
	public UserDetails getDetails(@PathVariable("userid") String userid )
	{
		return userService.getDetails(userid);
	}
}
