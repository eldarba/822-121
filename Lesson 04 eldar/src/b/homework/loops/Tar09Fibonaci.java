package b.homework.loops;

public class Tar09Fibonaci {

	/*
	 * Create a class that defines a random value between 0-50 and prints Fibonacci
	 * set from 1 to that value
	 */
	public static void main(String[] args) {

		int x = (int) (Math.random() * 51); // 0 to 50 inclusive
		// x = 0;
		System.out.println("print all Fibonaci elements up to " + x);

		long f1 = 1; // first element in Fibonaci
		long f2 = 1; // second element in Fibonaci

		while (f1 <= x) {
			System.out.print(f1 + ", ");
			// increment f1 and f2 for the next Fibonaci element
			long temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}

	}

}
