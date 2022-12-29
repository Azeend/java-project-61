package hexlet.code.games;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Prime {
    public static boolean numberIsPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void isPrime(String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < WINCOUNT; i++) {
            int number = randomNumber();
            System.out.println("Question: " + number);
            var answer = userAnswer();
            var correctAnswer = numberIsPrime(number) ? "yes" : "no";
            if (condition(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
