package c;

public class Test2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
//		r.length = 4;
		r.setLengh(4); // invoke a method
//		r.width = 2;
		r.setWidth(2);
		
		System.out.println(r.getArea());

	}

}
