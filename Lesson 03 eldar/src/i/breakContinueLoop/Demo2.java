package i.breakContinueLoop;

public class Demo2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i == 10) {
				continue; // skip iteration
			}
			System.out.print(i + ", ");

		}
	}
}
