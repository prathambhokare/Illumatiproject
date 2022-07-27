package com.psl.lmsserver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Certificates {

	@Id
	@Column
	private int id;

//	@Column
//	private int courseId;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Course> course;
	
	@Column
	private String templatePath;
	
	public Certificates() {
		
	}

	public Certificates(int id, List<Course> course, String templatePath) {
		super();
		this.id = id;
		this.course = course;
		this.templatePath = templatePath;
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

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}
	
	
}
