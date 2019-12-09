package b.homework.loops;

public class Tar05 {

	/*
	 * Create a class that defines a random number with value between 0 - 10,000 and
	 * print the following details with clear messages:
	 * 
	 * o number of digits [4867 => 4]
	 * 
	 * o the first left digit [ 6843 => 6]
	 * 
	 * o sum of the number’s digits [ 473 => 14]
	 * 
	 * o opposite order of the number’s digits [5892 => 2985]
	 */
	public static void main(String[] args) {

		// create the random number
		int x = (int) (Math.random() * 10_001);
//		x = 12321;
		// print the random number
		System.out.println("the number is: " + x);

		// declarations - of the values we need to calculate
		int numberOfDigits = 1, firstLeftDigit, sumOfDigits = 0, opposite = 0;

		while (x > 9) {
			// process the random number to calculate the values:
			numberOfDigits++;
			sumOfDigits += x % 10;
			opposite *= 10;
			opposite += x % 10;

			x = x / 10; // remove right digit (since it was processed)
		}

		// process the last digit

		firstLeftDigit = x;

		sumOfDigits += x;

		opposite *= 10;
		opposite += x;

		// print results:
		System.out.println("number of digits: " + numberOfDigits);
		System.out.println("left digit: " + firstLeftDigit);
		System.out.println("sum of digit: " + sumOfDigits);
		System.out.println("oposit number: " + opposite);

	}
}
