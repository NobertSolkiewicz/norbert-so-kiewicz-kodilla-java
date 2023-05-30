package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuBoard {
    private List<SudokuRow> rows;

    public SudokuBoard() {
        rows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new SudokuRow());
        }
    }

    public void initialize() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            SudokuRow row = rows.get(i);
            System.out.println("Eneter values for row " + (i + 1) + "(separated by spaces -1 for empty): ");;
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            for (int j = 0; j < 9; j++) {
                int value = Integer.parseInt(values[j]);
                row.addElement(new SudokuElement(value));
            }
        }
    }
    public boolean resolveSudoku() {
        return backtrackSolve(0, 0);
    }

    private boolean backtrackSolve(int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
            if (row == 9) {
                return true;
            }
        }

        if (getCell(row, col).getValue() != SudokuElement.EMPTY) {
            return backtrackSolve(row, col + 1);
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidMove(row, col, num)) {
                getCell(row, col).setValue(num);
                if (backtrackSolve(row, col + 1)) {
                    return true;
                }
                getCell(row, col).setValue(SudokuElement.EMPTY);
            }
        }

        return false;
    }

    private boolean isValidMove(int row, int col, int num) {
        return !usedInRow(row, num) &&
                !usedInColumn(col, num) &&
                !usedInSection(row - row % 3, col - col % 3, num);
    }

    private boolean usedInRow(int row, int num) {
        SudokuRow sudokuRow = rows.get(row);
        for (SudokuElement element : sudokuRow.getElements()) {
            if (element.getValue() == num) {
                return true;
            }
        }
        return false;
    }

    private boolean usedInColumn(int col, int num) {
        for (SudokuRow row : rows) {
            SudokuElement element = row.getElements().get(col);
            if (element.getValue() == num) {
                return true;
            }
        }
        return false;
    }

    private boolean usedInSection(int startRow, int startCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                SudokuElement element = getCell(startRow + row, startCol + col);
                if (element.getValue() == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private SudokuElement getCell(int row, int col) {
        return rows.get(row).getElements().get(col);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                sb.append("---------------------\n");
            }

            SudokuRow row = rows.get(i);
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    sb.append("| ");
                }

                SudokuElement element = row.getElements().get(j);
                int value = element.getValue();
                if (value == SudokuElement.EMPTY) {
                    sb.append("  ");
                } else {
                    sb.append(value).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
