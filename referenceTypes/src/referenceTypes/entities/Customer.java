package referenceTypes.entities;

public class Customer extends Person{
	private String creditCardNumber;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName,String creditCardNumber) {
		super(id,firstName,lastName);
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
}
