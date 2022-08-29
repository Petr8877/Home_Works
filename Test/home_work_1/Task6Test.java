package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {

    private final Task6 task6 = new Task6();


    @Test
    public void welcome1() {
        Assertions.assertEquals("Превет! \nЯ тебя так долго ждал", task6.welcome("Вася"));
    }

    @Test
    public void welcome2() {
        Assertions.assertEquals("Я тебя так долго ждал", task6.welcome("Анастасия"));
    }

    @Test
    public void welcome3() {
        Assertions.assertEquals("Добрый день а Вы кто?", task6.welcome("Петя"));
    }
}