package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Menu {
    public static void gameSelect() {
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

    public static void gameChoice() {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        System.out.println();
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        switch (choice) {
            case greet -> Cli.greeting();
            case even -> engine(Even.getGameDataEven());
            case calc -> engine(Calc.getGameDataCalc());
            case gcd -> engine(GCD.getGameDataGCD());
            case progression -> engine(Progression.getGameDataProgression());
            case prime -> engine(Prime.getGameDataPrime());
            default -> {
            }
        }
    }
}
