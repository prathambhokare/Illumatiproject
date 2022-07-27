package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkillMaster {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	
	public SkillMaster() {
		
	}

	public SkillMaster(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
