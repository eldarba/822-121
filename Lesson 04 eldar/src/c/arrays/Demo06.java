package c.arrays;

public class Demo06 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3, 3, 3 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}

		char[][] board1 = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
		printBoard(board1);

		char[][] board2 = { { '-', '-', '-' }, { '-', 'X', '-' }, { '-', '-', '-' } };
		printBoard(board2);

		char[][] board3 = { { '-', '-', '-' }, { '-', 'X', '-' }, { 'O', '-', '-' } };
		printBoard(board3);

	}

	// this method is used for us to print the board (matrix)
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=========================");
	}

}
