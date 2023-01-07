package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class GCD {
    public static void playGame() {
        var numbers = RandomUtilsNumber.getNumbers();
        var numbers2 = RandomUtilsNumber.getNumbers();
        engine(getQuestions(numbers, numbers2), getTask(), getAnswers(numbers, numbers2));
    }
    private static String getTask() {
        return "Find the greatest common divisor of given numbers";
    }
    private static String[] getQuestions(String[] numbers, String[] numbers2) {
        String[] questions = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            questions[i] = numbers[i] + " " + numbers2[i];
        }
        return questions;
    }
    private static String[] getAnswers(String[] numbers, String[] numbers2) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            correctAnswers[i] = Integer.toString(isGCD(Integer.parseInt(numbers[i]), Integer.parseInt(numbers2[i])));
        }
        return correctAnswers;
    }
    private static int isGCD(int number, int number2) {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
