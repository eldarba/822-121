package c.arrays;

public class Demo02StaticInitialization {

	public static void main(String[] args) {

		// array static initialization (on object creation)
		int[] arr1 = { 2, 4, 6, 8, 10 };
		String[] arr2 = { "aaa", "bbb", "ccc" };

		// array dynamic initialization (after object creation)
		int[] arr3 = new int[5];
		arr3[0] = 2;
		arr3[1] = 4;
		arr3[2] = 6;
		arr3[3] = 8;
		arr3[4] = 10;

	}

}
