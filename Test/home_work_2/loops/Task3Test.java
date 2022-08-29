package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    private final Task3 task3 = new Task3();

    @Test
    public void degree() {
        Assertions.assertEquals(4, task3.degree(2, 2));
    }
}