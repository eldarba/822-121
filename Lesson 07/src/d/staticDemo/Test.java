package d.staticDemo;

public class Test {

	public static void main(String[] args) {
		System.out.println("nmber of cars made: " + Car.getCounter());
		
		Car c1 = new Car(1, 20);
		Car c2 = new Car(2, 100);
		Car c3 = new Car(3, 0);

		System.out.println("nmber of cars made: " + Car.getCounter());
	}
}
