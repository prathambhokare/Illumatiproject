package com.psl.lmsserver.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CourseCompletions {

	@Id
	@Column
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private Course course;
//	@Column
//	private int courseId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="user_id")
	private User user;
//	@Column
//	private int userId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "content_id")//name="id"?
	private CourseContent courseContent;
//	@Column
//	private int contentId;
	@Column
	private String status;
	
	public CourseCompletions() {
		
	}

	public CourseCompletions(int id, Course course, User user, CourseContent courseContent, String status) {
		super();
		this.id = id;
		this.course = course;
		this.user = user;
		this.courseContent = courseContent;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public CourseContent getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(CourseContent courseContent) {
		this.courseContent = courseContent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
