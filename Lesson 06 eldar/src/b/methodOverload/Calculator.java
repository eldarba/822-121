package b.methodOverload;

public class Calculator {

	// method definition version A
	public int sum(int a, int b) {
		return a + b;
	}

	// method overload: same method name, different parameters
	// method definition version B
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();

		// method invocation
		int sum = c.sum(3, 6);
		System.out.println(sum);

		sum = c.sum(10, 30);
		System.out.println(sum);

		sum = c.sum(2, 4, 6);

		System.out.println();

	}

}
