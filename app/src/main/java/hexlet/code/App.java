package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALCULATOR = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    public static void main(String[] args) {
        gameSelect();
        gameChoice();
    }
    private static void gameSelect() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
    }
    private static void gameChoice() {
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.next());
        System.out.println("Your choice: " + choice);
        System.out.println();
        switch (choice) {
            case GREET -> Cli.greeting();
            case EVEN -> Even.playGame();
            case CALCULATOR -> Calculator.playGame();
            case GCD -> Gcd.playGame();
            case PROGRESSION -> Progression.playGame();
            case PRIME -> Prime.playGame();
            default -> throw new NoSuchElementException("Wrong choice");
        }
    }
}
