package home_work_1;

import java.util.Objects;

public class Task6 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Превет! \nЯ тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день а Вы кто?";
        }
    }
}
