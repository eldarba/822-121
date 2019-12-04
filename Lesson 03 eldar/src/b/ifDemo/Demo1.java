package b.ifDemo;

public class Demo1 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		System.out.println(x);

		// if x is bigger than 5 print BIG
		if (x > 5) {
			System.out.println("BIG");
		}

		System.out.println("=== END OF PROGRAM ===");
	}
}
