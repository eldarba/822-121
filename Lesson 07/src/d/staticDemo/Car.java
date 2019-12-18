package d.staticDemo;

public class Car {
	/*
	 * static
	 * 
	 * final
	 * */

	// STATIC FIELDS 
	// class variables
	private static int counter;
	private static int counterPainted;
	// constant - combination of static and final
	public static final int MAX_SPEED = 180;

	// NON-STATIC FIELDS 
	// instance variables - attributes
	public final int number; // final attribute - initialized and not changed
	private int speed; // instance variable - can be changed
	private String color;
	
	// initializer - runs before CTORs
	{
		System.out.println("Car instance created");
		counter++;
	}
	
	// static initializer - runs on class load
	static{
		System.out.println("Car class loaded");
	}

	// CTOR 1
	public Car(int number, int speed, String color) {
		super();
		this.number = number;
		setSpeed(speed);
		this.color = color;
		counterPainted++;
	}
	

	// CTOR 2
	public Car(int number, int speed) {
		super();
		this.number = number;
		this.speed = speed;
	}


	// CTOR 3
	public Car() {
		this(-1, 0);
	}

	// static method - class method
	public static int getCounter() {
		return counter;
	}



	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

}
