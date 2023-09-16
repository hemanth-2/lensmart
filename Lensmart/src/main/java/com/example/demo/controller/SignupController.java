package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.UserModel;
import com.example.demo.repo.userRepo;


@CrossOrigin("*")
@RestController
public class SignupController {

	@Autowired
	userRepo repo;
	
	@PostMapping("/sign")
	public boolean saveUser(@RequestBody UserModel user)
	{
		repo.save(user);
		if (user.getUserName() != null) {
	        return true;
	    } else {
	    	return false;
	    }
	}
	
	@GetMapping("/getuser/{email}")
	public UserModel getuser(@PathVariable String email)
	{	
		UserModel user=repo.findById(email).orElse(null);
		return user;
	}

}
