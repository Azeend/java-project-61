package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;

public class Progression {
    private static int first;
    private static int step;
    private static String hiddenNumber;
    public static void ariphmProgr() {
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < WINCOUNT; i++) {
            first = RandomUtils.nextInt(1, 50);
            step = RandomUtils.nextInt(1, 10);
            array();
            answer();
            var correctAnswer = hiddenNumber;
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void array() {
        int progressionLength = RandomUtils.nextInt(5, 10);
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
