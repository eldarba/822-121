package d.references;

public class Line {

	private int length;
	private String color;

	public Line() {
	}

	public Line(int length, String color) {
		this.length = length;
		this.color = color;
	}

//	Line line1 = new Line(3, "Blue");
//	line1.printLength();
	public void printLength(Line this) {
		System.out.println(this.length);
		// the 'this' keyword is a reference to the current object
		// the object that invoked (called) the method
	}

	public void printColor() {
		System.out.println(this.color);
	}

}
