package c.arrays;

public class Demo08Summary {

	public static void main(String[] args) {
		// WAYS OF CREATING ARRAYS:

		// simple array (1 dimension) - dynamic initialization
		int[] arr1 = new int[5];
		// simple array (1 dimension) - static initialization
		int[] arr2 = { 3, 6, 9 };

		// multi-dimensional array (2 dimensions) - dynamic initialization
		// option 1
		int[][] arr3 = new int[3][5];
		// option 2
		int[][] arr4 = new int[3][];
		arr4[0] = new int[6];
		arr4[1] = new int[3];
		arr4[2] = new int[7];

		// multi-dimensional array (2 dimensions) - static initialization
		int[][] arr5 = { { 1, 1, 1, 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3, 3, 3 } };
	}

}
