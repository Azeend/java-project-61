package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static String[] getGameDataProgression() {
        var task = "What number is missing in the progression?";
        final int maxNumber = 50;
        final int maxStep = 10;
        int first = RandomUtils.nextInt(1, maxNumber);
        int step = RandomUtils.nextInt(1, maxStep);
        final int minNumbers = 5;
        final int maxNumbers = 10;
        int progressionLength = RandomUtils.nextInt(minNumbers, maxNumbers);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(first + step * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionArray.length);
        var hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        var question = "Question: " + String.join(" ", progressionArray);
        var correctAnswer = hiddenNumber;
        String[] questionAndAnswer = {question, correctAnswer, task};
        return questionAndAnswer;
    }
}
