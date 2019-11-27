package c;

public class Test {
	// test
	public static void main(String[] args) {
		// Declare a Rectangle reference named x
		Rectangle x1;
		// create a rectangle object and assign it to the x reference
		x1 = new Rectangle();
		// use the object
		x1.setLengh(12); // assign the rectangle length
		x1.setWidth(5); // assign the rectangle width
		System.out.println(x1.getLength());
		System.out.println(x1.getWidth());
		System.out.println(x1.getArea());
		System.out.println(x1.getPerimeter());
	}
}
