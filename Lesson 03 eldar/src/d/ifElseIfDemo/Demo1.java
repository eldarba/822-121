package d.ifElseIfDemo;

public class Demo1 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 121);
		System.out.println("Your grade: " + grade);

		// give a text based grade
		// 0 - 54 inclusive - print FAIL
		// 55 - 65 inclusive - print MASPIK
		// 66 - 75 inclusive - print GOOD
		// 76 - 85 inclusive - print VERY GOOD
		// 86 - 100 inclusive - print GREAT
		// other value is illegal

		if (grade >= 0 && grade <= 54) {
			System.out.println("FAIL");
		} else if (grade >= 55 && grade <= 65) {
			System.out.println("MASPIK");
		} else if (grade >= 66 && grade <= 75) {
			System.out.println("GOOD");
		} else if (grade >= 76 && grade <= 85) {
			System.out.println("VERY GOOD");
		} else if (grade >= 86 && grade <= 100) {
			System.out.println("GREAT");
		} else {
			System.out.println(grade + " is not a legal grade");
		}

	}

}
