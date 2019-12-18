package b.objectMethods;

public class Car {
	
	private int number;
	private String color;
	private double speed;
	
	public Car(int number, String color) {
		super();
		this.number = number;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	// override Object methods
	
	@Override
	public String toString() {
		String str = "Car[number=" + number + ", color=" + color + ", speed=" + speed + "]";
		return str;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Car)) {
			return false;
		}
		
		// if we are here obj is a car
		Car other = (Car) obj;
		
		if(this.number == other.number) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Car c1 = new Car(111, "Yellow");
		Car c2 = new Car(111, "Red");
		Car c3 = new Car(222, "Blue");
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.equals("Yellow"));
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
