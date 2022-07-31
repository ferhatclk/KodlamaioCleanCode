package workingWithMethods.business.abstracts;

import workingWithMethods.entities.Customer;

public interface CustomerService {
	
	public void add(Customer customer) throws Exception ;
	
	public void addByOtherBusiness(Customer customer) throws Exception ;
}
