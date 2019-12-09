package b.homework.loops;

public class Tar06 {

	/*
	 * Create a class that defines a random value between 0-100,000 and prints if it
	 * is a palindrome (a symmetric number like: 12321, 666, 47974, 404 …
	 */
	public static void main(String[] args) {

		// create the random number
		int x = (int) (Math.random() * 100_001);
		// x = 922222229;
		int xCopy = x;
		// print the random number
		System.out.println("the number is: " + x);

		// declarations - of the values we need to calculate
		int opposite = 0;

		while (x > 0) {
			// process the random number to calculate the values:
			opposite *= 10;
			opposite += x % 10;
			x = x / 10; // remove right digit (since it was processed)
		}

		// print results:
		if (xCopy == opposite) {
			System.out.println("Palindrom");
		} else {
			System.out.println("NOT Palindrom");
		}

	}
}
