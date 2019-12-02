package d.references;

public class TestLine {

	public static void main(String[] args) {
		Line line1 = new Line(3, "Blue");
		Line line2 = new Line(10, "Yellow");

		line1.printColor();
		line1.printLength();

		line2.printColor();
		line2.printLength();
	}
}
