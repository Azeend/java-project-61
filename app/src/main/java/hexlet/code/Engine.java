package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Engine {
    static final int MAXRANDOM = 100;

    public static int randomNumber() {
        return RandomUtils.nextInt(2, MAXRANDOM);
    }
    public static void greetingForGames() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }
    public static boolean checkAnswer(String correctAnswer, String name, String answer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
            System.out.printf("Let's try again, %s!\n", name);
            return true;
        }
        return false;
    }
    public static String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
    public static void greetingWithName(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println();
    }
    public static void engine(String task, String name, Game questionAndAnswer) {
        System.out.println(task);
        int wincount = 3;
        for (var i = 0; i < wincount; i++) {
            var gameData = questionAndAnswer.getGameData();
            var question = gameData[0];
            var correctAnswer = gameData[1];
            System.out.println(question);
            var answer = getUserAnswer();
            System.out.println("Your answer: " + answer);
            if (checkAnswer(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
