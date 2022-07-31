package workingWithMethods.entities;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int birthOfYear;
	public Person() {
		super();
	}
	public Person(int id, String firstName, String lastName, String identityNumber, int birthOfYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthOfYear = birthOfYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	
}
