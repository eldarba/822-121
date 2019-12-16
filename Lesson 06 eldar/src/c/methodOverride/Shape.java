package c.methodOverride;

public class Shape {

	/**
	 * This method returns the area of this shape
	 * 
	 * @return implemented to return -1 for now
	 */
	public double getArea() {
		return -1;
	}

	public static void main(String[] args) {

		Shape s1 = new Shape();
		Shape s2 = new Shape();

		System.out.println("area: " + s1.getArea());
		System.out.println("area: " + s2.getArea());
	}

}
