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
    private static String[] generateNumbersArray(int progressionLength, int first, int step) {
        String[] results = new String[progressionLength];
        for (var i = 0; i < results.length; i++) {
            results[i] = Integer.toString(first + step * i);
        }
        return results;
    }

    private static String[] generateArrayOfQuestionAndAnswer(String[] results) {
        int randomIndex = RandomUtils.nextInt(0, results.length);
        var hiddenNumber = results[randomIndex];
        results[randomIndex] = "..";
        var correctAnswer = hiddenNumber;
        String question = String.join(" ", results);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
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
}
