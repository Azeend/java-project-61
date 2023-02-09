package hexlet.code.games;

import hexlet.code.util.RandomNumbersUtils;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Engine.MAXROUND;

public class Even  {
    static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[MAXROUND][2];
        for (var i = 0; i < MAXROUND; i++) {
            var number = RandomNumbersUtils.generateNumber();
            var correctAnswer = isEven(number) ? "yes" : "no";
            questions[i][0] = Integer.toString(number);
            questions[i][1] = correctAnswer;
        }
        return questions;
    }
    private static boolean isEven(int number) {
        return  number % 2 == 0;
    }
}
