package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayTask {
    public static void main(String[] args) {

    }

    /**
     * 2.4.1. Сумма четных положительных элементов массива
     * Метод task2_4_1 суммирует четные положительные элементы массива
     */
    public static void task2_4_1() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int result = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println("Сумма четных положительных элементов массива " + result);
    }

    /**
     * 2.4.2. Максимальный из элементов массива с четными индексами
     * Метод task2_4_2 определяет и выводит в консоль максимальный элемент массива с четным индексом
     */
    public static void task2_4_2() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("Максимальный из элементов массива с четными индексами " + max);
    }

    /**
     * 2.4.3. Элементы массива, которые меньше среднего арифметического
     * Метод task2_4_3 определяет и выводит в консоль все элементы массива, которые меньше среднего арифметического
     */
    public static void task2_4_3() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        String lowElements = "";
        int sumArray = 0;
        for (int i : array) {
            sumArray += i;
        }
        int arithmeticMean = sumArray / array.length;
        for (int i : array) {
            if (i < arithmeticMean) {
                lowElements += i + " ";
            }
        }
        System.out.println("Элементы массива, которые меньше среднего арифметического " + lowElements);
    }

    /**
     * 2.4.4. Найти два наименьших (минимальных) элемента массива
     * Метод task2_4_4 определяет и выводит в консоль два минимальных элемента массива
     */
    public static void task2_4_4() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE - 1;
        for (int j : array) {
            if (j < min) {
                min1 = min;
                min = j;
            }
        }
        System.out.println("Найти два наименьших (минимальных) элемента массива " + min + " и " + min1);
    }

    /**
     * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     * Метод task2_4_5 определяет и смещает на соседний (правый) элементы, принадлежащие интервалу
     * после смещения всего массива крайние элементы (соответствуют количеству найденых элементов принадлежащих интервалу)
     * заменяются на 0
     */
    public static void task2_4_5() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 30) {
                count++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - count] = 0;
                i--;
            }
        }
        System.out.println("Сжатый массив (без элементов принадлежащих интервалу [10, 30]");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * 2.4.6. Сумма цифр массива
     * Метод task2_4_6 разделяет каждый элемент массива на цифры и суммирует все цифры массива
     */
    public static void task2_4_6() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
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
        System.out.println(sumNumber);
    }
}
