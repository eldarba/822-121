package c.wrapperClasses;

public class Demo1 {

	public static void main(String[] args) {
		
		int xPrimitive = 5;
		
		Integer xWrapperOldStyle = new Integer(5);
		Integer xWrapperNewStyle = 5; // auto inbox
		
		System.out.println(xWrapperNewStyle);
		
		// methods and fields
		
		// minimum and maximum
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// convert String to int using parseInt
		String numberAsString = "259";
		int numberAsInt = Integer.parseInt(numberAsString);
		System.out.println(numberAsInt);
		numberAsInt++;
		System.out.println(numberAsInt);
		
		
		
	}
}
