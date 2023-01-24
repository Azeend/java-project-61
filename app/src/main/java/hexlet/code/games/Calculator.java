package hexlet.code.games;

import hexlet.code.Util.RandomNumberUtils;
import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.engine;
import static hexlet.code.Util.RandomNumberUtils.MAXROUND;

public class Calculator {
    static final String[] SIGNS = {"+", "-", "*"};
    static final String TASK = "What is the result of the expression?";
    public static void playGame() {
        engine(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            var randomNum1 = RandomNumberUtils.generateNumbers();
            var randomNum2 = RandomNumberUtils.generateNumbers();
            final var lastIndex = 2;
            int randomSignIndex = RandomUtils.nextInt(0, lastIndex);
            String randomSign = SIGNS[randomSignIndex];
            var correctAnswer = calculateAnswer(randomSign, Integer.parseInt(randomNum1[i]),
                    Integer.parseInt(randomNum2[i]));
            questions[0][i] = randomNum1[i] + " " + randomSign + " " + randomNum2[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static String calculateAnswer(String randomSign, int randomNum1, int randomNum2) {
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
