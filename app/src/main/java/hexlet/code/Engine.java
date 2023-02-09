package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAXROUND = 3;
    public static void startGame(String[][] questionAndAnswers, String task) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanName = new Scanner(System.in);
        var name = scanName.next();
        System.out.println("Hello, " + name + "!");
        System.out.println();
        System.out.println(task);
        for (var i = 0; i < MAXROUND; i++) {
            System.out.println("Question: " + questionAndAnswers[i][0]);
            Scanner scan = new Scanner(System.in);
            var answer = scan.next();
            var correctAnswer = questionAndAnswers[i][1];
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                break;
            }
        }
    }
}
