package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> number) {
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer even : number) {
            if (even % 2 == 0)
                evenNumber.add(even);
        }
        return evenNumber;
    }
}
