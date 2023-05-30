package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] args) {
        boolean gameFinished = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameFinished) {
            SudokuBoard board = new SudokuBoard();
            board.initialize();

            System.out.println("Sudoku Game");
            System.out.println(board);

            boolean sudokuSolved = board.resolveSudoku();

            if (sudokuSolved) {
                System.out.println("Sudoku solved:");
                System.out.println(board);
            } else {
                System.out.println("Invalid Sudoku! Unable to solve.");
            }

            System.out.println("Do you wanna play again? (Y/N): ");
            String playAgain = scanner.nextLine().trim().toUpperCase();
            gameFinished = !playAgain.equals("Y");
        }
    }
}
