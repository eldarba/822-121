package g.animals.impl;

import g.animals.abst.Insect;
import g.animals.interfaces.Navigator;

public class Ant extends Insect implements Navigator {

	@Override
	public void speak() {
		System.out.println("speak like an ant");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like an ant");
	}

}
