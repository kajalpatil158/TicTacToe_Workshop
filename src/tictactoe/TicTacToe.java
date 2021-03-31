package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static String board[];
	static String chance;

	// Implimentation Of Board
	static void showBoard() {
		System.out.println("" + board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("----" + "----" + "--" + "");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("----" + "----" + "--" + "");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
	}

	// ChosePlayer For Play
	public String choosePlayer() {
		int random = (int) (Math.floor(Math.random() * 10) % 2);
		switch (random) {
		case 0:
			System.out.println("its palyer turn");
			chance = "X";
			break;
		case 1:
			System.out.println("it's Computer turn");
			chance = "O";
			break;
		}
		return chance;
	}
	String showBoard() {

		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("xxx")) {
				return "x";
			} else if (line.equals("ooo")) {
				return "o";
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Well come In TicTacToe Game... ");
		// Create board with size [10]
		board = new String[9];
	}
}
