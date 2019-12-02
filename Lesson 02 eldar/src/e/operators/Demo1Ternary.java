package e.operators;

public class Demo1Ternary {

	public static void main(String[] args) {
		int a = 300;
		int b = 400;
		// boolean expression ? returned value if true : returned value if false
		int max = a > b ? a : b;
		int max2 = (a > b) ? (a) : (b);

		System.out.println(max);

		// ! NOT operator reverses the boolean value
		System.out.println(!true);
	}

}
