package a.homework.ifTars;

public class Tar5 {
	/*
	 * Create a class that defines 3 random numbers and prints o the bigger value
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);

		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

		System.out.println("================");

		// same thing using ternary operator
		int max = a > b && a > c ? a : b > c ? b : c;
		System.out.println(max);

	}
}
