package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Progression {
    public static void playGame() {
        var questions = getQuestions();
        engine(questions, getTask(), getAnswers(questions));
    }
    private static String getTask() {
        return "What number is missing in the progression?";
    }
    private static Integer[] getNumbersArray() {
        final int maxNumber = 50;
        final int maxStep = 10;
        int step = RandomUtils.nextInt(1, maxStep);
        int first = RandomUtils.nextInt(1, maxNumber);
        final int minLength = 5;
        final int maxLength = 10;
        int progressionLength = RandomUtils.nextInt(minLength, maxLength);
        Integer[] numbersArray = new Integer[progressionLength];
        for (var i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = first + step * i;
        }
        return numbersArray;
    }

    private static String getProgressionWithHidden(Integer[] numbersArray) {
        int progressionLength = numbersArray.length;
        int randomIndex = RandomUtils.nextInt(0, progressionLength);
        String[] results = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            var hiddenNumber = Integer.toString(numbersArray[i]);
            if (i == randomIndex) {
                hiddenNumber = "..";
            }
            results[i] = hiddenNumber;
        }
        String result = String.join(" ", results);
        return result;
    }

    private static String[] getQuestions() {
        String[] questions = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            questions[i] = getProgressionWithHidden(getNumbersArray());
        }
        return questions;
    }

    private static String[] getAnswers(String[] questions) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            var answer = getRightAnswer(questions[i]);
            correctAnswers[i] = Integer.toString(answer);
        }
        return correctAnswers;
    }

    private static int getRightAnswer(String progressionWithHidden) {
        String[] numbers = progressionWithHidden.split(" ");
        var result = 0;
        for (var i = 0; i < 2; i++) {
            if (numbers[i].equals("..")) {
                var forwardNumber = Integer.parseInt(numbers[i + 1]);
                var step = Integer.parseInt(numbers[i + 2]) - forwardNumber;
                result = forwardNumber - step;
                return result;
            }
        }
        for (var i = 2; i < numbers.length; i++) {
            if (numbers[i].equals("..")) {
                var previousNumber = Integer.parseInt(numbers[i - 1]);
                var step = previousNumber - Integer.parseInt(numbers[i - 2]);
                result = previousNumber + step;
            }
        }
        return result;
    }
}
