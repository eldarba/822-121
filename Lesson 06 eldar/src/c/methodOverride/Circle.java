package c.methodOverride;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
//		return 3.14 * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}

}
