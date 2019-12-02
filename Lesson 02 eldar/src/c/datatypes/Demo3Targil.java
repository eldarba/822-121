package c.datatypes;

public class Demo3Targil {

	public static void main(String[] args) {

		double x = 450.3F;
		long y = 999999L;
		int z = 3;

		double sum = x + y + z;

		System.out.println(sum);
		System.out.println(sum / 3);

		// double is not so accurate in big values (order of magnitude)
		double bigNum = 10000000000000000000000D;
		System.out.println(bigNum);
		System.out.println(bigNum + 500000000000000D);

		// scientific notation
		double milion = 1.0E6; // 1.0 * 10^6
		System.out.println(milion);
	}

}
