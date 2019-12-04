package a;

public class CastDemo {

	public static void main(String[] args) {

		int x = 100; // 32 bit

		// convert the int (32 bit) value of x to type short (16 bit)
		short y = (short) x; // explicit casting

		// convert the int (32 bit) value of x to type long (64 bit)
		long z = x; // implicit casting

	}

}
