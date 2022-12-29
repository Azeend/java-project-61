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
        number = RandomUtils.nextInt(2, 100);
        number2 = RandomUtils.nextInt(2, 100);
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
        switch (choice) {
            case 1 -> greet();
            case 2 -> {
                greet();
                Even.even();
            }
            case 3 -> {
                greet();
                Calc.calculate();
            }
            case 4 -> {
                greet();
                GCD.gcd();
            }
            case 5 -> {
                greet();
                Progression.ariphmProgr();
            }
            case 6 -> {
                greet();
                Prime.isPrime();
            }
            default -> {
            }
        }
    }
}
