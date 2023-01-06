package hexlet.code.games;

public class Even  {
    public static String[] getGameDataEven() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var number = RandomUtilsNumber.randomNumber();
        var question = "Question: " + number;
        var correctAnswer = number % 2 == 0 ? "yes" : "no";
        String[] questionAndAnswer = {question, correctAnswer, task};
        return questionAndAnswer;
    }
}
