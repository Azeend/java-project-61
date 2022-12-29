package hexlet.code.games;

import static hexlet.code.Engine.WINCOUNT;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.randomNumber2;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class GCD {
    public static void gcd(String name) {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < WINCOUNT; i++) {
            int number = randomNumber();
            int number2 = randomNumber2();
            var correctAnswer = Integer.toString(isGCD(number, number2));
            System.out.println("Question: " + number + " " + number2);
            var answer = userAnswer();
            if (condition(correctAnswer, name, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
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
