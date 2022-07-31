package workingWithMethods.business.concretes;

import java.util.List;

import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.dataAccess.abstracts.EmployeeDal;
import workingWithMethods.entities.Employee;

public class EmployeeManager implements EmployeeService{
	private EmployeeDal employeeDal;
	
	
	public EmployeeManager(EmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
	}

	@Override
	public void add(Employee employee) {
		employeeDal.add(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeDal.getAll();
	}

}
