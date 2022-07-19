package home_work_2.loops;

import java.util.Scanner;

public class Task2 {

    /**
     * В классе main запрашиваем у Поьзователя число и передам это число методу multiplication
     * при вводе Пользователем вещественного числа выводим в консоль сообщение "Введено не целое число"
     * при вводе Пользователем иных символов выводим в консоль сообщение "Введено не число"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(" = " + multiplication(number));
        } else if (scan.hasNextDouble()) {
            System.out.println("Введено не целое число");
        } else if (scan.hasNextLine()) {
            System.out.println("Введено не число");
        }
    }

    /**
     * Метод multiplication возвращает произведение всех цифр введенного числа
     * преобразовывает введеммное число в массив цифр данного числа
     * последовательно перемножает все элементы массива
     * выводит в консоль каждый елемнт массива
     *
     * @param number переданное число
     * @return result - произведение всех цифр введенного числа
     */
    public static long multiplication(int number) {
        String v = Integer.toString(number);
        long result = 1;
        int[] ar = new int[v.length()];
        for (int i = ar.length - 1; i >= 0; i--) {
            if (number > 9) {
                ar[i] = number % 10;
                number = number / 10;
            } else {
                ar[i] = number;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                System.out.print(ar[i]);
                result *= ar[i];
            } else {
                System.out.print(" * " + ar[i]);
                result *= ar[i];
            }
        }
        return result;
    }
}