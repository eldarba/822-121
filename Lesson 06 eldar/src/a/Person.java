package a;

public class Person extends Object {

	private int id;
	private String name;
	private int age;

	// CTOR A
	public Person(int id, String name, int age) {
		super(); // calling the Object CTOR
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// CTOR B
	public Person(int id) {
		this(id, "", 18); // calling CTOR A
	}

	// CTOR C
	public Person() {
		this(-1); // calling CTOR B
	}

	@Override
	public String toString() {
		return "Person[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Person)) {
			return false;
		}

		Person other = (Person) obj;
		return this.id == other.id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
