package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import org.apache.commons.lang3.RandomUtils;
public class Engine {
    public static final int MAXRANDOM = 100;
    public static final int WINCOUNT = 3;

    public static int randomNumber() {
        return RandomUtils.nextInt(2, MAXRANDOM);
    }

    public static int randomNumber2() {
        return RandomUtils.nextInt(2, MAXRANDOM);
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    public static String getNameFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void greeting2(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static String userAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static boolean condition(String correctAnswer, String name, String answer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
            System.out.printf("Let's try again, %s!\n", name);
            return true;
        }
        return false;
    }

    public static void enter() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            greet();
            var name = getNameFromUser();
            greeting2(name);
        } else if (choice != 0) {
            greet();
            var name = getNameFromUser();
            greeting2(name);
            game(choice, name);
        }
    }

    public static void game(int choice, String name) {
        final var even = 2;
        final var calc = 3;
        final var gcd = 4;
        final var progression = 5;
        final var prime = 6;

        switch (choice) {
            case even -> Even.even(name);
            case calc -> Calc.calculate(name);
            case gcd -> GCD.gcd(name);
            case progression -> Progression.ariphmProgr(name);
            case prime ->
                Prime.isPrime(name);
            default -> {
            }
        }
    }
}
