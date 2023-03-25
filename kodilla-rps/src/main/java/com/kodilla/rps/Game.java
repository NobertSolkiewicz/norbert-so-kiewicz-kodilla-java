package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    //całę odczytywanie z klawiatury zrobić scannerem i
    // wszyzstko jedynm ciurkiem a potem to wszystko rozbijać
    private final Rock rock = new Rock(1, "Rock");
    private final Paper paper = new Paper(2, "Paper");
    private final Scissors scissors = new Scissors(3, "Scissors");

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            String readName = scanner.nextLine();

            Game game = new Game();
            if (readName.equals("Rock")) {

            }
        }
    }

    public Rock getRock() {
        return rock;
    }

    public Paper getPaper() {
        return paper;
    }

    public Scissors getScissors() {
        return scissors;
    }
}
