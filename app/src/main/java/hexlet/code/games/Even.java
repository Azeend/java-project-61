package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Even  {
    public static void playGame() {
        var numbers = RandomUtilsNumber.generateNumbers();
        var questions = generateQuestionsArray(numbers);
        var answers = generateAnswersArray(numbers);
        String[][] questionAndAnswers = {questions, answers};
        engine(questionAndAnswers, TASK);
    }
    static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[] generateQuestionsArray(String[] numbers) {
        String[] questions = new String[MAXROUND];
        System.arraycopy(numbers, 0, questions, 0, MAXROUND);
        return questions;
    }
    private static String[] generateAnswersArray(String[] numbers) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            var num = numbers[i];
            var correctAnswer = (isEven(Integer.parseInt(num))) ? "yes" : "no";
            correctAnswers[i] = correctAnswer;
        }
        return correctAnswers;
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
