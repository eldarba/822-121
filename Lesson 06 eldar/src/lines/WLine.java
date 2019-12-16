package lines;

public class WLine extends Line {

	private int width;

	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	@Override
	public void draw() {
		for (int i = 0; i < width; i++) {
			super.draw(); // call the original method in the superclass
		}
	}

	public static void main(String[] args) {
		WLine x = new WLine(10, 3);
		x.draw();
	}
}
