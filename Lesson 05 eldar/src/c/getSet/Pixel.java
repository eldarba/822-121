package c.getSet;

public class Pixel extends Point {

	private String color;

	public Pixel() {
//		super(); // default call to super CTOR
	}

	public Pixel(int x, int y) {
		this(x, y, "black");// invoking another CTOR in this class
	}

	public Pixel(int x, int y, String color) {
		super(x, y); // invoking another CTOR in super class
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
