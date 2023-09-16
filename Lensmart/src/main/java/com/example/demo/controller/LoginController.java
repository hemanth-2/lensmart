package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;
import com.example.demo.repo.userRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	@Autowired
	userRepo repo;
	@PostMapping("/login")
	public boolean checkUser(@RequestBody LoginModel data)
	{
		UserModel user=repo.findById(data.getEmail()).orElse(null);
		UserModel user1=new UserModel();
		if(user != null && user.getPassword().equals(data.getPassword()))
		{
			return true;
		}
		return false;
		
	}

}
