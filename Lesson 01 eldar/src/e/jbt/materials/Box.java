package e.jbt.materials;

public class Box {

	// attributes
	private int length;
	private int width;
	private int height;

	/*
	 * a constructor is a special method that run when an object is created and set
	 * the state of the new object
	 */
	// CTOR 1
	public Box(int length, int width, int height) {
		setLength(length);
		this.width = width;
		this.height = height;
	}

	// CTOR 2
	public Box(int val) {
		setLength(val);
		setWidth(val);
		setHeight(val);
	}

	// methods
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		// "this" means an attribute of this object
		if (length >= 0) {
			this.length = length;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
