package referenceTypes.entities;

public class Visitor extends Person{
	private String visitorCardNumber;

	public Visitor() {
		super();
	}

	public Visitor(int id, String firstName, String lastName,String visitorCardNumber) {
		super(id, firstName, lastName);
		this.visitorCardNumber = visitorCardNumber;
	}

	public String getVisitorCardNumber() {
		return visitorCardNumber;
	}

	public void setVisitorCardNumber(String visitorCardNumber) {
		this.visitorCardNumber = visitorCardNumber;
	} 
}
