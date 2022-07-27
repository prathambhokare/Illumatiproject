package com.psl.lmsserver.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "roletable")
public class Role {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int roleId;
	
	@Column(name = "name")
	private String name;


	public Role() {

	}


	public Role(int roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}



	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
