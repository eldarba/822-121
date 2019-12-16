package c.methodOverride;

public class Tar1 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];

		shapes[0] = new Rectangle(3, 3);
		shapes[1] = new Rectangle(2, 4);
		shapes[2] = new Circle(5);
		shapes[3] = null;
		shapes[4] = new Circle(7);

		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) { // make sure the reference to current shape is not null
				System.out.println("area: " + shapes[i].getArea());
			}
		}

	}
}
