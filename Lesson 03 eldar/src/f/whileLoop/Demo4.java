package f.whileLoop;

import java.util.Scanner;

public class Demo4 {

	// get an even number from the user
	// if the user types in an odd number keep asking for
	// even number until you get it from the user.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an even number: ");
		int input = sc.nextInt();

		while (input % 2 != 0) {
			System.out.println("The number must be even");
			System.out.print("Enter an even number: ");
			input = sc.nextInt();
		}

		sc.close();

		System.out.println("Thank you.");
		System.out.println("Your number was: " + input);
	}

}
