package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String[] questions, String task, String[] correctAnswers) {
        greetingForGames();
        Scanner scanName = new Scanner(System.in);
        var name = scanName.next();
        greetingWithName(name);
        System.out.println(task);
        final int maxRounds = 3;
        for (var i = 0; i < maxRounds; i++) {
            System.out.println("Question: " + questions[i]);
            var answer = getUserAnswer();
            var correctAnswer = correctAnswers[i];
            System.out.println("Your answer: " + answer);
            if (checkAnswer(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    private static void greetingForGames() {
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
    private static void greetingWithName(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println();
    }
}
