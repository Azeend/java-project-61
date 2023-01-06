package hexlet.code.games;


public class Prime {
    public static String[] getGameDataPrime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var number = RandomUtilsNumber.randomNumber();
        var question = "Question: " + number;
        var correctAnswer = numberIsPrime(number) ? "yes" : "no";
        String[] questionAndAnswer = {question, correctAnswer, task};
        return questionAndAnswer;
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
