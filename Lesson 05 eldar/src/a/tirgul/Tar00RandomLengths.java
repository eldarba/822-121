package a.tirgul;

import java.util.Arrays;

public class Tar00RandomLengths {

	/*
	 * create a 2dim array of int
	 * 
	 * length of the 1st dimension is random (3 to 10 inclusive)
	 * 
	 * lengths of the 2nd dimension arrays are random (3 to 10 inclusive)
	 * 
	 * populate each element with random number (0 to 100)
	 * 
	 */

	public static void main(String[] args) {

		// create the 1st dimension arrays
		int r = (int) (Math.random() * 8) + 3;
		int[][] arr = new int[r][]; // 3 - 10

		// create the 2d dimension arrays
		for (int i = 0; i < arr.length; i++) { // create the 2 dimension arrays
			arr[i] = new int[(int) (Math.random() * 8) + 3];
//			r = (int) (Math.random() * 8) + 3;
//			arr[i] = new int[r];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// [i][j] is the current element
				arr[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
