package a.homework.ifTars;

public class Tar3 {
	/*
	 * Create a new class that defines a random number with a value between 0-100. o
	 * if the value is between 0-50 – print “Small !” o else – print “Big !” in
	 * addition : o if the value is even (can be divided by 2) – print “Even” o else
	 * – print “Odd”
	 */
	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);

		System.out.println("the number is: " + x);

		if (x <= 50) {
			System.out.println("Small");
		} else {
			System.out.println("Big");
		}

		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
