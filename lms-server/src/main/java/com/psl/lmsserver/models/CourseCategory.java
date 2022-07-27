package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseCategory {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String parent;
	
	public CourseCategory() {

	}

	public CourseCategory(int id, String name, String parent) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
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

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	
	
}
