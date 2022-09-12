package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
