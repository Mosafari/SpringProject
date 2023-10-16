package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import model.Employee;
import service.EmpServiceIImpl;

public class Application {

	public static void main(String[] args) {
		//using @Configuration class
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = applicationContext.getBean("emp1", Employee.class);
		System.out.println(emp);
		EmpServiceIImpl empServiceIImpl = applicationContext.getBean("empServiceImpl", EmpServiceIImpl.class);
		System.out.println(empServiceIImpl.list());
	}

}
