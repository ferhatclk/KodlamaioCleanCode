package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.Customer;

public interface CustomerDal {
	/**
     * Nesneyi veritabanýna ekleme
     * @param customer nesnesi
     * @return void
     */
	public void add(Customer customer);
	/**
     * Nesnenin veritabanýnda kayýtlý olup olmadýðý kontrolü
     * @param customer nesnesi
     * @return boolean
     */
	public boolean customerExists(Customer customer);
}
