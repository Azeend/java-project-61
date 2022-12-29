package hexlet.code.games;

import static hexlet.code.Engine.*;

public class GCD {
    public static void gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < WINCOUNT; i++) {
            randomNumber();
            var correctAnswer = Integer.toString(isGCD());
            System.out.println("Question: " + number + " " + number2);
            answer();
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static int isGCD() {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
