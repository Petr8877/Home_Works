package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1t2Test {

    private final Task1t2 task1_2 = new Task1t2();

    @Test
    public void factorial() {
        Assertions.assertEquals(120, task1_2.factorial(5));
    }
}