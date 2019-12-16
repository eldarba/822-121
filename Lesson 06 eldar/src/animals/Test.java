package animals;

public class Test {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[7];
		
//		animals[n] is a reference of type Animal
		// the reference determines which methods we can call
		// the actual object (type) at runtime determines the behavior
		
		animals[0] = new Cat();
		animals[1] = new Cat();
		animals[2] = new Cat();
		animals[3] = new Dog();
		animals[4] = new Dog();
		animals[5] = new Cow();
		animals[6] = new Crow();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
		
	}

}
