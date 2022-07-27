package com.psl.lmsserver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Enrollment {

	@Id
	@Column
	private int id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Course> course;
//	@Column
//	private int courseId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<User> user;
//	@Column
//	private int userId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private List<Role> role;
//	@Column
//	private int roleId;
	@Column
	private String status;
	
	public Enrollment() {
		super();
	}

	public Enrollment(int id, List<Course> course, List<User> user, List<Role> role, String status) {
		super();
		this.id = id;
		this.course = course;
		this.user = user;
		this.role = role;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
