package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static String board[];
	static String chance;

	// Implimentation Of Board
	static void printBoard() {
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

	public static void main(String[] args) {
		System.out.println("Well come In TicTacToe Game... ");
		// Create board with size [10]
		board = new String[9];
	}
}
