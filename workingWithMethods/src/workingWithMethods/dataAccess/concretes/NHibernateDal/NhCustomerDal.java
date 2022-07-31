package workingWithMethods.dataAccess.concretes.NHibernateDal;

import java.util.ArrayList;
import java.util.List;

import workingWithMethods.dataAccess.abstracts.CustomerDal;
import workingWithMethods.entities.Customer;

public class NhCustomerDal implements CustomerDal{
	private List<Customer> customers;
	
	public NhCustomerDal() {
		customers = new ArrayList<>();
	}
	
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println(customer.getFirstName() + " : NHibernate ile Veritabanýna Eklendi");
	}
	
	public boolean customerExists(Customer customer) {
		return false;
	}
}
