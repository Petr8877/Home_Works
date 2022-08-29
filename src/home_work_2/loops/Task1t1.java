package home_work_2.loops;

public class Task1t1 {

    /**
     * Метод factorial возвращает факториал переданного числа
     *
     * @param number переданное в метод число
     * @return возвращает result произведения каждого числа от 1 до number
     * так же выводит в консоль все числа в форме 1 * 2 * ... * number
     * при переполнении (превышении максимального значения для long) выводит в консоль сообщение "Произошло переполнение"
     */
    public long factorial(int number) {
        long result = 1;
        System.out.print(1);
        for (int i = 2; i <= number; i++) {
            result *= i;
            System.out.print(" * " + i);
            if (result < 0) {
                System.out.println("Произошло переполнение");
                break;
            }
        }
        return result;
    }
}
