package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < WINCOUNT; i++) {
            randomNumber();
            System.out.println("Question: " + number);
            answer();
            var correctAnswer = isEven(number) ? "yes" : "no";
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
