package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuizOptions {

	@Id
	@Column
	private int id;
	@Column
	private int questionId;
	@Column
	private int score;
	
	public QuizOptions() {
		
	}

	public QuizOptions(int id, int questionId, int score) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
