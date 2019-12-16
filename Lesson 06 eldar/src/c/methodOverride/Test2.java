package c.methodOverride;

public class Test2 {

	public static void main(String[] args) {
		
		// references
		Shape s = null;
		Rectangle r = null;
		Circle c = null;
		
		// assign references to objects
		s = new Shape();
		System.out.println("shape area: " + s.getArea());
		s = new Circle(5);
		System.out.println("circle area: " + s.getArea());
		s = new Rectangle(5, 7);
		System.out.println("rectangle area: " + s.getArea());
		
		
		r = new Rectangle(10, 3);
		
		c = new Circle(8);
		
		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = r;
//		rectangles[1] = s; // error
//		rectangles[2] = c; // error
		
		Circle[] circles = new Circle[3];
//		circles[0] = r; // error
//		circles[1] = s; // error
		circles[2] = c;
		
		
		Shape[] shapes = new Shape[3];
		shapes[0] = r;
		shapes[1] = s;
		shapes[2] = c;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
