package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.engine;
import static hexlet.code.games.RandomUtilsNumber.MAXROUND;

public class Progression {
    public static void playGame() {
        var questions = generateQuestionsArray();
        var answers = generateAnswersArray(questions);
        String[][] questionAndAnswers = {questions, answers};
        engine(questionAndAnswers, TASK);
    }
    static final int MAXNUMBER = 50;
    static final int MAXSTEP = 10;
    static final int MINLENGHT = 5;
    static final int MAXLENGTH = 10;
    static final String TASK =  "What number is missing in the progression?";

    private static Integer[] generateNumbersArray(int maxLength, int minLength, int first, int step) {
        int progressionLength = RandomUtils.nextInt(minLength, maxLength);
        Integer[] numbersArray = new Integer[progressionLength];
        for (var i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = first + step * i;
        }
        return numbersArray;
    }

    private static String generateProgressionWithHidden(Integer[] numbersArray) {
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

    private static String[] generateQuestionsArray() {
        String[] questions = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            int step = RandomUtils.nextInt(1, MAXSTEP);
            int first = RandomUtils.nextInt(1, MAXNUMBER);
            questions[i] = generateProgressionWithHidden(generateNumbersArray(MAXLENGTH, MINLENGHT, first, step));
        }
        return questions;
    }

    private static String[] generateAnswersArray(String[] questions) {
        String[] correctAnswers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            var answer = generateRightAnswer(questions[i]);
            correctAnswers[i] = Integer.toString(answer);
        }
        return correctAnswers;
    }

    private static int generateRightAnswer(String progressionWithHidden) {
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
