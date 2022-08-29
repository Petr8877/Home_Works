package home_work_2.loops;

public class Task1t2 {

    /**
     * Метод factorial возвращает факториал переданного числа
     *
     * @param number переданное в метод число
     * @return возвращает result произведения каждого числа от 1 до number
     * так же выводит в консоль все числа в форме 1 * 2 * ... * number
     * при переполнении (превышении максимального значения для long) выводит в консоль сообщение "Произошло переполнение"
     * данный метод использует рекурсию
     */
    public long factorial(int number) {
        long result = 1;
        if (number == 1 || number == 0) {
            return result;
        }
        result = number * factorial(number - 1);
        System.out.print(" * " + number);
        if (result < 0) {
            System.out.println("Произошло переполнение");
            System.exit(1);
        }
        return result;
    }
}
