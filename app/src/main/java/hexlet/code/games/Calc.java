package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Calc {
    public static void playGame() {
        var numbers = RandomUtilsNumber.getNumbers();
        var numbers2 = RandomUtilsNumber.getNumbers();
        String sign = getSigns();
        engine(getQuestions(numbers, numbers2, sign), getTask(), getAnswers(numbers, numbers2, sign));
    }
    private static String getTask() {
        return "What is the result of the expression?";
    }
    private static String getSigns() {
        final var lastIndex = 2;
        String[] signs = {"+", "-", "*"};
        int randomSignIndex = RandomUtils.nextInt(0, lastIndex);
        String randomSign = signs[randomSignIndex];
        return randomSign;
    }

    private static String[] getQuestions(String[] randomNum1, String[] randomNum2, String randomSign) {
        String[] questions = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            questions[i] = randomNum1[i] + " " + randomSign + " " + randomNum2[i];
        }
        return questions;
    }

    private static String[] getAnswers(String[] randomNum1, String[] randomNum2, String randomSign) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            correctAnswers[i] = getAnswer(randomSign, Integer.parseInt(randomNum1[i]), Integer.parseInt(randomNum2[i]));
        }
        return correctAnswers;
    }

    private static String getAnswer(String randomSign, int randomNum1, int randomNum2) {
        var resultAnswer = "";
        switch (randomSign) {
            case "+" -> {
                resultAnswer = Integer.toString(randomNum1 + randomNum2);
                return resultAnswer;
            }
            case "-" -> {
                resultAnswer = Integer.toString(randomNum1 - randomNum2);
                return resultAnswer;
            }
            case "*" -> {
                resultAnswer = Integer.toString(randomNum1 * randomNum2);
                return resultAnswer;
            }
            default -> {
            }
        }
        return resultAnswer;
    }
}
