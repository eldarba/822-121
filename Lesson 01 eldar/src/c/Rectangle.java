package c;

public class Rectangle {
	// 1. attributes
	private int length;
	private int width;
	// 2. constructor (one or more)
	// 3. methods (operations)

	// getter and setter for the length
	public int getLength() {
		return length;
	}

	public void setLengh(int newLength) {
		if (newLength >= 0) {
			length = newLength;
		}
	}

	// getter and setter for the width
	public int getWidth() {
		return width;
	}

	public void setWidth(int newWidth) {
		if (newWidth >= 0) {
			width = newWidth;
		}
	}

	int getArea() {
		int area = length * width;
		return area;
	}

	// a method that returns the perimeter of the rectangle
	int getPerimeter() {
		int perimeter = (length + width) * 2;
		return perimeter;
	}
}
