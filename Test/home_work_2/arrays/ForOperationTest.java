package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForOperationTest {

    private final ForOperation forOperation = new ForOperation();

    @Test
    public void allElement() {
        Assertions.assertEquals("1 2 3 4 5", forOperation.allElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void secondElement() {
        Assertions.assertEquals("2 4", forOperation.secondElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void reversArray() {
        Assertions.assertEquals("5 4 3 2 1", forOperation.reversArray(new int[]{1, 2, 3, 4, 5}));
    }
}