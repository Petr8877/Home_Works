package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Task5Test {

    private final Task5 task5 = new Task5();

    @Test
    public void sleepIn1() {
        Assertions.assertEquals("Пора на работу", task5.sleepIn(true, false));
    }

    @Test
    public void sleepIn2() {
        Assertions.assertEquals("Можем спать дальше", task5.sleepIn(true, true));
    }

    @Test
    public void sleepIn3() {
        Assertions.assertEquals("Можем спать дальше", task5.sleepIn(false, true));
    }

    @Test
    public void sleepIn4() {
        Assertions.assertEquals("Можем спать дальше", task5.sleepIn(false, false));
    }
}