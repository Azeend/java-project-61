package hexlet.code.games;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void even(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < WINCOUNT; i++) {
            int number = randomNumber();
            System.out.println("Question: " + number);
            var answer = userAnswer();
            System.out.println("Your answer: " + answer);
            var correctAnswer = isEven(number) ? "yes" : "no";
            if (condition(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
