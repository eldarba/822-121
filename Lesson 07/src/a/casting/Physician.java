package a.casting;

public class Physician extends Person {

	public Physician(String name) {
		super(name);
	}
	
	public void treat(Person person) {
		System.out.println("Doctor " +  name + " is treating " + person.name);
	}

}
