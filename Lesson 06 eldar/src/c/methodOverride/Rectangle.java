package c.methodOverride;

public class Rectangle extends Shape {

	// attributes
	private int length;
	private int width;
	
	

	// CTOR
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;

	}

	public double getArea() {
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 6);
		System.out.println("area: " + r1.getArea());
	}

}
