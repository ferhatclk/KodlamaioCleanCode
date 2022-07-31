package workingWithMethods.entities;

public class Customer extends Person{
	private int cityId;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String identityNumber, int birthYear, int cityId) {
		super(id, firstName, lastName, identityNumber,birthYear);
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
