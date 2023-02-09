package hexlet.code.games;

import hexlet.code.util.RandomNumbersUtils;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Engine.MAXROUND;

public class Gcd {
    static final String TASK = "Find the greatest common divisor of given numbers.";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[MAXROUND][2];
        for (var i = 0; i < MAXROUND; i++) {
            var leftNumbers = RandomNumbersUtils.generateNumber();
            var rightNumbers = RandomNumbersUtils.generateNumber();
            var correctAnswer = Integer.toString(findGCD(leftNumbers, rightNumbers));
            questions[i][0] = leftNumbers + " " + rightNumbers;
            questions[i][1] = correctAnswer;
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
