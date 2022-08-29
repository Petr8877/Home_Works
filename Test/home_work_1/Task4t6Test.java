package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Task4t6Test {

    private final Task4t6 task4_6 = new Task4t6();

    @Test
    public void checkYear1() {
        Assertions.assertEquals("Високосный", task4_6.checkYear(1996));
    }

    @Test
    public void checkYear2() {
        Assertions.assertEquals("Не високосный", task4_6.checkYear(1998));
    }
}