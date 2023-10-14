package dev.me.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dev.me.model.Course;

public class CourseService implements CrudService<Course> {
	
	private List<Course> courses;
	
	

	public CourseService() {
		courses = new ArrayList<>();
		Course springCourse = new Course(1, 
				"Getting Started", 
				"Lern to build app ", 
				"https://learn.dev"); 
		
		courses.add(springCourse);
	}



	@Override
	public List<Course> list() {
		return courses;
	}



	@Override
	public Course create(Course t) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<Course> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}



	@Override
	public void update(Course t, int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


}
