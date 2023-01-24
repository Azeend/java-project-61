package hexlet.code.games;

import hexlet.code.Util.RandomNumberUtils;

import static hexlet.code.Engine.engine;
import static hexlet.code.Util.RandomNumberUtils.MAXROUND;

public class Even  {
    static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void playGame() {
        engine(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var randomNumbers = RandomNumberUtils.generateNumbers();
        for (var i = 0; i < MAXROUND; i++) {
            var number = randomNumbers[i];
            var correctAnswer = (findNumberIsEven(Integer.parseInt(number))) ? "yes" : "no";
            questions[0][i] = randomNumbers[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static boolean findNumberIsEven(int number) {
        return number % 2 == 0;
    }
}
