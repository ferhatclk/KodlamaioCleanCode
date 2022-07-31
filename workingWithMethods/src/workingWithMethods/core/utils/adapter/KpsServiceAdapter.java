package workingWithMethods.core.utils.adapter;

import workingWithMethods.core.services.kpsService.KpsService;
import workingWithMethods.entities.Person;

public class KpsServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		
		return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()),person.getFirstName() ,person.getLastName(),person.getBirthOfYear());
	}

}
