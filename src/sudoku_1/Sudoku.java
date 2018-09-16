package sudoku_1;

public class Sudoku {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 1, 0, 0, 5, 0, 0, 8 }, { 9, 0, 0, 0, 6, 0, 0, 3, 0 }, { 0, 2, 0, 0, 0, 0, 7, 0, 0 },
				{ 0, 3, 0, 0, 0, 8, 0, 1, 0 }, { 0, 0, 5, 7, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 9, 0, 6, 0, 0 },
				{ 0, 0, 8, 0, 0, 3, 0, 0, 4 }, { 7, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 6, 0, 2, 0, 0, 0, 9, 0 } };

		solveSuduko(board);

	}

	///////////////////////// Method implementing BackTracking /////////////////////////
	
	public static boolean solveSuduko(int[][] board) {

		// base case
		// If none of the cell is element is zero;
		if (isAnyElementZero(board)) {

			// print the solved array(Suduko solution)

			System.out.println("The solution of the Sudoku:");
			System.out.println();
			for (int row = 0; row < 9; row++) {
				for (int col = 0; col < 9; col++) {
					System.out.print(board[row][col] + " ");
					if (col == 2 || col == 5)
						System.out.print(" | ");
				}
				System.out.println();
				if (row == 2 || row == 5)
					System.out.println("-----------------------");
			}

			return true;
		}
		// Recursive case

		int row = row_num(board);			// getting the row and column number of a unassigned cell
		int col = col_num(board);

		for (int num = 1; num <= 9; num++) {		// for inserting possible values i.e from 1-9

			if (isSafe(board, row, col, num)) {		// checking if a num is allowed at this position or not
				board[row][col] = num;				// inserts if the present situation of the board permits

				boolean thikTha = solveSuduko(board);		// recurse to find the next unassigned cell
				if (thikTha) {
					return true;
				}

				board[row][col] = 0;	// backtrack if the previous call returns a false
			}
		}

		return false;		// returns if none of the number can be placed at that particular cell

	}
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////// Method to find the row number of the unassigned cell /////////////////////////////

	public static int row_num(int[][] board) {

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (board[row][col] == 0)
					return row;
			}
		}
		return 0;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	/////////////// Method to find the column number of the unassigned cell /////////////////

	public static int col_num(int[][] board) {

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (board[row][col] == 0)
					return col;
			}
		}
		return 0;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/////////////// Method to find if a unassigned cell is remaining in the board or not /////////////////

	public static boolean isAnyElementZero(int[][] board) { // base case helper function

		for (int row = 0; row < 9; row++) {

			for (int col = 0; col < 9; col++) {

				if (board[row][col] == 0)
					return false;
			}
		}
		return true;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////// This method find if a allowed number is safe to be placed or not ///////////////////////////
	
	public static boolean isSafe(int[][] board, int i, int j, int val) { // Implements the bounding functions

		// Checking for the row elements
		for (int col = 0; col < 9; col++) {
			if (board[i][col] == val)
				return false;

		}

		// Checking for the column elements
		for (int row = 0; row < 9; row++) {
			if (board[row][j] == val)
				return false;
		}

		// Checking the small boxes elements
		if (j >= 0 && j < 3) { // For first vertical column block

			if (i >= 0 && i < 3) { // Checking first block

				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 3; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 3 && i < 6) { // Checking the second block

				for (int row = 3; row < 6; row++) {
					for (int col = 0; col < 3; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 6 && i < 9) { // Checking the Third block

				for (int row = 6; row < 9; row++) {
					for (int col = 0; col < 3; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}
		}

		if (j >= 3 && j < 6) { // For second vertical column block

			if (i >= 0 && i < 3) { // Checking first block

				for (int row = 0; row < 3; row++) {
					for (int col = 3; col < 6; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 3 && i < 6) { // Checking the second block

				for (int row = 3; row < 6; row++) {
					for (int col = 3; col < 6; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 6 && i < 9) { // Checking the Third block

				for (int row = 6; row < 9; row++) {
					for (int col = 3; col < 6; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}
		}

		if (j >= 6 && j < 9) { // For Third vertical column block

			if (i >= 0 && i < 3) { // Checking first block

				for (int row = 0; row < 3; row++) {
					for (int col = 6; col < 9; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 3 && i < 6) { // Checking the second block

				for (int row = 3; row < 6; row++) {
					for (int col = 6; col < 9; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}

			if (i >= 6 && i < 9) { // Checking the Third block

				for (int row = 6; row < 9; row++) {
					for (int col = 6; col < 9; col++) {
						if (board[row][col] == val)
							return false;
					}
				}
			}
		}

		return true;
	}

}
