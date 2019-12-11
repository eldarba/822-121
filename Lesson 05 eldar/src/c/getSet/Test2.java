package c.getSet;

public class Test2 {
	
	public static void main(String[] args) {
		
		Pixel px = new Pixel();
		px.printDetails();
		System.out.println("color: " + px.getColor());
		
		px.setColor("Red");
		px.setX(25);
		px.setY(70);
		px.printDetails();
		System.out.println("color: " + px.getColor());
	}

}
