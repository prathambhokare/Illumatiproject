package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LearningPlan {

	@Column
	private String name;
	@Id
	@Column
	private String courseId;
	
	
	
	public LearningPlan() {

	}

	public LearningPlan(String name, String courseId) {
		super();
		this.name = name;
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	
	
	
}
