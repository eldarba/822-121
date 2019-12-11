package a.tirgul;

public class Tar00 {

	public static void main(String[] args) {

		// first dimension: 4
		// second dimension: 3, 5, 2, 4

		int[][] arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		arr[3] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// [i][j] is the current element
				arr[i][j] = (int) (Math.random() * 101);
			}
		}
	}

}
