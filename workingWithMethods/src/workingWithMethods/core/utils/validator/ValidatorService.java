package workingWithMethods.core.utils.validator;

import workingWithMethods.entities.Customer;

public interface ValidatorService {
	/**
     * Nesnenin firstName alan�n�n bo� olup olmad���n�n kontrol�
     * @param customer nesnesi
     * @return void
     */
	public void validateFirstNameIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin lastName alan�n�n bo� olup olmad���n�n kontrol�
     * @param customer nesnesi
     * @return void
     */
	public void validateLastNameIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin identityNumber alan�n�n bo� olup olmad���n�n kontrol�
     * @param customer nesnesi
     * @return void
     */
	public void validateIdentityNumberIfEmpty(Customer customer) throws Exception;
	/**
     * Nesnenin firstName alan�n�n karakter uzunlu�unun kontrol�
     * @param customer nesnesi
     * @return void
     */
	public void validateFirstNameLength(Customer customer) throws Exception;
}
