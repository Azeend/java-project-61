package hexlet.code.games;

import hexlet.code.util.RandomNumbersUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.NoSuchElementException;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.startGame;

public class Calculator {
    static final String[] SIGNS = {"+", "-", "*"};
    static final String TASK = "What is the result of the expression?";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[MAXROUND][2];
        for (var i = 0; i < MAXROUND; i++) {
            var leftNumber = RandomNumbersUtils.generateNumber();
            var rightNumber = RandomNumbersUtils.generateNumber();
            String mathOperand = SIGNS[RandomUtils.nextInt(0, SIGNS.length)];
            var correctAnswer = calculateAnswer(mathOperand, leftNumber, rightNumber);
            questions[i][0] = leftNumber + " " + mathOperand + " " + rightNumber;
            questions[i][1] = correctAnswer;
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
