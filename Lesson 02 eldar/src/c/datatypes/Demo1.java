package c.datatypes;

public class Demo1 {

	public static void main(String[] args) {
		byte x1 = 5;
		System.out.println(x1);
		x1 = 127;
		System.out.println(x1);
		x1++; // will overflow to the lower limit
		System.out.println(x1);
	}
}
