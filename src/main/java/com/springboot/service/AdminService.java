package com.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Admin;
import com.springboot.entity.Question;
import com.springboot.entity.Quiz;
import com.springboot.entity.Statistics;
import com.springboot.repository.AdminRepo;
import com.springboot.repository.QuestionRepo;
import com.springboot.repository.QuizRepo;
import com.springboot.repository.UserRepo;

@Service
public class AdminService {
	@Autowired
	QuestionRepo qr;
	@Autowired
	QuizRepo qur;
	@Autowired
	UserRepo ur;
	@Autowired
	Statistics stat;
	@Autowired
	AdminRepo adr;
	
	
	
	public String adminLogin(Admin u)
	{
		Admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin";
		}
		else
		{
			return "invalid Credentials";
		}
	}
	public String adminupdate(Admin a)
	{
		Admin ad= adr.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getPassword());
		adr.saveAndFlush(ad);
			return "Updated";
	

	}
	
	public String addQuestion(Question q)
	{
		if(q!=null)
		{
			qr.save(q);
			return "question added";
		}
		else
		{
			return "failed to add";
		}
		
	}
	
	public String addQuiz(Quiz q)
	{
		
		if(q!=null)
		{
			qur.save(q);
			return "quiz added";
		}
		else
		{
			return "failed to add";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return qur.findAll();
	}
	
	public Statistics quizInfo()
	{
		stat.setUsers(ur.findAll().size());
		stat.setQuestions(qr.findAll().size());
		stat.setQuiz(qur.listOfQuiz());
		
		return stat;

	}
	
	

}
