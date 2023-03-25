package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    SecondChallenge secondChallenge = new SecondChallenge();

    public void handleException() {
        double x = 2;
        double y = 1.5;
        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
