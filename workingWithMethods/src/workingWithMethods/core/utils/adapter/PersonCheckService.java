package workingWithMethods.core.utils.adapter;

import workingWithMethods.entities.Person;

public interface PersonCheckService {
	 /**
     * Kisinin bilgilerinin doğruluğunun kontrolu
     * @param person dogrulanacak kisi
     * @return true or false
     */
	public boolean checkPerson(Person person);
}
