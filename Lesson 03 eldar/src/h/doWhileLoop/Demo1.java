package h.doWhileLoop;

public class Demo1 {

	public static void main(String[] args) {

		int c = 1;

		do { // post-test loop - minimum iterations 1
			System.out.println(c);
			c++;
		} while (c <= 5);

	}
}
