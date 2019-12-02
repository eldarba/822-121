package e.string.concat;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * create 2 random numbers (0 - 100) and:
		 * 
		 * 1. print them
		 * 
		 * 2. print them in one line separated with comma
		 * 
		 * 3. print them as a sum expression [20 + 30 = 50]
		 * 
		 * 4. print them as a difference expression [20 - 30 = -10]
		 * 
		 * 5. print them as a multiplication expression [50 * 4 = 200]
		 * 
		 * 6. print them as a division expression [10 : 3 = 3, remainder 1]
		 */
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		// 1
		System.out.println(a);
		System.out.println(b);
		// 2
		System.out.println(a + ", " + b);
		// 3.
		System.out.println(a + " + " + b + " = " + (a + b));
		// 4.
		System.out.println(a + " - " + b + " = " + (a - b));
		// 5.
		System.out.println(a + " * " + b + " = " + (a * b));
		// 6.
		System.out.println(a + " : " + b + " = " + (a / b) + ", remainder " + (a % b));
		// 6 B by Ori & Eldar
		int mana = a / b;
		int rem = a % b;
		System.out.println(a + " : " + b + " = " + mana + ", remainder " + rem);

	}

}
