package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	 public User findByEmailid(String emailid);

}
