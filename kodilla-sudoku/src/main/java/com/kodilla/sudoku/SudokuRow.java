package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> elements;

    public SudokuRow() {
        elements = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            elements.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getElements() {
        return elements;
    }

    public void addElement(SudokuElement element) {
        elements.add(element);
    }
}
