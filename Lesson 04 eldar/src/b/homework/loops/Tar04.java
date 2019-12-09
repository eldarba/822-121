package b.homework.loops;

public class Tar04 {
	/*
	 * Create a class that defines two random values ‘max’ and ‘den’ and prints all
	 * the numbers from 0 to ‘max’ that can be divided with ‘den’
	 */
	public static void main(String[] args) {

		int max = (int) (Math.random() * 201);
		int den = (int) (Math.random() * 25) + 1; // 1 - to 25

		System.out.println("max = " + max);
		System.out.println("den = " + den);

		int itr = 0;
		for (int i = 0; i <= max; i += den) {
			itr++;
			System.out.print(i + ", ");
		}
		System.out.println("\nnumber of iterations: " + itr);

		System.out.println();
		itr = 0;

		// not recommended - many iterations and logical operations
		for (int i = 0; i <= max; i++) {
			itr++;
			if (i % den == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\nnumber of iterations: " + itr);

	}
}
