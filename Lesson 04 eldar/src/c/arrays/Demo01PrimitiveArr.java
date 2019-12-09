package c.arrays;

public class Demo01PrimitiveArr {

	public static void main(String[] args) {

		System.out.println((int) ' ' + " is unicode value for space");

		// arr is a reference (stored in stack memory)
		// the actual array object is stored in heap memory
		char[] arr = new char[5];

		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';

		for (int i = 0; i < arr.length; i++) {
			// print element at index i from the arr array
			System.out.println(arr[i]);
		}

	}

}
