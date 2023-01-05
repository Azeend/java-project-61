package hexlet.code.games;

import static hexlet.code.Engine.randomNumber;

public final class Prime implements Game {
    @Override
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getGameData() {
        var number = randomNumber();
        var question = "Question: " + number;
        var correctAnswer = numberIsPrime(number) ? "yes" : "no";
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }

    public static boolean numberIsPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
