package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;
import org.apache.commons.lang3.RandomUtils;
public class Engine {
    public static String userName;
    public static String answer;
    public static int number;
    public static int number2;
    public static final int WINCOUNT = 3;
    public static void randomNumber() {
        int maxRandom = 100;
        number = RandomUtils.nextInt(2, maxRandom);
        number2 = RandomUtils.nextInt(2, maxRandom);
    }
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        userName = scan.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void answer() {
        Scanner scan = new Scanner(System.in);
        answer = scan.next();
        System.out.println("Your answer: " + answer);
    }
    public static void wrongAnswer(String correctAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static boolean condition(String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            wrongAnswer(correctAnswer);
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
        final var greeting = 1;
        final var even = 2;
        final var calc = 3;
        final var gcd = 4;
        final var progression = 5;
        final var prime = 6;
        switch (choice) {
            case greeting -> greet();
            case even -> {
                greet();
                Even.even();
            }
            case calc -> {
                greet();
                Calc.calculate();
            }
            case gcd -> {
                greet();
                GCD.gcd();
            }
            case progression -> {
                greet();
                Progression.ariphmProgr();
            }
            case prime -> {
                greet();
                Prime.isPrime();
            }
            default -> {
            }
        }
    }
}
