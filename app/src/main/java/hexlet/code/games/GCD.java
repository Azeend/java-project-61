package hexlet.code.games;

import static hexlet.code.Engine.randomNumber;

public final class GCD implements Game {
    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] getGameData() {
        int number = randomNumber();
        int number2 = randomNumber();
        var question = "Question: " + number + " " + number2;
        var correctAnswer = Integer.toString(isGCD(number, number2));
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }

    public static int isGCD(int number, int number2) {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
