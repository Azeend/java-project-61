package hexlet.code.games;

import hexlet.code.util.RandomNumbersUtils;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Engine.MAXROUND;

public class Prime {
    static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[MAXROUND][2];
        for (var i = 0; i < MAXROUND; i++) {
            var number = RandomNumbersUtils.generateNumber();
            var correctAnswer = (isPrime(number)) ? "yes" : "no";
            questions[i][0] = Integer.toString(number);
            questions[i][1] = correctAnswer;
        }
        return questions;
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
