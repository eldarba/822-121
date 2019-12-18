package g.animals.impl;

import g.animals.abst.Insect;
import g.animals.interfaces.Flyer;
import g.animals.interfaces.Navigator;

public class Butterfly extends Insect implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a butterfly");
	}
	
	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a butterfly");
	}

}
