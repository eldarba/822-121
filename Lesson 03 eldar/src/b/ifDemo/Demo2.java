package b.ifDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		// for input operation we need a Scanner (object)

		// System.in is the default input - keyboard
		Scanner sc = new Scanner(System.in);
		// prompt the user for input
		System.out.print("type a number: ");
		// get the input from user
		int x = sc.nextInt();
		// print the user input
		System.out.println(x);
		sc.close();
	}

}
