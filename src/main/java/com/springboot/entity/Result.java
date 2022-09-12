package com.springboot.entity;


public class Result implements Comparable<Result>{

	private String email;
	private Integer marks;
	public Result()
	{
		
	}
	public Result(String email2, int mark) {
		// TODO Auto-generated constructor stub]
		this.email=email2;this.marks=mark;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Result [email=" + email + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Result r) {
		// TODO Auto-generated method stub
		int comparemarks= r.getMarks();
		return comparemarks-this.marks;
	}
	
	

}
