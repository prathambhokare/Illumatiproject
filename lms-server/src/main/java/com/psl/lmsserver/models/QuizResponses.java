package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuizResponses {

	@Id
	@Column
	private int id;
	@Column
	private int userId;
	@Column
	private int questionId;
	@Column
	private int optionId;
	@Column
	private int score;
	
	public QuizResponses() {
		
	}

	public QuizResponses(int id, int userId, int questionId, int optionId, int score) {
		super();
		this.id = id;
		this.userId = userId;
		this.questionId = questionId;
		this.optionId = optionId;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
