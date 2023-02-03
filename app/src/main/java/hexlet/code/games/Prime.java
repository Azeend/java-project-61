package hexlet.code.games;

import hexlet.code.util.RandomNumberUtils;

import static hexlet.code.Engine.startGame;
import static hexlet.code.util.RandomNumberUtils.MAXROUND;

public class Prime {
    static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var numbersArray = RandomNumberUtils.generateNumbers();
        for (var i = 0; i < MAXROUND; i++) {
            var correctAnswer = (isPrime(numbersArray[i])) ? "yes" : "no";
            questions[0][i] = Integer.toString(numbersArray[i]);
            questions[1][i] = correctAnswer;
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
