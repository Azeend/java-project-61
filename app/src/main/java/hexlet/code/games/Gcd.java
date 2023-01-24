package hexlet.code.games;

import hexlet.code.Util.RandomNumberUtils;

import static hexlet.code.Engine.engine;
import static hexlet.code.Util.RandomNumberUtils.MAXROUND;

public class Gcd {
    static final String TASK = "Find the greatest common divisor of given numbers.";
    public static void playGame() {
        engine(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var numbers = RandomNumberUtils.generateNumbers();
        var numbers2 = RandomNumberUtils.generateNumbers();
        for (var i = 0; i < MAXROUND; i++) {
            var correctAnswer = Integer.toString(findGCD(Integer.parseInt(numbers[i]),
                    Integer.parseInt(numbers2[i])));
            questions[0][i] = numbers[i] + " " + numbers2[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static int findGCD(int number, int number2) {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
