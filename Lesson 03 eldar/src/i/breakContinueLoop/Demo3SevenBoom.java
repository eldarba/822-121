package i.breakContinueLoop;

public class Demo3SevenBoom {

	// continue - keyword
	// label - identifier

	public static void main(String[] args) {

		lbl1: for (int i = 0; i <= 10_000; i++) {
			// what if the number divides by 7
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}

			// what if the number contains a 7 digit
			// we need to check each digit
			int val = i;
			while (val != 0) {
				if (val % 10 == 7) {
					System.out.println("BOOM");
					continue lbl1;
				} else {
					val = val / 10;
				}
			}

			System.out.println(i); // print the number
		}

	}

}
