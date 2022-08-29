package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoWhileOperationTest {

    private final DoWhileOperation doWhileOperation = new DoWhileOperation();

    @Test
    public void allElement() {
        Assertions.assertEquals("1 2 3 4 5", doWhileOperation.allElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void secondElement() {
        Assertions.assertEquals("2 4", doWhileOperation.secondElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void reversArray() {
        Assertions.assertEquals("5 4 3 2 1", doWhileOperation.reversArray(new int[]{1, 2, 3, 4, 5}));
    }
}