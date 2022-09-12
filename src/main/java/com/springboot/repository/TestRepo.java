package com.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.entity.Test;

public interface TestRepo extends JpaRepository<Test, Integer>{
	
	@Query("Select t from Test as t group by t.userid")
	List<Test> getIndividual();

}
