package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Admin;
import com.springboot.entity.Question;
import com.springboot.entity.Quiz;
import com.springboot.entity.Result;
import com.springboot.entity.Statistics;
import com.springboot.entity.Test;
import com.springboot.entity.User;
import com.springboot.service.AdminService;
import com.springboot.service.UserService;

@RestController
@RequestMapping("quiz")
public class MainController {
	@Autowired
	UserService us;
	@Autowired
	AdminService as;
	
	//http://localhost:8080/quiz/userLogin
	@PostMapping(value="userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody User user)
	{
			return us.userLogin(user.getEmailid(), user.getPassword());
	}
	
	//http://localhost:8080/quiz/userRegister
	@PostMapping(value="userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User user)
	{
		return us.userRegister(user);
	}
	
	//http://localhost:8080/quiz/adminLogin
	@PostMapping(value="adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminLogin(@RequestBody Admin admin)
	{
			return as.adminLogin(admin);
	}
	
	//http://localhost:8080/quiz/adminupdate
		@PostMapping(value="adminupdate", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminUpdate(@RequestBody Admin admin)
		{
				return as.adminupdate(admin);
		}
	
	
	
	
	//http://localhost:8080/quiz/addQuestions
	@PostMapping(value="addQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Question question)
	{
			return as.addQuestion(question);
	}
	
	//http://localhost:8080/quiz/addQuiz
	@PostMapping(value="addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuiz(@RequestBody Quiz quiz)
	{
			return as.addQuiz(quiz);
	}
	
	//http://localhost:8080/quiz/viewAllQuiz
		@GetMapping(value="viewAllQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
		public List<Quiz> viewAllQuiz()
		{
				return as.viewAllQuiz();
		}
		
		//http://localhost:8080/quiz/quizinfo
		@GetMapping(value="quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
		public Statistics quizinfo()
		{
				return as.quizInfo();
		}
		
		//http://localhost:8080/quiz/viewQuiz
				@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Object> viewQuiz()
				{
						return us.viewAllQuiz();
				}


				//http://localhost:8080/quiz/takeTest
				@PostMapping(value="takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
				public String takeTest(@RequestBody Test t)
				{
						return us.takeTest(t);
				}
				
				//http://localhost:8080/quiz/getAllTest
				@GetMapping(value="getAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Test> getAllTest()
				{
						return us.getTestList();
				}
				
				//http://localhost:8080/quiz/getresult
				@GetMapping(value="getresult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getresult()
				{
						return us.result();
				}
				
				//http://localhost:8080/quiz/getAdminResult
				@GetMapping(value="getAdminResult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> getAdminResult()
				{
						return us.result();
				}
				
}
