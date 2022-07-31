package workingWithMethods.business.abstracts;

import java.util.List;

import workingWithMethods.entities.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	
	public List<Employee> getAll();
}
