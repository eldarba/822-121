package g.animals.impl;

import g.animals.abst.Mammal;
import g.animals.interfaces.Flyer;

public class Bat extends Mammal implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

}
