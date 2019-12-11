package c.getSet;

/**
 * Point is a location with x and y coordinates in the range 0 to 100 inclusive
 */
public class Point {

	private int x;
	private int y;

	// CTOR 1
	public Point() {
	}

	// CTOR 2
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0 && x <= 100) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0 && y <= 100) {
			this.y = y;
		}
	}

	public void printDetails() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
