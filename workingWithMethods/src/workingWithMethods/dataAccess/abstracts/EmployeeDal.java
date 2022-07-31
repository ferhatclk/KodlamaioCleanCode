package workingWithMethods.dataAccess.abstracts;

import java.util.List;

import workingWithMethods.entities.Employee;

public interface EmployeeDal {
	public void add(Employee employee);
	public List<Employee> getAll();
}
