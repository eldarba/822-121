package lines;

public class Line {

	private int length;

	public Line(int length) {
		super();
		this.length = length;
	}

	public void draw() {
		for (int i = 0; i < length; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Line x = new Line(7);
		x.draw();
	}

}
