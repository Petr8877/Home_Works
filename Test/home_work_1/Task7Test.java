package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {

    private final Task7 task7 = new Task7();

    @Test
    public void createPhoneNumber() {
        Assertions.assertEquals("(123) 456-7890", task7.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}