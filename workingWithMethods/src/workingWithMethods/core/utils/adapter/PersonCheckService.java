package workingWithMethods.core.utils.adapter;

import workingWithMethods.entities.Person;

public interface PersonCheckService {
	 /**
     * Kisinin bilgilerinin do�rulu�unun kontrolu
     * @param person dogrulanacak kisi
     * @return true or false
     */
	public boolean checkPerson(Person person);
}
