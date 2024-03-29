package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {

    private final Task6 task6 = new Task6();

    @Test
    public void multiplicationTable() {
        Assertions.assertEquals("2 * 1 = 2\t3 * 1 = 3\t4 * 1 = 4\t5 * 1 = 5\n" +
                "2 * 2 = 4\t3 * 2 = 6\t4 * 2 = 8\t5 * 2 = 10\n" +
                "2 * 3 = 6\t3 * 3 = 9\t4 * 3 = 12\t5 * 3 = 15\n" +
                "2 * 4 = 8\t3 * 4 = 12\t4 * 4 = 16\t5 * 4 = 20\n" +
                "2 * 5 = 10\t3 * 5 = 15\t4 * 5 = 20\t5 * 5 = 25\n" +
                "2 * 6 = 12\t3 * 6 = 18\t4 * 6 = 24\t5 * 6 = 30\n" +
                "2 * 7 = 14\t3 * 7 = 21\t4 * 7 = 28\t5 * 7 = 35\n" +
                "2 * 8 = 16\t3 * 8 = 24\t4 * 8 = 32\t5 * 8 = 40\n" +
                "2 * 9 = 18\t3 * 9 = 27\t4 * 9 = 36\t5 * 9 = 45\n" +
                "2 * 10 = 20\t3 * 10 = 30\t4 * 10 = 40\t5 * 10 = 50\n" +
                "\n" +
                "6 * 1 = 6\t7 * 1 = 7\t8 * 1 = 8\t9 * 1 = 9\t10 * 1 = 10\n" +
                "6 * 2 = 12\t7 * 2 = 14\t8 * 2 = 16\t9 * 2 = 18\t10 * 2 = 20\n" +
                "6 * 3 = 18\t7 * 3 = 21\t8 * 3 = 24\t9 * 3 = 27\t10 * 3 = 30\n" +
                "6 * 4 = 24\t7 * 4 = 28\t8 * 4 = 32\t9 * 4 = 36\t10 * 4 = 40\n" +
                "6 * 5 = 30\t7 * 5 = 35\t8 * 5 = 40\t9 * 5 = 45\t10 * 5 = 50\n" +
                "6 * 6 = 36\t7 * 6 = 42\t8 * 6 = 48\t9 * 6 = 54\t10 * 6 = 60\n" +
                "6 * 7 = 42\t7 * 7 = 49\t8 * 7 = 56\t9 * 7 = 63\t10 * 7 = 70\n" +
                "6 * 8 = 48\t7 * 8 = 56\t8 * 8 = 64\t9 * 8 = 72\t10 * 8 = 80\n" +
                "6 * 9 = 54\t7 * 9 = 63\t8 * 9 = 72\t9 * 9 = 81\t10 * 9 = 90\n" +
                "6 * 10 = 60\t7 * 10 = 70\t8 * 10 = 80\t9 * 10 = 90\t10 * 10 = 100\n", task6.multiplicationTable());
    }
}