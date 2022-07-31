package workingWithMethods;

import java.util.List;

import workingWithMethods.business.abstracts.CustomerService;
import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.business.abstracts.ProductService;
import workingWithMethods.business.concretes.CustomerManager;
import workingWithMethods.business.concretes.EmployeeManager;
import workingWithMethods.business.concretes.ProductManager;
import workingWithMethods.core.utils.adapter.KpsServiceAdapter;
import workingWithMethods.core.utils.validator.Validator;
import workingWithMethods.dataAccess.concretes.EntityFrameworkDal.EfCustomerDal;
import workingWithMethods.dataAccess.concretes.EntityFrameworkDal.EfEmployeeDal;
import workingWithMethods.dataAccess.concretes.NHibernateDal.NhProductDal;
import workingWithMethods.entities.Customer;
import workingWithMethods.entities.Employee;
import workingWithMethods.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer1 = new Customer(1,"Sedat","Yýlmaz","40051248795",1998,2);
		Customer customer2 = new Customer(2,"Mehtap","Yýlmaz","40036528795",1989,8);
		
		Employee employee1 = new Employee(3,"Mehmet","Edip","32031248795",2000,7500);
		Employee employee2 = new Employee(4,"Derya","Yýldýrým","10251248795",1999,6500);
		
		CustomerService customerService = new CustomerManager(new EfCustomerDal(), new KpsServiceAdapter(), new Validator());
		customerService.add(customer1);
		customerService.add(customer2);
		
		EmployeeService employeeService = new EmployeeManager(new EfEmployeeDal());
		employeeService.add(employee1);
		employeeService.add(employee2);
		
		for (Employee employee : employeeService.getAll()) {
			System.out.println(employee.getFirstName());
		}
		
		ProductService productService = new ProductManager(new NhProductDal());
		productService.add(new Product(1,"Laptop",5400));
	}

}
