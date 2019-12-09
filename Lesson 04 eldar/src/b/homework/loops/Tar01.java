package b.homework.loops;

public class Tar01 {

	/*
	 * Create a class that defines a random number and prints all numbers from 1 to
	 * that number
	 */
	public static void main(String[] args) {

		int x = (int) (Math.random() * 51);
//		x = 0;
//		x = 1;

		System.out.println("x=" + x);

		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}

	}

}
