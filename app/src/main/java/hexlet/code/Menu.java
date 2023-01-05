package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import java.util.Scanner;
import static hexlet.code.Engine.greetingForGames;
import static hexlet.code.Engine.greetingWithName;

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
            case even -> {
                greetingForGames();
                Scanner scanName = new Scanner(System.in);
                var name = scanName.next();
                greetingWithName(name);
                var evenTask = new Even();
                var task = evenTask.getTask();
                var questionAndAnswer = new Even();
                Engine.engine(task, name, questionAndAnswer);
            }
            case calc -> {
                greetingForGames();
                Scanner scanName = new Scanner(System.in);
                var name = scanName.next();
                greetingWithName(name);
                var evenTask = new Calc();
                var task = evenTask.getTask();
                var questionAndAnswer = new Calc();
                Engine.engine(task, name, questionAndAnswer);
            }
            case gcd -> {
                greetingForGames();
                Scanner scanName = new Scanner(System.in);
                var name = scanName.next();
                greetingWithName(name);
                var evenTask = new GCD();
                var task = evenTask.getTask();
                var questionAndAnswer = new GCD();
                Engine.engine(task, name, questionAndAnswer);
            }
            case progression -> {
                greetingForGames();
                Scanner scanName = new Scanner(System.in);
                var name = scanName.next();
                greetingWithName(name);
                var evenTask = new Progression();
                var task = evenTask.getTask();
                var questionAndAnswer = new Progression();
                Engine.engine(task, name, questionAndAnswer);
            }
            case prime -> {
                greetingForGames();
                Scanner scanName = new Scanner(System.in);
                var name = scanName.next();
                greetingWithName(name);
                var evenTask = new Prime();
                var task = evenTask.getTask();
                var questionAndAnswer = new Prime();
                Engine.engine(task, name, questionAndAnswer);
            }
            default -> {
            }
        }
    }
}
