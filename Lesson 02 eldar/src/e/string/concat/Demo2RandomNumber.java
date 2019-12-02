package e.string.concat;

public class Demo2RandomNumber {

	public static void main(String[] args) {

		// integer 0 - 10 inclusive
		System.out.println((int) (Math.random() * 11));
		// integer 0 - 100 inclusive
		System.out.println((int) (Math.random() * 101));
		// integer 0 - 3 inclusive
		System.out.println((int) (Math.random() * 4));

		// integer 3 - 6 inclusive
		System.out.println((int) (Math.random() * 4) + 3);
		// integer 100 - 102 inclusive
		System.out.println((int) (Math.random() * 3) + 100);
		// integer 10 - 20 inclusive
		System.out.println((int) (Math.random() * 11) + 10);
		// integer 20 - 25 inclusive
		System.out.println((int) (Math.random() * 6) + 20);
		// integer -20 - -10 inclusive
		System.out.println((int) (Math.random() * 11) - 20);

	}

}
