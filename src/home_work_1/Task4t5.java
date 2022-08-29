package home_work_1;

public class Task4t5 {

    public String checkLetterOrNo(int number) {
        if (number >= 65 && number <= 90 || number >= 97 && number <= 122) {
            return "Буква";
        } else {
            return "Не буква";
        }
    }

}
