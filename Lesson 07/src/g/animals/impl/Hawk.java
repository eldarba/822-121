package g.animals.impl;

import g.animals.abst.Bird;
import g.animals.interfaces.Flyer;

public class Hawk extends Bird implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a hawk");
	}
	@Override
	public void fly() {
		System.out.println("fly like a hawk");
	}
}
