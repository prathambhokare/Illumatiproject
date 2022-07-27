package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseSection {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int courseId;
	
	public CourseSection() {
		
	}

	public CourseSection(int id, String name, int courseId) {
		super();
		this.id = id;
		this.name = name;
		this.courseId = courseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}
