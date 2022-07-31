package workingWithMethods.dataAccess.concretes.EntityFrameworkDal;

import java.util.ArrayList;
import java.util.List;

import workingWithMethods.dataAccess.abstracts.EmployeeDal;
import workingWithMethods.entities.Employee;

public class EfEmployeeDal implements EmployeeDal{
	private List<Employee> employees;
	
	public EfEmployeeDal() {
		employees = new ArrayList<>();
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
		
	}
	
	@Override
	public List<Employee> getAll() {
		return employees;
	}

	

}
