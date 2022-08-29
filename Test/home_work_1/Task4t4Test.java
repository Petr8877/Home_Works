package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4t4Test {

    private final Task4t4 task4_4 = new Task4t4();

    @Test
    public void byteToKilobyte() {
        Assertions.assertEquals(2, task4_4.byteToKilobyte(2048));
    }

    @Test
    public void kilobyteToByte() {
        Assertions.assertEquals(1024, task4_4.kilobyteToByte(1));
    }
}