package hexlet.code;

import java.util.Scanner;
import static hexlet.code.util.RandomNumberUtils.MAXROUND;

public class Engine {
    public static void startGame(String[][] questionAndAnswers, String task) {
        greetForGames();
        Scanner scanName = new Scanner(System.in);
        var name = scanName.next();
        greetWithName(name);
        System.out.println(task);
        for (var i = 0; i < MAXROUND; i++) {
            System.out.println("Question: " + questionAndAnswers[0][i]);
            var answer = getUserAnswer();
            var correctAnswer = questionAndAnswers[1][i];
            System.out.println("Your answer: " + answer);
            if (checkAnswer(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    private static void greetForGames() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }
    private static boolean checkAnswer(String correctAnswer, String name, String answer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
            System.out.printf("Let's try again, %s!\n", name);
            return true;
        }
        return false;
    }
    private static String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
    private static void greetWithName(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println();
    }
}
