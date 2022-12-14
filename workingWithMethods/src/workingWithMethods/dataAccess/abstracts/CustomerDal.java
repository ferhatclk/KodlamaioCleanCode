package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.Customer;

public interface CustomerDal {
	/**
     * Nesneyi veritabanına ekleme
     * @param customer nesnesi
     * @return void
     */
	public void add(Customer customer);
	/**
     * Nesnenin veritabanında kayıtlı olup olmadığı kontrolü
     * @param customer nesnesi
     * @return boolean
     */
	public boolean customerExists(Customer customer);
}
