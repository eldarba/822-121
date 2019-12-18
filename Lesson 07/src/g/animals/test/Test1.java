package g.animals.test;

import g.animals.abst.Animal;
import g.animals.impl.Ant;
import g.animals.impl.Bat;
import g.animals.impl.Butterfly;
import g.animals.impl.Cat;
import g.animals.impl.Hawk;
import g.animals.impl.Ostrich;
import g.animals.interfaces.Flyer;

public class Test1 {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[6];
		
		animals[0] = new Bat();
		animals[1] = new Cat();
		animals[2] = new Ostrich();
		animals[3] = new Hawk();
		animals[4] = new Butterfly();
		animals[5] = new Ant();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.speak();
			
			if(animal instanceof Flyer) {
				Flyer flyer = (Flyer) animal;
				flyer.fly();
			}
			
			System.out.println("===============");
		}
	}

}
