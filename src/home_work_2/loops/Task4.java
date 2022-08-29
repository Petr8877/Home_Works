package home_work_2.loops;

public class Task4 {

    /**
     * Метод main содержит бесконечный цикл для достижения переполнения
     * Данный метод корректно работает при любых цельночисловых значениях введенного Пользователем числа
     */
    public String overflow(int number) {
        long a = 1;
        for (long result = a; ; ) {
            try {
                result = Math.multiplyExact(result, number);
            } catch (ArithmeticException e) {
                return e.getMessage();
            }
        }
    }
}