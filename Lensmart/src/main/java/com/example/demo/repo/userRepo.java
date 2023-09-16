package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.UserModel;

public interface userRepo extends JpaRepository<UserModel, String> {

}
