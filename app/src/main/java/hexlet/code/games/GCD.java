package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class GCD {
    public static void playGame() {
        var numbers = RandomUtilsNumber.generateNumbers();
        var numbers2 = RandomUtilsNumber.generateNumbers();
        var questions = generateQuestionsArray(numbers, numbers2);
        var answers = generateAnswersArray(numbers, numbers2);
        String[][] questionAndAnswers = {questions, answers};
        engine(questionAndAnswers, TASK);
    }

    static final String TASK = "Find the greatest common divisor of given numbers.";

    private static String[] generateQuestionsArray(String[] numbers, String[] numbers2) {
        String[] questions = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            questions[i] = numbers[i] + " " + numbers2[i];
        }
        return questions;
    }
    private static String[] generateAnswersArray(String[] numbers, String[] numbers2) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            correctAnswers[i] = Integer.toString(findingGCD(Integer.parseInt(numbers[i]),
                    Integer.parseInt(numbers2[i])));
        }
        return correctAnswers;
    }
    private static int findingGCD(int number, int number2) {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
