package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "uid")
	private User userid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quid")
	private Quiz quizid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Question questionid;
	private int testans;
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Quiz getQuizid() {
		return quizid;
	}

	public void setQuizid(Quiz quizid) {
		this.quizid = quizid;
	}

	public Question getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Question questionid) {
		this.questionid = questionid;
	}

	public int getTestans() {
		return testans;
	}

	public void setTestans(int testans) {
		this.testans = testans;
	}

	@Override
	public String toString() {
		return "Test [tid=" + tid + ", userid=" + userid + ", quid=" + quizid + ", questionid=" + questionid
				+ ", testans=" + testans + "]";
	}
	
	

}
