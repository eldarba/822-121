package a.homework.ifTars;

public class Tar7 {

	/*
	 * Create a class that randomize a value to present a year (like 970, 1990, 2010
	 * …) and prints the year and if it is leap year or not.
	 * 
	 * o leap year must:
	 * 
	 * divide by 4 not divide by 100 if divided by 100 must also divide by 400
	 */
	public static void main(String[] args) {

		int year = (int) (Math.random() * 8_001) - 4_000;
//		year = 400; // test your code
		System.out.println("year: " + year);

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not a leap year");
		}

	}
}
