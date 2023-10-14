package dev.me;

import dev.me.service.CourseService;

public class Application {

	public static void main(String[] args) {
		CourseService service = new CourseService();
		System.out.println(service.list());
	}

}
