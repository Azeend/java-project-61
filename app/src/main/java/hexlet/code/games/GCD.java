package hexlet.code.games;


public class GCD {
    public static String[] getGameDataGCD() {
        var task = "Find the greatest common divisor of given numbers.";
        int number = RandomUtilsNumber.randomNumber();
        int number2 = RandomUtilsNumber.randomNumber();
        var question = "Question: " + number + " " + number2;
        var correctAnswer = Integer.toString(isGCD(number, number2));
        String[] questionAndAnswer = {question, correctAnswer, task};
        return questionAndAnswer;
    }

    private static int isGCD(int number, int number2) {
        int gcd = 1;
        for (int j = 1; j <= number && j <= number2; j++) {
            if (number % j == 0 && number2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
