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
        var leftNumber = RandomNumberUtils.generateNumbers();
        var rightNumber = RandomNumberUtils.generateNumbers();
        final var lastIndex = 2;
        for (var i = 0; i < MAXROUND; i++) {
            String mathOperand = SIGNS[RandomUtils.nextInt(0, lastIndex)];
            var correctAnswer = calculateAnswer(mathOperand, leftNumber[i], rightNumber[i]);
            questions[0][i] = leftNumber[i] + " " + mathOperand + " " + rightNumber[i];
            questions[1][i] = correctAnswer;
        }
        return questions;
    }
    private static String calculateAnswer(String mathOperand, int leftNumber, int rightNumber) {
        String resultAnswer;
        switch (mathOperand) {
            case "+" -> {
                resultAnswer = Integer.toString(leftNumber + rightNumber);
                return resultAnswer;
            }
            case "-" -> {
                resultAnswer = Integer.toString(leftNumber - rightNumber);
                return resultAnswer;
            }
            case "*" -> {
                resultAnswer = Integer.toString(leftNumber * rightNumber);
                return resultAnswer;
            }
            default -> {
                throw new NoSuchElementException();
            }
        }
    }
}
