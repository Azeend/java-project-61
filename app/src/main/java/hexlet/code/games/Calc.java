package hexlet.code.games;


import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.randomNumber2;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Calc {
    public static void calculate(String name) {
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < WINCOUNT; i++) {
            int number = randomNumber();
            int number2 = randomNumber2();
            int[] results = new int[WINCOUNT];
            results[0] = number + number2;
            results[1] = number - number2;
            results[2] = number * number2;
            String[] resultsAsString = new String[WINCOUNT];
            resultsAsString[0] = number + " + " + number2;
            resultsAsString[1] = number + " - " + number2;
            resultsAsString[2] = number + " * " + number2;
            int randomResultsIndex = RandomUtils.nextInt(0, 2);
            int resultsRandomAnswer = results[randomResultsIndex];
            var correctAnswer = Integer.toString(resultsRandomAnswer);
            System.out.println("Question: " + String.join(" ", resultsAsString[randomResultsIndex]));
            var answer = userAnswer();
            if (condition(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
