package workingWithMethods.dataAccess.concretes.EntityFrameworkDal;

import java.util.ArrayList;
import java.util.List;

import workingWithMethods.dataAccess.abstracts.CustomerDal;
import workingWithMethods.entities.Customer;

public class EfCustomerDal implements CustomerDal{
	private List<Customer> customers;
	
	public EfCustomerDal() {
		customers = new ArrayList<>();
	}
	
	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println(customer.getFirstName() + " : Entity framework ile Veritabanýna Eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return false;
	}

}
