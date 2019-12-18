package d.staticDemo;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("car max speed: " + Car.MAX_SPEED); 
		
		System.out.println(Car.getCounter());
		
		Car c1 = new Car(101, 20);
		Car c2 = new Car(102, 20);
		Car c3 = new Car(103, 20);
		
		System.out.println(Car.getCounter());
		
	}

}
