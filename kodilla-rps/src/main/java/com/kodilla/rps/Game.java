package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        int roundscount = 0;
        int yourScore = 0;
        int computerScore = 0;
        boolean end = false;
        System.out.println("Please enter Your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number of rounds: ");
        int roundsNumbers = scanner.nextInt();
        System.out.println("Infomation about game: ");
        System.out.println("1 - rock");
        System.out.println("2 - paper");
        System.out.println("3 - scissors");
        System.out.println("x - end of the game");
        System.out.println("n - restart the game");
        while (!end) {
            roundscount++;
            String move = scanner.nextLine();
            Random random = new Random();
            int computerMove = random.nextInt(1, 3);
            System.out.println("Please choose your move");
            if (move.equals("1") && computerMove == 1) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("1") && computerMove == 2) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                computerScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("1") && computerMove == 3) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                yourScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("2") && computerMove == 1) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                yourScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("2") && computerMove == 2) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("2") && computerMove == 3) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                computerScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("3") && computerMove == 1) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                computerScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("3") && computerMove == 2) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                yourScore++;
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("3")&& computerMove == 3) {
                System.out.println(name + "'s move is: " + move + " Computer move is: " + computerMove);
                System.out.println("Result is: "+ yourScore + ":" + computerScore + ", the number of rounds is: " + roundscount);
            } else if (move.equals("x")) {
                end = true;
            } else if (move.equals("n")) {
                Game game = new Game();
                game.run();
            }

            if (yourScore >= roundsNumbers || computerScore >= roundsNumbers) {
                end = true;
            }
        }
        if (yourScore > computerScore) {
            System.out.println("The winner is: " + name);
        } else
            System.out.println("The winner is: Computer");
    }
}
