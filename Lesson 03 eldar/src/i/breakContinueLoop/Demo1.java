package i.breakContinueLoop;

public class Demo1 {

	public static void main(String[] args) {

		int c = 1;

		while (true) {
			System.out.println("Hello");
			if (c == 5) {
				break; // exit the loop
			}
			c = (int) (Math.random() * 11);
		}
	}
}
