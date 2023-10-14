package dev.me.model;

public class Course {
	
	private int courseId;
	private String title;
	private String description;
	private String links;
	
	public Course(int courseId, String title, String description, String links) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.links = links;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", description=" + description + ", links=" + links
				+ "]";
	}
	
	

}
