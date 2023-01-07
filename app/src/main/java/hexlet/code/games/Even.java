package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Even  {
    public static void playGame() {
        var numbers = RandomUtilsNumber.getNumbers();
        engine(getQuestions(numbers), getTask(), getAnswers(numbers));
    }
    private static String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    private static String[] getQuestions(String[] numbers) {
        String[] questions = new String[MAXROUND];
        System.arraycopy(numbers, 0, questions, 0, MAXROUND);
        return questions;
    }
    private static String[] getAnswers(String[] numbers) {
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
