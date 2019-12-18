package d.staticDemo;

public class MyUtilClass {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		// static reference - using the class name as a reference
		int sumAB = MyUtilClass.sum(4, 6);
		System.out.println(sumAB);
		
		System.out.println(Math.PI);
	}

}
