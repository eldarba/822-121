package a.homework;

// class
public class Cat { 

	// attribute
	private int age; 

	// CTOR
	public Cat(int age) { 
		this.age = age;
	}

	// method
	public int getAge() {
		return age;
	}

	// method
	public void setAge(int age) {
		this.age = age;
	}
	
	// method
	public void speak() {
		System.out.println("meow");
	}

}
