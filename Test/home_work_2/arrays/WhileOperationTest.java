package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WhileOperationTest {

    private final WhileOperation whileOperation = new WhileOperation();

    @Test
    public void allElement() {
        Assertions.assertEquals("1 2 3 4 5", whileOperation.allElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void secondElement() {
        Assertions.assertEquals("2 4", whileOperation.secondElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void reversArray() {
        Assertions.assertEquals("5 4 3 2 1", whileOperation.reversArray(new int[]{1, 2, 3, 4, 5}));
    }
}