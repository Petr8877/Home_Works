package home_work_1;

public class Task5 {

    public String sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return "Можем спать дальше";
        } else {
            return "Пора на работу";
        }
    }
}
