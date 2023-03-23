package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Dont divide by 0!");
        }
        return a/b;
    }

    /**
     * This main can throw new ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(10, 0);

        System.out.println(result);
    }
}
