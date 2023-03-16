package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor executor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        executor.executeExpression(10, 5, (a, b) -> a + b);
        executor.executeExpression(10, 5, (a, b) -> a - b);
        executor.executeExpression(10, 5, (a, b) -> a * b);
        executor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        executor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        executor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        executor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        executor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("First beautify text", text -> poemBeautifier.toString().toUpperCase());
        poemBeautifier.beautify("This is text to beautify", text -> poemBeautifier.toString().replace("t", "chedozyc"));
        poemBeautifier.beautify("this text is ugly", text -> poemBeautifier.toString().trim());
    }
}
