package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class RandomUtilsNumber {
    static final int MAXRANDOM = 100;
    static final int MAXROUND = 3;
    public static String[] getNumbers() {
        String[] numbers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            int number = RandomUtils.nextInt(2, MAXRANDOM);
            numbers[i] = Integer.toString(number);
        }
        return numbers;
    }
}
