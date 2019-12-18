package e.singletonDemo;

// static import below
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.random;

public class StaticImportDemo {

	public static void main(String[] args) {

		System.out.println("PI = " + PI);
		System.out.println("e = " + E);

		int r = (int) (random() * 11);
		System.out.println("r = " + r);
	}

}
