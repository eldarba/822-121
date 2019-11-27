package e.jbt.materials;

public class Test1 {

	public static void main(String[] args) {

		Box c1 = new Box(-100, 200, 300);
		Box c2 = new Box(5);
		
		System.out.println(c2.getLength());
		System.out.println(c2.getWidth());
		System.out.println(c2.getHeight());
		

		System.out.println(c1.getLength());
		System.out.println(c1.getWidth());
		System.out.println(c1.getHeight());
		
		c1.setLength(2);
		c1.setWidth(4);
		c1.setHeight(6);
		
		System.out.println(c1.getLength());
		System.out.println(c1.getWidth());
		System.out.println(c1.getHeight());

	}

}
