package home_work_2.loops;

import java.util.Scanner;

public class Task3 {

    /**
     * Метод main получает у Пользователя число и степень возведения
     * при вводе значения степени отличного от целого положительного числа
     * ввыводит в консоль сообщение "Степень - только положительная и целая. Повторите ввод"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scan.nextDouble();
        System.out.println("Введите степень для возведения числа");
        if (scan.hasNextInt()) {
            int deg = scan.nextInt();
            if (deg > 0) {
                System.out.println(number + "^" + deg + " = " + degree(number, deg));
            } else {
                System.out.println("Степень - только положительная и целая. Повторите ввод");
            }
        } else {
            System.out.println("Степень - только положительная и целая. Повторите ввод");
        }
    }

    /**
     * Метод degree возводит переданное число в переданную степень
     *
     * @param number переданное вещественное число
     * @param degree переданная степень (целое и положительное число)
     * @return результат возведения в степень
     */
    public static double degree(double number, int degree) {
        int i = 1;
        double result = number;
        while (i < degree) {
            result = result * number;
            i++;
        }
        return result;
    }
}
