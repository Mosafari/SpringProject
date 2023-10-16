package dev.me.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.me.model.Course;
import dev.me.repository.CourseRepository;
@Service
public class CourseService implements CrudService<Course> {
	
	// private List<Course> courses;
	private CourseRepository repository;
	
	

	public CourseService(CourseRepository courseRepository) {
		// courses = new ArrayList<>();
		// Course springCourse = new Course(1, 
		// 		"Getting Started", 
		// 		"Lern to build app ", 
		// 		"https://learn.dev"); 
		// 
		// courses.add(springCourse);

		// repository = new CourseRepository();

		// with Bean
		repository = courseRepository;
	}



	@Override
	public List<Course> list() {
		return repository.findAll();
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
