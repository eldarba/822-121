package b.homework.loops;

public class Tar07 {
	/*
	 * Create a class that defines a random number between 0-100 and prints the
	 * factorial value [4 => 1 X 2 X 3 X 4
	 */
	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
//		x = 5;
		long f = 1;

		for (int i = 2; i <= x; i++) {
			f *= i;
		}

		System.out.println(x + "! = " + f);

	}

}
