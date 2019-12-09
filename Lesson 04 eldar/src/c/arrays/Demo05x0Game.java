package c.arrays;

public class Demo05x0Game {

	public static void main(String[] args) {

		char[][] board = new char[3][3];

		// put - in entire board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '-';
			}
		}

		printBoard(board);
		System.out.println("==================");

		board[1][1] = 'x';
		printBoard(board);
		System.out.println("==================");

		board[2][0] = 'O';
		printBoard(board);
		System.out.println("==================");

	}

	// this method is used for us to print the board (matrix)
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
