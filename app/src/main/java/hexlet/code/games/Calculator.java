package hexlet.code.games;

import hexlet.code.util.RandomNumberUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.NoSuchElementException;

import static hexlet.code.Engine.startGame;
import static hexlet.code.util.RandomNumberUtils.MAXROUND;

public class Calculator {
    static final String[] SIGNS = {"+", "-", "*"};
    static final String TASK = "What is the result of the expression?";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        var randomNum1 = RandomNumberUtils.generateNumbers();
        var randomNum2 = RandomNumberUtils.generateNumbers();
        final var lastIndex = 2;
        for (var i = 0; i < MAXROUND; i++) {
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
        String resultAnswer;
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
                throw new NoSuchElementException();
            }
        }
    }
}
