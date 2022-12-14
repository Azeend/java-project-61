package hexlet.code;

import  java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void isEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var x = 3; x > 0; x--) {
            var digit = RandomUtils.nextInt(1, 1000);
            System.out.println("Question: " + digit);
            var answer = scan.next();
            System.out.println("Your answer: " + answer);
            var answerEvenAndYes = (digit % 2 == 0 && answer.equals("yes"));
            var answerOddAndNo = (digit % 2 != 0 && answer.equals("no"));
            if (answerEvenAndYes || answerOddAndNo) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            } else if (answer.equals("yes")) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.\n Let's try again, " + name);
                break;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'.\n Let's try again, " + name);
                break;
            }
        }
    }
}

