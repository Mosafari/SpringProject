package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public class EmpRepository implements CrudInterface<Employee>{

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee(1, "amir", "haji", "manager@g.com");
		employees.add(emp1);
		return employees;
	}

}
