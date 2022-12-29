package hexlet.code.games;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.answer;
import static hexlet.code.Engine.number;
import static hexlet.code.Engine.condition;
import static hexlet.code.Engine.userName;

public class Prime {
    public static void isPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < WINCOUNT; i++) {
            randomNumber();
            System.out.println("Question: " + number);
            answer();
            var correctAnswer = numberIsPrime(number) ? "yes" : "no";
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
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
