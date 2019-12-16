package e.finalKeywordf.casting;

import animals.Animal;
import animals.Cat;
import animals.Crow;

public class Demo1 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		Animal animal = cat; // up cast is implicit
		
		// the casting operator (Type) is used to convert variables to another type
		cat = (Cat)animal; // down cast is explicit (programmer responsibility - use instanceof operator)
		
		//==================
		
		Object obj = new Crow();
		
		// casting from Object to Animal
		Animal a = (Animal) obj;
		a.speak();
		
		// casting from Object to Crow
		Crow c = (Crow) obj;
		c.speak();
		c.fly();
		
		// on the fly casting (without declaring new reference)
		((Animal)obj).speak();
		((Crow)obj).fly();
		
		
		
	}
}
