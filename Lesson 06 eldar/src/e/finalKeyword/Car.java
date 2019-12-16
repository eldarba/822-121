package e.finalKeyword;

public class Car {

	public final int number;
	public int speed;
	
	public Car(int number) {
		this.number = number;
	}
	
	public final void drive() {
		System.out.println("driving now ...");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(101);
		Car c2 = new Car(102);
		Car c3 = new Car(103);
		
		System.out.println(c1.number);
		System.out.println(c2.number);
		System.out.println(c3.number);
		
		c1.speed = 200;
		c1.speed = 300;
		c1.speed = 400;
//		c1.number = 111;
	}
}
