package a.homework;

public class Circle {
	
	// attribute - ������ ��������
	private int radius;
	
	// CTOR - ����� ������ ������ ��������
	public Circle(int radius) {
		this.radius = radius;
		// the 'this' keyword is a reference to the object attribute
	}
	
	// method - ����� ����� ������ �� �����
	public int getRadius() {
//		return this.radius;
		return radius;
	}
	
	// method - ����� ������ ����� ��� �����
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
