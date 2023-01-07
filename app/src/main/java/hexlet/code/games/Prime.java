package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Prime {
    public static void playGame() {
        var numbers = RandomUtilsNumber.getNumbers();
        engine(getQuestions(numbers), getTask(), getAnswers(numbers));
    }
    private static String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    private static String[] getAnswers(String[] numbers) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            var correctAnswer = (numberIsPrime(Integer.parseInt(numbers[i]))) ? "yes" : "no";
            correctAnswers[i] = correctAnswer;
        }
        return correctAnswers;
    }
    private static String[] getQuestions(String[] numbers) {
        String[] questions = new String[MAXROUND];
        System.arraycopy(numbers, 0, questions, 0, MAXROUND);
        return questions;
    }

    private static boolean numberIsPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
