package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Progression {
    private static int first;
    private static int step;
    private static String hiddenNumber;
    public static void ariphmProgr(String name) {
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < WINCOUNT; i++) {
            final int maxNumber = 50;
            final int maxStep = 10;
            first = RandomUtils.nextInt(1, maxNumber);
            step = RandomUtils.nextInt(1, maxStep);
            array();
            var answer = userAnswer();
            var correctAnswer = hiddenNumber;
            if (condition(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static void array() {
        final int minNumbers = 5;
        final int maxNumbers = 10;
        int progressionLength = RandomUtils.nextInt(minNumbers, maxNumbers);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(first + step * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionLength);
        hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        System.out.println("Question: " + String.join(" ", progressionArray));
    }
}
