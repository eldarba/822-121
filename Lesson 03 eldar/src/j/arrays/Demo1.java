package j.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// create an array object
		int[] arr = new int[5];
		System.out.println("array length: " + arr.length);

		// populate with elements
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;

		// print the elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// there is a way to print the array
		System.out.println(Arrays.toString(arr));
	}
}
