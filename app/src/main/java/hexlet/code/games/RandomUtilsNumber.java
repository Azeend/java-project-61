package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class RandomUtilsNumber {
    static final int MAXRANDOM = 100;
    public static int randomNumber() {
        return RandomUtils.nextInt(2, MAXRANDOM);
    }
}
