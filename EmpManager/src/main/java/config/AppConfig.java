package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import model.Employee;
//import service.EmpServiceIImpl;

@Configuration
@ComponentScan("..") // parent. 
public class AppConfig {
	
//	@Bean("implService")
//	public EmpServiceIImpl getEmpServiceIImpl() {
//		return new EmpServiceIImpl();
//	}
	
//	@Bean("emp1")
//	public Employee createBookInstance() {
//		Employee emp1 = new Employee(1, "amir", "haji", "manager@g.com");
//        
//        return emp1;
//    } 

}
