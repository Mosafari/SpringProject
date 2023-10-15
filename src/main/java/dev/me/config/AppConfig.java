package dev.me.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.me.repository.CourseRepository;
import dev.me.service.CourseService;

@Configuration
public class AppConfig {

    @Bean("courseRepository")
    public CourseRepository getCourseRepository(){
        return new CourseRepository();
    }

    @Bean("courseService")
    public CourseService getCourseService(){
        return new CourseService(getCourseRepository());
    }
    
}
