package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String readName = scanner.nextLine();
        int readRounds = scanner.nextInt();
        System.out.println("Enter number of winning round to finish game: ");
        boolean end = false;

        while (!end) {
            Game game = new Game();

        }

    }
}
