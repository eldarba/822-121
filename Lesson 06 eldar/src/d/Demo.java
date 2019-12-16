package d;

import animals.Animal;
import animals.Cow;
import animals.Dog;

public class Demo {
	
	public static void main(String[] args) {
		
		Dog x = new Dog();
		// we created a dog object
		// x is a reference to the dog object
		
		// using the reference we ask the dog object to speak
		x.speak();
		
		// arrays
		
		Animal[] animals = {new Dog(), new Cow()};
		
		animals[0].speak();
	}

}
