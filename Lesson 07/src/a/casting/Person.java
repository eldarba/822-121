package a.casting;

public class Person {
	
	protected String name;
	
	// CTOR
	public Person(String name) {
		super();
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " is speaking");
	}

}
