package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.Customer;

public interface CustomerDal {
	/**
     * Nesneyi veritaban�na ekleme
     * @param customer nesnesi
     * @return void
     */
	public void add(Customer customer);
	/**
     * Nesnenin veritaban�nda kay�tl� olup olmad��� kontrol�
     * @param customer nesnesi
     * @return boolean
     */
	public boolean customerExists(Customer customer);
}
