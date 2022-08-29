package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4t1Test {

    private final Task4t1 task4_1 = new Task4t1();

    @Test
    public void oddNumber() {
        Assertions.assertArrayEquals(new int[]{1, 3, 5}, task4_1.oddNumber(new int[]{1, 2, 3, 4, 5}));
    }
}