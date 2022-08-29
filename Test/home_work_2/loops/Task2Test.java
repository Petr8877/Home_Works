package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {

    private final Task2 task2 = new Task2();

    @Test
    public void multiplication() {
        Assertions.assertEquals(24, task2.multiplication(1423));
    }
}