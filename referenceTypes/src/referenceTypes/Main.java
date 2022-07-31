package referenceTypes;

import referenceTypes.dataAccess.PersonDal;
import referenceTypes.entities.Customer;
import referenceTypes.entities.Employee;
import referenceTypes.entities.Person;
import referenceTypes.entities.Visitor;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Engin","Demiroð","123456");
		Customer customer2 = customer1;
		
		Person person1 = new Visitor(2,"Selim","Keklik","21005");
		Person person2 = new Employee(3,"Semra","Yýlmaz",21000);
		
		PersonDal personDal = new PersonDal();
		personDal.add(customer2);
		personDal.add(person1);
		personDal.add(person2);
	}

}
