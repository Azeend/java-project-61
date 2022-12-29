package hexlet.code.games;


import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.answer;
import static hexlet.code.Engine.condition;
import static hexlet.code.Engine.userName;
import static hexlet.code.Engine.number;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.number2;

public class Calc {
    public static void calculate() {
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < WINCOUNT; i++) {
            randomNumber();
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
            answer();
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
