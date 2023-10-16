package dev.me.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.me.model.Course;

@Repository
public class CourseRepository implements CrudInterface<Course>{

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
		Course springCourse = new Course(1, 
				"Getting Started", 
				"Lern to build app ", 
				"https://learn.dev"); 
		
		courses.add(springCourse);
        return courses;
    }
    
}
