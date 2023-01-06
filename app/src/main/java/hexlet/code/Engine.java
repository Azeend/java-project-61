package hexlet.code;

import java.util.Scanner;


public class Engine {
    static final int wincount = 3;
    public static void engine(String[] questionAndAnswer) {
        greetingForGames();
        Scanner scanName = new Scanner(System.in);
        var name = scanName.next();
        greetingWithName(name);
        System.out.println(questionAndAnswer[2]);
        for (var i = 0; i < wincount; i++) {
            var question = questionAndAnswer[0];
            var correctAnswer = questionAndAnswer[1];
            System.out.println(question);
            var answer = getUserAnswer();
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
