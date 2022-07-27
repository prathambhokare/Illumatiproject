package com.psl.lmsserver.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseContent {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int courseId;
	@Column
	private int contentTypeId;
	@Column
	private int sectionId;
	@Column
	private int path;
	@Column
	private boolean isGraded;
	
	public CourseContent() {
		
	}

	public CourseContent(int id, String name, int courseId, int contentTypeId, int sectionId, int path,
			boolean isGraded) {
		super();
		this.id = id;
		this.name = name;
		this.courseId = courseId;
		this.contentTypeId = contentTypeId;
		this.sectionId = sectionId;
		this.path = path;
		this.isGraded = isGraded;
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

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}

	public boolean isGraded() {
		return isGraded;
	}

	public void setGraded(boolean isGraded) {
		this.isGraded = isGraded;
	}
	
	
	
}
