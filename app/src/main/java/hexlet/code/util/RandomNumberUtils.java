package hexlet.code.util;

import org.apache.commons.lang3.RandomUtils;

public class RandomNumberUtils {
    static final int MAXNUMBER = 100;
    public static final int MAXROUND = 3;
    public static int[] generateNumbers() {
        int[] numbers = new int[MAXROUND];
        for (var i = 0; i < MAXROUND; i++) {
            int number = RandomUtils.nextInt(2, MAXNUMBER);
            numbers[i] = number;
        }
        return numbers;
    }
}
