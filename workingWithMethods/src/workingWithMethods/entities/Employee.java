package workingWithMethods.entities;

public class Employee extends Person{
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String identityNumber, int birthOfYear,double salary) {
		super(id, firstName, lastName, identityNumber, birthOfYear);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
