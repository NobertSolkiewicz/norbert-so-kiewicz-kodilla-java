package com.kodilla.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static final char PLAYER = 'X';
    private static final char AI = 'O';
    private static final char EMPTY = '-';
    private static final int WIN_LENGTH = 5;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose on what board do u want to play 3x3 (enter 3), or 10x10(enter 10)");
        int size = scanner.nextInt();
        char[][] board = new char[size][size];

        //inicjalizacjia planszy
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = EMPTY;
            }
        }

        //game 10x10
        if (size == 10) {
            while (true) {
                //ruch gracza
                System.out.println("Your turn (enter two numbers separate by space):");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                if (row < 0 || row >= board.length || col < 0 || col >= board.length || board[row][col] != EMPTY) {
                    System.out.println("Illegal move");
                    continue;
                }
                board[row][col] = PLAYER;
                printBoard(board);
                if (checkWin10x10(board, PLAYER)) {
                    System.out.println("Player " + PLAYER + " win!!");
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw!");
                    break;
                }

                // ruch AI
                System.out.println("Ruch AI:");
                int[] aiMove = getAIMove(board);
                board[aiMove[0]][aiMove[1]] = AI;
                printBoard(board);
                if (checkWin10x10(board, AI)) {
                    System.out.println("Player " + AI + " win!");
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw!");
                    break;
                }
            }
        }
        //game 3x3
        else if (size == 3) {
            while (true) {
                //ruch gracza
                System.out.println("Your turn (enter two numbers separate by space):");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                if (row < 0 || row >= board.length || col < 0 || col >= board.length || board[row][col] != EMPTY) {
                    System.out.println("Illegal move");
                    continue;
                }
                board[row][col] = PLAYER;
                printBoard(board);
                if (checkWin3x3(board, PLAYER)) {
                    System.out.println("Player " + PLAYER + " win!!");
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw!");
                    break;
                }

                // ruch AI
                System.out.println("Ruch AI:");
                int[] aiMove = getAIMove(board);
                board[aiMove[0]][aiMove[1]] = AI;
                printBoard(board);
                if (checkWin3x3(board, AI)) {
                    System.out.println("Player " + AI + " win!");
                    break;
                }

                if (isBoardFull(board)) {
                    System.out.println("Draw!");
                    break;
                }
            }
        }
        else System.out.println("You enter wrong number ERROR!");
    }

    //metoda zwracająca ruch AI
    private static int[] getAIMove(char[][] board) {
        //losowy ruchAI
        int row;
        int col;
        do {
            row = (int) (Math.random() * board.length);
            col = (int) (Math.random() * board.length);
        } while (board[row][col] != EMPTY);
        return new int[]{row, col};
    }

    //metoda sprawdzająca, czy plansza jest pełna
    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //metoda wyświetlająca planszę
    private static void printBoard(char[][] board) {
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

    private static boolean checkWin3x3(char[][] board, char player) {
        //check rows
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == player) {
                    count++;
                }
            }
            if (count == board.length) {
                return true;
            }
        }

        // sprawdzenie pionowych linii
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == player) {
                    count++;
                }
            }
            if (count == board.length) {
                return true;
            }
        }

        // sprawdzenie przekątnych linii
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == player) {
                count1++;
            }
            if (board[i][board.length - 1 - i] == player) {
                count2++;
            }
        }
        if (count1 == board.length || count2 == board.length) {
            return true;
        }

        return false;
    }

    //metoda sprawdzajączy, czy dany gracz wygrał 10x10
    private static boolean checkWin10x10(char[][] board, char player) {
        // sprawdzanie poziomo
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == player) {
                    count++;
                    if (count == WIN_LENGTH) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // sprawdzanie pionowo
        for (int j = 0; j < board.length; j++) {
            int count = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == player) {
                    count++;
                    if (count == WIN_LENGTH) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // sprawdzanie po przekątnej "\"
        for (int i = 0; i < board.length - WIN_LENGTH + 1; i++) {
            for (int j = 0; j < board.length - WIN_LENGTH + 1; j++) {
                int count = 0;
                for (int k = 0; k < WIN_LENGTH; k++) {
                    if (board[i+k][j+k] == player) {
                        count++;
                        if (count == WIN_LENGTH) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        // sprawdzanie po przekątnej "/"
        for (int i = 0; i < board.length - WIN_LENGTH + 1; i++) {
            for (int j = WIN_LENGTH - 1; j < board.length; j++) {
                int count = 0;
                for (int k = 0; k < WIN_LENGTH; k++) {
                    if (board[i+k][j-k] == player) {
                        count++;
                        if (count == WIN_LENGTH) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        return false;
    }

}
