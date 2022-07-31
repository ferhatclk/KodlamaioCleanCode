package workingWithMethods.core.utils.validator;

import workingWithMethods.entities.Customer;

public class Validator implements ValidatorService{
	public void validateFirstNameIfEmpty(Customer customer) throws Exception  {
		if(customer.getFirstName().isEmpty()) {
			throw new Exception("Validasyon hatas� : �sim bo� olamaz");
		}
	}
	public void validateLastNameIfEmpty(Customer customer) throws Exception  {
		if(customer.getLastName().isEmpty()) {
			throw new Exception("Validasyon hatas� : Soyad  bo� olamaz");
		}
	}
	public void validateIdentityNumberIfEmpty(Customer customer) throws Exception  {
		if(customer.getIdentityNumber().isEmpty()) {
			throw new Exception("Validasyon hatas� : TC no bo� olamaz");
		}
	}
	
	public void validateFirstNameLength(Customer customer) throws Exception {
		if(customer.getFirstName().length()<2) {
			throw new Exception("Validasyon hatas� : Ad�n�z iki karakterden az olamaz");
		}
	}
}
