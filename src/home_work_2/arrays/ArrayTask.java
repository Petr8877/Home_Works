package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {

    }

    /**
     * 2.4.1. Сумма четных положительных элементов массива
     * Метод task2_4_1 суммирует четные положительные элементы массива
     */
    public static int task2_4_1(int[] array) {
        int result = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    /**
     * 2.4.2. Максимальный из элементов массива с четными индексами
     * Метод task2_4_2 определяет и возвращает максимальный элемент массива с четным индексом
     */
    public static int task2_4_2(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    /**
     * 2.4.3. Элементы массива, которые меньше среднего арифметического
     * Метод task2_4_3 определяет и возвращает все элементы массива, которые меньше среднего арифметического
     */
    public static StringBuilder task2_4_3(int[] array) {
        StringBuilder str = new StringBuilder();
        int sumArray = 0;
        for (int i : array) {
            sumArray += i;
        }
        int arithmeticMean = sumArray / array.length;
        for (int i : array) {
            if (i < arithmeticMean) {
                str.append(i + " ");
            }
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * 2.4.4. Найти два наименьших (минимальных) элемента массива
     * Метод task2_4_4 определяет и возвращает два минимальных элемента массива
     */
    public static String task2_4_4(int[] array) {
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE - 1;
        for (int j : array) {
            if (j < min) {
                min1 = min;
                min = j;
            }
        }
        String result = "Минимальный элемент массива равен " + min + " второй минимальный элемент равен " + min1;
        return result;
    }

    /**
     * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     * Метод task2_4_5 определяет и смещает на соседний (правый) элементы, принадлежащие интервалу
     * после смещения всего массива крайние элементы (соответствуют количеству найденых элементов принадлежащих интервалу)
     * заменяются на 0
     */
    public static int[] task2_4_5(int[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите нижний предел интервала (от 0 до 100)");
        int min = scan.nextInt();
        System.out.println("Введите верхний предел интервала (от 0 до 100)");
        int max = scan.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                count++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - count] = 0;
                i--;
            }
        }
        return array;
    }

    /**
     * 2.4.6. Сумма цифр массива
     * Метод task2_4_6 разделяет каждый элемент массива на цифры и суммирует все цифры массива
     */
    public static int task2_4_6(int[] array) {
        int sumNumber = 0;
        for (int i : array) {
            if (i > 9) {
                int firstNumber = i / 10;
                int secondNumber = i % 10;
                if (firstNumber <= 9) {
                    sumNumber += firstNumber + secondNumber;
                }
                if (firstNumber > 9) {
                    int x = firstNumber / 10;
                    int y = firstNumber % 10;
                    sumNumber += x + y + secondNumber;
                }
            } else {
                sumNumber += i;
            }
        }
        return sumNumber;
    }
}
