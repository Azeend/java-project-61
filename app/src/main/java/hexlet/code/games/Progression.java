package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.startGame;
import static hexlet.code.util.RandomNumberUtils.MAXROUND;

public class Progression {
    static final int MAXNUMBER = 50;
    static final int MAXSTEP = 10;
    static final int MINLENGHT = 5;
    static final int MAXLENGTH = 10;
    static final String TASK =  "What number is missing in the progression?";
    public static void playGame() {
        startGame(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questions = new String[2][MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            int step = RandomUtils.nextInt(1, MAXSTEP);
            int first = RandomUtils.nextInt(1, MAXNUMBER);
            int progressionLength = RandomUtils.nextInt(MINLENGHT, MAXLENGTH);
            String[] questionArray =
                    generateArrayOfQuestionAndAnswer(generateNumbersArray(progressionLength, first, step));
            questions[0][i] = questionArray[0];
            questions[1][i] = questionArray[1];
        }
        return questions;
    }

    private static int[] generateNumbersArray(int progressionLength, int first, int step) {
        int[] results = new int[progressionLength];
        for (var i = 0; i < results.length; i++) {
            results[i] = (first + step * i);
        }
        return results;
    }

    private static String[] generateArrayOfQuestionAndAnswer(int[] results) {
        int indexOfHiddenNumber = RandomUtils.nextInt(0, results.length);
        String[] numbersAsString = new String[results.length];
        for (var i = 0; i < results.length; i++) {
            numbersAsString[i] = Integer.toString(results[i]);
        }
        var hiddenNumber = numbersAsString[indexOfHiddenNumber];
        numbersAsString[indexOfHiddenNumber] = "..";
        var correctAnswer = hiddenNumber;
        String question = String.join(" ", numbersAsString);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
