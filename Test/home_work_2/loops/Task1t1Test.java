package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1t1Test {

    private final Task1t1 task1_1 = new Task1t1();

    @Test
    public void factorial() {
        Assertions.assertEquals(120, task1_1.factorial(5));
    }
}