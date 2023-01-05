package hexlet.code.games;

import static hexlet.code.Engine.randomNumber;

public class Even implements Game {
    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] getGameData() {
        var number = randomNumber();
        var question = "Question: " + number;
        var correctAnswer = isEven(number) ? "yes" : "no";
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
