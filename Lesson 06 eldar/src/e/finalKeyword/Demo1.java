package e.finalKeyword;

public class Demo1 {

	public static void main(String[] args) {

		// final variable
		final int x = 5;
		System.out.println(x);

//		x = 25; // cannot reasign a final variable
//		System.out.println(x);

		// blank final variable
		final int y;
		System.out.println("y is not yet initialized");
		y = 100; // from now on y value cannot be changed
	}
}
