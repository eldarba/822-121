package c.getSet;

public class Test {

	public static void main(String[] args) {

		Point p = new Point();
		p.printDetails();

		p.setX(100);
		p.setY(50);
		p.printDetails();

		p.setX(150);
		p.setY(3);
		p.printDetails();
	}

}
