package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Task4t5Test {

    private final Task4t5 task4_5 = new Task4t5();

    @Test
    public void checkLetterOrNo1() {
        Assertions.assertEquals("Буква", task4_5.checkLetterOrNo(70));
    }

    @Test
    public void checkLetterOrNo2() {
        Assertions.assertEquals("Не буква", task4_5.checkLetterOrNo(60));
    }
}