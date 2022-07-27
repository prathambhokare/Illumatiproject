package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserSkills {

	@Id
	@Column
	private int id;
	@Column
	private int userId;
	@Column
	private int skillId;
	
	public UserSkills() {
		
	}

	public UserSkills(int id, int userId, int skillId) {
		super();
		this.id = id;
		this.userId = userId;
		this.skillId = skillId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	
	
}
