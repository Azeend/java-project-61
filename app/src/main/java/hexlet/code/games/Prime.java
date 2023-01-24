package hexlet.code.games;

import hexlet.code.Util.RandomNumberUtils;

import static hexlet.code.Engine.engine;
import static hexlet.code.Util.RandomNumberUtils.MAXROUND;

public class Prime {
    static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void playGame() {
        engine(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var numbers = RandomNumberUtils.generateNumbers();
        for (var i = 0; i < MAXROUND; i++) {
            var correctAnswer = (findNumberIsPrime(Integer.parseInt(numbers[i]))) ? "yes" : "no";
            questions[0][i] = numbers[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static boolean findNumberIsPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
