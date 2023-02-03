package hexlet.code.games;

import hexlet.code.util.RandomNumberUtils;

import static hexlet.code.Engine.startGame;
import static hexlet.code.util.RandomNumberUtils.MAXROUND;

public class Gcd {
    static final String TASK = "Find the greatest common divisor of given numbers.";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var numbersArrayFirst = RandomNumberUtils.generateNumbers();
        var numbersArraySecond = RandomNumberUtils.generateNumbers();
        for (var i = 0; i < MAXROUND; i++) {
            var correctAnswer = Integer.toString(findGCD(numbersArrayFirst[i], numbersArraySecond[i]));
            questions[0][i] = numbersArrayFirst[i] + " " + numbersArraySecond[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static int findGCD(int leftNumber, int rightNumber) {
        int gcd = 1;
        for (int j = 1; j <= leftNumber && j <= rightNumber; j++) {
            if (leftNumber % j == 0 && rightNumber % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
