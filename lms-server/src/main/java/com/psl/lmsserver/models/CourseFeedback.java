package com.psl.lmsserver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class CourseFeedback {

	@Id
	@Column
	private int id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<User> user;
//	@Column
//	private int userId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Course> course;
//	@Column
//	private int courseId;
	@Column
	private String message;
	
	
	public CourseFeedback() {

	}

	public CourseFeedback(int id, List<User> user, List<Course> course, String message) {
		super();
		this.id = id;
		this.user = user;
		this.course = course;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
