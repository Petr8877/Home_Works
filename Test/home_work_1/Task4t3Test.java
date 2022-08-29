package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4t3Test {

    private final Task4t3 task4_3 = new Task4t3();

    @Test
    public void checkDiv1() {
        Assertions.assertTrue(task4_3.checkDiv(2, 2));
    }

    @Test
    public void checkDiv2() {
        Assertions.assertFalse(task4_3.checkDiv(2, 3));
    }
}