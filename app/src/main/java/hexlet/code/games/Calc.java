package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.randomNumber;
public final class Calc implements Game {
    public static String getAnswer(String randomSign, int randomNum1, int randomNum2) {
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
    @Override
    public String getTask() {
        return "What is the result of the expression?";
    }
    @Override
    public String[] getGameData() {
        final var lastIndex = 2;
        String[] signs = {"+", "-", "*"};
        int randomNum1 = randomNumber();
        int randomNum2 = randomNumber();
        int randomSignIndex = RandomUtils.nextInt(0, lastIndex);
        String randomSign = signs[randomSignIndex];
        var resultQuestion = randomNum1 + " " + randomSign + " " + randomNum2;
        var question = "Question: " + resultQuestion;
        var correctAnswer = getAnswer(randomSign, randomNum1, randomNum2);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
