package a.homework;

public class Circle {
	
	// attribute - תכונות האובייקט
	private int radius;
	
	// CTOR - מתודה מיוחדת לבניית האובייקט
	public Circle(int radius) {
		this.radius = radius;
		// the 'this' keyword is a reference to the object attribute
	}
	
	// method - מתודה לקבלת הרדיוס של המעגל
	public int getRadius() {
//		return this.radius;
		return radius;
	}
	
	// method - מתודה לקביעת רדיוס חדש למעגל
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
