package dev.me.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.me.service.CourseService;

@Configuration
public class AppConfig {

    @Bean("courseService")
    public CourseService getCourseService(){
        return new CourseService();
    }
    
}
