package home_work_2.loops;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для получения факториала введите число");
        int number = scan.nextInt();
        long result = factorial(number);
        if (result > 0) {
            System.out.println(" = " + result);
        }
    }

    /**
     * Метод factorial возвращает факториал переданного числа
     *
     * @param number переданное в метод число
     * @return возвращает result произведения каждого числа от 1 до number
     * так же выводит в консоль все числа в форме 1 * 2 * ... * number
     * при переполнении (превышении максимального значения для long) выводит в консоль сообщение "Произошло переполнение"
     */
    public static long factorial(int number) {
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
