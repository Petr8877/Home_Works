package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task5Test {

    private final Task5 task5 = new Task5();

    @Test
    public void task5_1() {
        Assertions.assertEquals(7, task5.task5_1("1234576"));
    }

    @Test
    public void task5_2() {
        Assertions.assertEquals(5, task5.task5_2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void task5_3() {
        Assertions.assertEquals("Колличество нечетных цифр 5Колличество четных чисел 4", task5.task5_3("123456789"));
    }

    @Test
    public void task5_4() {
        Assertions.assertEquals("1 2 3 5", task5.task5_4(4));
    }

    @Test
    public void task5_5() {
        Assertions.assertEquals("0 2 4 6", task5.task5_5(6, 2));
    }

    @Test
    public void task5_6() {
        Assertions.assertEquals("123456", task5.task5_6("654321"));
    }
}