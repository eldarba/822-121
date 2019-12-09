package a.homework.ifTars;

public class TaxCalculator {

	/*
	 * Salary taxes are calculated according to the following:
	 * 
	 * o 0- 23,000 nis -> * tax rate is 10%
	 * 
	 * o 23,000- 50,000 nis -> tax rate is 20%
	 * 
	 * o 50,000- 100,000 nis -> tax rate is 30%
	 * 
	 * o 100,000 - up nis -> tax rate is 40%
	 * 
	 * Create a class named “TaxCalculator” that takes a salary of an employee
	 * (randomize a value to be used as an input) and prints the valid value after
	 * tax calculation
	 */

	public static void main(String[] args) {

		int salary = (int) (Math.random() * 150_001);
		// salary = 100; // check results
		System.out.println("salary: " + salary);

		double tax = 0;

		if (salary < 23_000) {
			tax += salary * 0.1;
		} else {
			tax += 23_000 * 0.1; // entire first step
			if (salary < 50_000) {
				tax += (salary - 23_000) * 0.2;
			} else {
				tax += 27_000 * 0.2; // entire second step
				if (salary < 100_000) {
					tax += (salary - 50_000) * 0.3;
				} else {
					tax += 50_000 * 0.3; // entire third step
					tax += (salary - 100_000) * 0.4;
				}
			}
		}

		System.out.println("tax: " + tax);
		System.out.println("net salary: " + (salary - tax));

	}

}
