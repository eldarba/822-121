package b.homework.loops;

public class Tar08Fibonaci {

	/*
	 * Fibonacci set is an array of numbers. Each number is the sum value of the two
	 * previous numbers. The first number is 1
	 * 
	 * [1,1,2,3,5,8,13,21,34,55,89…]
	 * 
	 * Create a class that defines a random number named “index” with a value
	 * between 0-50 and prints the number in Fibonacci set that is located in the
	 * “index” position
	 */
	public static void main(String[] args) {

		int index = (int) (Math.random() * 50) + 1; // 1 to 50 inclusive
		index = 50;
		System.out.println("the index is: " + index);

		long f1 = 1; // first element in Fibonaci
		long f2 = 1; // second element in Fibonaci

		for (int i = 3; i <= index; i++) {
			// increment f1 and f2 for the next Fibonaci element
			long temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}

		System.out.println(f2);

	}

}
