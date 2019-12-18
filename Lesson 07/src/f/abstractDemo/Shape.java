package f.abstractDemo;

// abstract class - cannot be instantiated
public abstract class Shape {

	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	// abstract method - enforces inheritors to override (implement)
	public abstract double getArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
