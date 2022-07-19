package home_work_2.loops;

import java.util.Scanner;

public class Task4_1_2 {

    /**
     * Метод main запрашивает у Пользователя целое положительное число
     * при вводе отридцательного либо не целого числа выводит в консоль сообщение "Введите целое положительное число"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            if (number > 0) {
                System.out.println("Результат после переполнения " + factorial(number));
            } else {
                System.out.println("Введите целое положительное число");
            }
        } else {
            System.out.println("Введите целое положительное число");
        }
    }

    /**
     * Метод factorial содержит бесконечный цикл для достижения переполнения
     * Данный метод кооректно отслеживает переполнение только при целом и положительном переданном аргументе
     *
     * @param number переданный аргумент
     * @return результата умножения на момент переполнения
     */
    public static long factorial(int number) {
        long result = 1;
        long pre = 0;
        for (int i = number; ; ) {
            result *= i;
            if (result < 0) {
                System.out.println("Произошло переполнение");
                System.out.println("Результат до переполнения " + pre);
                break;
            }
            pre = result;
        }
        return result;
    }
}
