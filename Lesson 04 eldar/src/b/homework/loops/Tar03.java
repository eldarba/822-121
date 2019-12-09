package b.homework.loops;

public class Tar03 {

	/*
	 * Create a class that defines a random number and prints all even numbers from
	 * 0 to that number
	 */
	public static void main(String[] args) {
		int x = (int) (Math.random() * 26);
		System.out.println("x=" + x);

		for (int i = 0; i <= x; i += 2) {
			System.out.print(i + ", ");
		}

//		System.out.println();
//
//		for (int i = 0; i <= x; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + ", ");
//			}
//		}
	}
}
