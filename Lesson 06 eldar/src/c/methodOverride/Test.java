package c.methodOverride;

public class Test {
	
	
	
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(2, 6);
		Circle c1 = new Circle(3);
		
		System.out.println(r1.getArea());
		System.out.println(c1.getArea());
		
		Shape shape; // super reference - can point to any Shape subtype
		shape = new Rectangle(2, 3);
		shape = new Circle(5);
		
		
	}
}
