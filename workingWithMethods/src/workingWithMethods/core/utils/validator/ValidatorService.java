package workingWithMethods.core.utils.validator;

import workingWithMethods.entities.Customer;

public interface ValidatorService {
	/**
     * Nesnenin firstName alanýnýn boþ olup olmadýðýnýn kontrolü
     * @param customer nesnesi
     * @return void
     */
	public void validateFirstNameIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin lastName alanýnýn boþ olup olmadýðýnýn kontrolü
     * @param customer nesnesi
     * @return void
     */
	public void validateLastNameIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin identityNumber alanýnýn boþ olup olmadýðýnýn kontrolü
     * @param customer nesnesi
     * @return void
     */
	public void validateIdentityNumberIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin firstName alanýnýn karakter uzunluðunun kontrolü
     * @param customer nesnesi
     * @return void
     */
	public void validateFirstNameLength(Customer customer) throws Exception;
}
