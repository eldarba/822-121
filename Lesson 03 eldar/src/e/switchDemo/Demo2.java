package e.switchDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter light: [RED, YELLOW, GREEN]");
		// switch between RED, YELLOW, GREEN
		String light = sc.nextLine();
		System.out.println(light);
		sc.close();

		switch (light) {
		case "RED":
			System.out.println("stop");
			break;
		case "YELLOW":
			System.out.println("get ready");
			break;
		case "GREEN":
			System.out.println("go");
			break;
		}
	}

}
