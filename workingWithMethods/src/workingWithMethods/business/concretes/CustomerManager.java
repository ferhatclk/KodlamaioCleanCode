package workingWithMethods.business.concretes;

import workingWithMethods.business.abstracts.CustomerService;
import workingWithMethods.core.utils.adapter.PersonCheckService;
import workingWithMethods.core.utils.validator.ValidatorService;
import workingWithMethods.dataAccess.abstracts.CustomerDal;
import workingWithMethods.entities.Customer;
import workingWithMethods.entities.Person;

public class CustomerManager implements CustomerService{
	private CustomerDal customerDal;
	private PersonCheckService personCheckService;
	private ValidatorService validatorService;
	
	public CustomerManager(CustomerDal customerDal, PersonCheckService personCheckService, ValidatorService validatorService) {
		this.customerDal = customerDal;
		this.personCheckService = personCheckService;
		this.validatorService = validatorService;
	}
	
	@Override
	public void add(Customer customer) throws Exception {
		validatorService.validateFirstNameIfEmpty(customer); // validasyon
		validatorService.validateLastNameIfEmpty(customer);  // validasyon
		validatorService.validateIdentityNumberIfEmpty(customer); // validasyon
		checkPersonExists(customer);
		checkCustomerExists(customer); // iþ kuralý
		customerDal.add(customer);  // iþ kuralý
	}
	
	@Override
	public void addByOtherBusiness(Customer customer) throws Exception {
		validatorService.validateFirstNameIfEmpty(customer);
		validatorService.validateLastNameIfEmpty(customer);
		validatorService.validateIdentityNumberIfEmpty(customer);
		validatorService.validateFirstNameLength(customer);
		checkPersonExists(customer);
		checkCustomerExists(customer);
		customerDal.add(customer);
	}
	
	
	
	private void checkCustomerExists(Customer customer) throws Exception {
		if(customerDal.customerExists(customer)) {
			throw new Exception("Müþteri zaten mevcut!!");
		}
	}
	
	private void checkPersonExists(Person person) throws Exception {
		if(!personCheckService.checkPerson(person)) {
			throw new Exception("Kiþi bilgileri hatalý!!!");
		}
	}
}