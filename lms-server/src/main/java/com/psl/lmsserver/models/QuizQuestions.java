package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuizQuestions {

	@Id
	@Column
	private int id;
	@Column
	private int contentId;
	@Column
	private String question;
	
	public QuizQuestions() {
		
	}

	public QuizQuestions(int id, int contentId, String question) {
		super();
		this.id = id;
		this.contentId = contentId;
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
