package a;

public class Employee extends Person {

	private double salary;

	// CTOR A
	public Employee(int id, String name, int age, double salary) {
		super(id, name, age); // calling CTOR A in super class
		this.salary = salary;
	}

	// CTOR B
	public Employee(int id) {
		super(id); // calling CTOR B in super class
	}

	// CTOR C
	public Employee() {
		// super();
	}

}
