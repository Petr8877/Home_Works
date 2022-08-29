package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4t2Test {

    private final Task4t2 task4_2 = new Task4t2();

    @Test
    public void middleNumber() {
        Assertions.assertEquals(3, task4_2.middleNumber(1, 3, 7));
    }
}