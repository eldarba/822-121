package animals;

public class Dog extends Animal {

	public void speak() {
		super.speak(); // calling the method in the super class
		System.out.println("Woof");
	}
}
