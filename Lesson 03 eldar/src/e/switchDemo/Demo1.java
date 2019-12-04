package e.switchDemo;

public class Demo1 {

	public static void main(String[] args) {

		// switch between 1, 2, 3, 4
		int key = 3;

		switch (key) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		}

		// switch between ON, OFF, STAND_BY
		String keyA = "ON";
		String keyB = "OFF";
		String keyC = "STAND_BY";

		switch (keyC) {
		case "ON":
			System.out.println("machine is on");
			break;
		case "OFF":
			System.out.println("machine is off");
			break;
		case "STAND_BY":
			System.out.println("machine is on stand by");
			break;
		}

		// switch between RED, YELLOW, GREEN
		String red = "RED";
		String yellow = "YELLOW";
		String green = "GREEN";

		switch (yellow) {
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
