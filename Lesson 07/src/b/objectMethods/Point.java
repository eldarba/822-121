package b.objectMethods;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		return this.x == other.x && this.y == other.y;

//		if (this.x == other.x && this.y == other.y) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	@Override
	public int hashCode() {
		return 100 + x + y * 2 * y;
	}



	public static void main(String[] args) {
		Point p1 = new Point(5, 9);
		Point p2 = new Point(9, 5);
		System.out.println(p1 + ", " + p2 + " same? " + p1.equals(p2));
		System.out.println("hashcode: " + p1.hashCode());
		System.out.println("hashcode: " + p2.hashCode());
	}

}
