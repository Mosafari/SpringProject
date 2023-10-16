package dev.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.me.config.AppConfig;
import dev.me.service.CourseService;

public class Application {

	public static void main(String[] args) {
		// CourseService service = new CourseService();
		// System.out.println(service.list());

		//using @Configuration class
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CourseService service = applicationContext.getBean("courseService", CourseService.class);
		System.out.println(service.list());
	}

}
