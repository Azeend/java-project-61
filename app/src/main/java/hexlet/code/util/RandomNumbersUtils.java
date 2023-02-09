package hexlet.code.util;

import org.apache.commons.lang3.RandomUtils;

public class RandomNumbersUtils {
    static final int MAXNUMBER = 100;
    public static int generateNumber() {
        return RandomUtils.nextInt(2, MAXNUMBER);
    }
}
