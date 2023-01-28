package hexlet.code.util;

import org.apache.commons.lang3.RandomUtils;

public class RandomNumberUtils {
    static final int MAXRANDOM = 100;
    public static final int MAXROUND = 3;
    public static String[] generateNumbers() {
        String[] numbers = new String[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            int number = RandomUtils.nextInt(2, MAXRANDOM);
            numbers[i] = Integer.toString(number);
        }
        return numbers;
    }
}
