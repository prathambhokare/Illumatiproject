package com.psl.lmsserver.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String description;
	@Column
	private int score;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_id")
	private List<User> user;
//	@Column
//	private int ownerId;
	@Column
	private String status;
	
	
	
	public Course() {
		
	}

	public Course(int id, String name, String category, String description, int score, List<User> user, String status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.score = score;
		this.user = user;
		this.status = status;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
