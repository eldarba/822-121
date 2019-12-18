package g.animals.impl;

import g.animals.abst.Mammal;
import g.animals.interfaces.AdvancedFlyer;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a bat");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
	}

}
