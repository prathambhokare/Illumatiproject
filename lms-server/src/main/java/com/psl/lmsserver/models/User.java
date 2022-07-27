package com.psl.lmsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name = "user")
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	@Column(name = "mobileno")
	private String mobileNo;



	@JsonIgnore
	@Column(name = "password")
	private String passWord;

	@Column(name = "department")
	private String dept_name;



	@Column(name = "status")
	private String status;


	@Column(name = "senior_id")
	private int seniorId;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role roletable;
	
	
	public User() {
		
	}

	public User(int userId, String name, String email, String passWord, int seniorId,String mobileNo, Role roletable) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.passWord = passWord;
		this.seniorId = seniorId;
		this.mobileNo=mobileNo;
		this.roletable = roletable;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getSeniorId() {
		return seniorId;
	}

	public void setSeniorId(int seniorId) {
		this.seniorId = seniorId;
	}

	public Role getRoletable() {
		return roletable;
	}

	public void setRoletable(Role roletable) {
		this.roletable = roletable;
	}


	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
