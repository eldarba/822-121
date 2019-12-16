package a;

public class PersonTest {

	public static void main(String[] args) {

		// BECAUSE WE DEFINED 3 CTORS WE HAVE 3 WAYS TO CREATE A PERSON OBJECT
		Person p1 = new Person(101, "Ben", 33);
		Person p2 = new Person(102);
		Person p3 = new Person();

		// BECAUSE WE DEFINED 3 CTORS WE HAVE 3 WAYS TO CREATE AN EMPLOYEE OBJECT
		Employee e1 = new Employee(201, "Danna", 25, 20_000);
		Employee e2 = new Employee(202);
		Employee e3 = new Employee();

	}
}
