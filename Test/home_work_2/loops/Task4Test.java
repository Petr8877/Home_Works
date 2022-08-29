package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4Test {

    private final Task4 task4_3_4 = new Task4();

    @Test
    public void overflow() {
        Assertions.assertEquals("long overflow", task4_3_4.overflow(-19));
    }
}