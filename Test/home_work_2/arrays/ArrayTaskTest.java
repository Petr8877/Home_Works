package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayTaskTest {

    private final ArrayTask arrayTask = new ArrayTask();

    @Test
    public void task2_4_1() {
        Assertions.assertEquals(12, arrayTask.task2_4_1(new int[]{1, 3, 5, 4, 2, 6}));
    }

    @Test
    public void task2_4_2() {
        Assertions.assertEquals(12, arrayTask.task2_4_2(new int[]{1, 8, 2, 17, 12, 54, 6, 4, 9}));
    }

    @Test
    public void task2_4_3() {
        Assertions.assertEquals("1 3 2", arrayTask.task2_4_3(new int[]{8, 1, 9, 3, 2, 7}));
    }

    @Test
    public void task2_4_4() {
        Assertions.assertEquals("Минимальный элемент массива равен 1 второй минимальный элемент равен 2", arrayTask.task2_4_4(new int[]{4, 5, 2, 6, 10, 1}));
    }

    @Test
    public void task2_4_5() {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] y = {1, 2, 3, 8, 9};
        Assertions.assertArrayEquals(y, arrayTask.task2_4_5(x, 4, 7));
    }

    @Test
    public void task2_4_6() {
        Assertions.assertEquals(39, arrayTask.task2_4_6(new int[]{4, 9, 2, 1, 53, 7, 5, 12}));
    }
}