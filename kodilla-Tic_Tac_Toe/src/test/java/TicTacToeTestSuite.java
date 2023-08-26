
import com.kodilla.ticTacToe.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTestSuite {

    @Test
    void TestCheckRowsOWin() {
        //Given
        char[][] game =new char [3][3];
        game[0][0] = 'O';
        game[0][1] = 'O';
        game[0][2] = 'O';
        game[1][0] = 'X';
        game[1][1] = 'X';
        game[1][2] = ' ';
        game[2][0] = ' ';
        game[2][1] = ' ';
        game[2][2] = ' ';
        char symbol = 'O';

        //When
        Board.printBoard(game);
        Board.checkRows(game, symbol);

        //Then
        assertTrue(Board.checkRows(game, symbol));
    }

    @Test
    void TestCheckColumnsOWin() {
        //Given
        char[][] game =new char [3][3];
        game[0][0] = 'O';
        game[0][1] = 'X';
        game[0][2] = 'X';
        game[1][0] = 'O';
        game[1][1] = 'X';
        game[1][2] = ' ';
        game[2][0] = 'O';
        game[2][1] = ' ';
        game[2][2] = ' ';
        char symbol = 'O';

        //When
        Board.printBoard(game);
        Board.checkColmuns(game, symbol);

        //Then
        assertTrue(Board.checkColmuns(game, symbol));
    }

    @Test
    void TestCheckDiagonal1OWin() {
        //Given
        char[][] game =new char [3][3];
        game[0][0] = 'O';
        game[0][1] = 'X';
        game[0][2] = 'X';
        game[1][0] = ' ';
        game[1][1] = 'O';
        game[1][2] = ' ';
        game[2][0] = 'X';
        game[2][1] = ' ';
        game[2][2] = 'O';
        char symbol = 'O';

        //When
        Board.printBoard(game);
        Board.checkDiagonal1(game, symbol);

        //Then
        assertTrue(Board.checkDiagonal1(game, symbol));
    }

    @Test
    void TestCheckRowsXWin() {
        //Given
        char[][] game =new char [3][3];
        game[0][0] = 'X';
        game[0][1] = 'X';
        game[0][2] = 'X';
        game[1][0] = 'O';
        game[1][1] = 'O';
        game[1][2] = ' ';
        game[2][0] = ' ';
        game[2][1] = ' ';
        game[2][2] = ' ';
        char symbol = 'X';

        //When
        Board.printBoard(game);
        Board.checkRows(game, symbol);

        //Then
        assertTrue(Board.checkRows(game, symbol));
    }

    @Test
    void TestCheckColumnsXWin() {
        //Given
        char[][] game =new char [3][3];
        game[0][0] = 'X';
        game[0][1] = 'O';
        game[0][2] = 'O';
        game[1][0] = 'X';
        game[1][1] = 'O';
        game[1][2] = ' ';
        game[2][0] = 'X';
        game[2][1] = ' ';
        game[2][2] = ' ';
        char symbol = 'X';

        //When
        Board.printBoard(game);
        Board.checkColmuns(game, symbol);

        //Then
        assertTrue(Board.checkColmuns(game, symbol));
    }

    @Test
    void TestCheckDiagonal1XWin() {
        //Given
        char[][] game = new char [3][3];
        game[0][0] = 'X';
        game[0][1] = 'O';
        game[0][2] = 'O';
        game[1][0] = ' ';
        game[1][1] = 'X';
        game[1][2] = ' ';
        game[2][0] = 'O';
        game[2][1] = ' ';
        game[2][2] = 'X';
        char symbol = 'X';

        //When
        Board.printBoard(game);
        Board.checkDiagonal1(game, symbol);

        //Then
        assertTrue(Board.checkDiagonal1(game, symbol));
    }

    @Test
    void TestCheckDraw() {
        //Given
        char[][] game = new char [3][3];
        game[0][0] = 'O';
        game[0][1] = 'O';
        game[0][2] = 'X';
        game[1][0] = 'X';
        game[1][1] = 'X';
        game[1][2] = 'O';
        game[2][0] = 'O';
        game[2][1] = 'X';
        game[2][2] = 'X';
        char symbol = 'X';

        //When
        Board.printBoard(game);
        Board.checkRows(game, symbol);
        Board.checkColmuns(game, symbol);
        Board.checkDiagonal1(game, symbol);

        //Then
        assertFalse(Board.checkRows(game, symbol));
        assertFalse(Board.checkColmuns(game, symbol));
        assertFalse(Board.checkDiagonal1(game, symbol));
    }

    @Test
    void TestCheckCorrecltyMove() {
        //Given
//        char[][] board = new char [3][3];
//        char symbol = 'X';
//        board[0][0] = 'X';
//        board[0][1] = ' ';
//        board[0][2] = ' ';
//        board[1][0] = 'X';
//        board[1][1] = 'O';
//        board[1][2] = ' ';
//        board[2][0] = 'O';
//        board[2][1] = 'X';
//        board[2][2] = ' ';
//
//
//        //When
//        Board.printBoard(board);
//
//        //Then
//
//        assertFalse(Board.isCorrectMove(board, symbol));
    }

}
