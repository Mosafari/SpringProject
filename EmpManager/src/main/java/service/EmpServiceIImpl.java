package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import model.Employee;
import repository.EmpRepository;

@Service("empServiceImpl")
public class EmpServiceIImpl implements CrudService<Employee> {
//	List<Employee> list = new ArrayList<>(); //no longer needed
	EmpRepository repository;
	
	
	public EmpServiceIImpl(EmpRepository empRepository) {
		this.repository = empRepository;
}

	@Override
	public List<Employee> list() {
		return repository.findAll();
	}

	@Override
//	@Autowired @Qualifier("emp1")
	public Employee create(Employee t) {
//		list.add(t);
		return null;
	}

	@Override
	public Optional<Employee> getById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Employee t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
