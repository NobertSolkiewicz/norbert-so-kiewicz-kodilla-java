package com.kodilla.ticTacToe;

import java.util.Random;
import java.util.Scanner;

public class Board {
    public static void printBoard(char[][] board) {
        int dimension = board.length;
        System.out.print("\t");
        for (int k = 0; k < dimension; k++) {
            System.out.print(k + "\t");
        }
        System.out.println();

        for (int i = 0; i < dimension; i++) {
            System.out.print(i + ":\t");
            for (int j = 0; j < dimension; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean move(char[][] board, char symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(symbol + " your move");
        System.out.println("Enter row index");
        int row = scanner.nextInt();
        System.out.println("Enter column index");
        int colmun = scanner.nextInt();
        boolean correctMove = board[row][colmun] == 0;
        if (!correctMove) {
            System.out.println("Illegal move");
            return false;
        }
        board[row][colmun] = symbol;
        return true;
    }

    public static boolean checkRows(char[][] board, char symbol) {
        for (int row = 0; row < board.length; row++) {
            boolean win = true;
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)  {
                printBoard(board);
                return true;
            }
        }
        return false;
    }

    public static boolean checkColmuns(char[][] board, char symbol) {
        int dimension = board.length;

        for (int column = 0; column < dimension; column++) {
            boolean win = true;
            for (int row = 0; row < dimension; row++) {
                if (board[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win)  {
                printBoard(board);
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal1(char[][] board, char symbol) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != symbol) {
                return false;
            }
        }
        printBoard(board);
        return true;
    }

    public static boolean checkDiagonal2(char[][] board, char symbol) {
        int dimension = board.length;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <dimension; j++) {
                if (i + j == dimension - 1) {
                    for (int k = 0; k < dimension; k++) {
                        if (board[k][(dimension - 1) - k] != symbol)
                            break;
                        if (k == dimension - 1) {
                            printBoard(board);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean computerMove(char[][] board, char symbol) {
        Random random = new Random();
        int row = random.nextInt(0, 2);
        int colmun = random.nextInt(0, 2);
        boolean correctMove = board[row][colmun] == 0;
        if (!correctMove) {
            System.out.println("Illegal move");
            return false;
        }
        board[row][colmun] = symbol;
        return true;
    }

    public static boolean isCorrectComputerMove(char [][] board, char symbol) {
        return computerMove(board, symbol);
    }

    public static boolean isCorrectMove(char[][] board, char currentSymbol) {
        return move(board, currentSymbol);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Tic Tac Toe");
        System.out.println("Do You want to play 3x3 (press 3) or do You prefer to play 10x10 (press 10)");
        int dimension = scanner.nextInt();
        char[][] board = new char[dimension][dimension];
        char currentSymbol = 'X';

        boolean wheatherContinue = true;
        int countMoves = 0;
        while (wheatherContinue && countMoves < dimension * dimension) {
            countMoves++;
            printBoard(board);

            boolean correctMove = isCorrectMove(board, currentSymbol);
            currentSymbol = currentSymbol == 'X' ? 'O' : 'X';
            boolean correctComputerMove = isCorrectComputerMove(board, currentSymbol);
            if (correctMove || correctComputerMove) {
                boolean winRows = checkRows(board, currentSymbol);
                boolean winColumns = checkColmuns(board, currentSymbol);
                boolean windiagonal1 = checkDiagonal1(board, currentSymbol);
                boolean windiagonal2 = checkDiagonal2(board, currentSymbol);

                if (winRows || winColumns || windiagonal1 || windiagonal2) {
                    System.out.println("Congratulation " + currentSymbol);
                    wheatherContinue = false;
                }
            }
            currentSymbol = currentSymbol == 'X' ? 'O' : 'X';

            if (correctMove || correctComputerMove) {
                boolean winRows = checkRows(board, currentSymbol);
                boolean winColumns = checkColmuns(board, currentSymbol);
                boolean windiagonal1 = checkDiagonal1(board, currentSymbol);
                boolean windiagonal2 = checkDiagonal2(board, currentSymbol);

                if (winRows || winColumns || windiagonal1 || windiagonal2) {
                    System.out.println("Congratulation " + currentSymbol);
                    wheatherContinue = false;
                }
            }
        }
    }
}