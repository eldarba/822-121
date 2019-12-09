package b.homework.loops;

public class Tar02 {
	/*
	 * Create a class that defines two random values and prints all values between
	 * them. note - which variable holds the higher value is not known.
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 26);
		int b = (int) (Math.random() * 26);

		System.out.println("a=" + a + ", b=" + b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("a=" + a + ", b=" + b);

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}

	}
}
