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
        for (var i = 0; i < MAXROUND; i++) {
            var numbers = RandomNumberUtils.generateNumbers();
            var num = numbers[i];
            var correctAnswer = (findNumberIsEven(Integer.parseInt(num))) ? "yes" : "no";
            questions[0][i] = numbers[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static boolean findNumberIsEven(int number) {
        return number % 2 == 0;
    }
}
