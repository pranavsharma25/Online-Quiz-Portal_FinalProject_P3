package com.springboot.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Statistics {
	
	private int users;
	private List<Object> quiz;
	private int questions;
	@Override
	public String toString() {
		return "Statistics [users=" + users + ", quiz=" + quiz + ", questions=" + questions + "]";
	}
	public int getUsers() {
		return users;
	}
	public void setUsers(int users) {
		this.users = users;
	}
	public List<Object> getQuiz() {
		return quiz;
	}
	public void setQuiz(List<Object> quiz) {
		this.quiz = quiz;
	}
	public int getQuestions() {
		return questions;
	}
	public void setQuestions(int questions) {
		this.questions = questions;
	}

}
