package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBatch {

	@Column
	private String name;
	@Id
	@Column
	private int userId;
	
	
	public UserBatch() {

	}

	public UserBatch(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
