package f.whileLoop;

public class Demo3 {

	public static void main(String[] args) {

		// print all numbers from 25 to 1500 that
		// divide by 5 and 3 and 7

		/*
		 * start by writing a loop that prints all numbers from 25 to 1500. Then, see
		 * what you can do to print only the ones that meet the requirements
		 */

		int c = 25;
		while (c <= 1500) {
			if (c % 3 == 0 && c % 5 == 0 && c % 7 == 0) {
				System.out.print(c + ", ");
			}
			c++;
		}
		System.out.println();
	}
}
