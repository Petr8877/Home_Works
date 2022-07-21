package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("1.5.1. Найти наибольшую цифру натурального числа");
        System.out.println("Наибольшая цифра " + task5_1());
        System.out.println();
        System.out.println("1.5.2. Вероятность четных случайных чисел");
        System.out.println("Число четных случайных чисел на 1 000 случаев равняется " + task5_2());
        System.out.println();
        System.out.println("1.5.3. Посчитать четные и нечетные цифры числа");
        System.out.println("Количество нечетных цифр " + task5_3());
        System.out.println();
        System.out.println("1.5.4. Ряд Фибоначчи");
        System.out.println(task5_4());
        System.out.println();
        System.out.println("1.5.5. Вывести ряд чисел в диапазоне с шагом");
        System.out.println(task5_5());
        System.out.println("1.5.6. Переворот числа");
        System.out.println(task5_6());
    }

    /**
     * 1.5.1 Найти наибольшую цифру натурального числа
     * Метод task5_1 получает от Пользователя число после чего преобразует его в массив
     * по средствам цикла for переберает весь массив и определяет максимальную цифру
     *
     * @return максимальная цифра
     */
    public static int task5_1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String num = scan.nextLine();
        char[] array1 = num.toCharArray();
        int[] array2 = new int[num.length()];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length(); i++) {
            array2[i] = Character.getNumericValue(array1[i]);
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        return max;
    }

    /**
     * 1.5.2 Вероятность четных случайных чисел
     * Метод task5_2 создает массив на 1 000 лементов и заполняет его при помощи импортиравонно класса Random
     * определяет и подсчитывает колличество четных ччисел в массиве
     *
     * @return колличество четных чисел массива
     */
    public static int task5_2() {
        int counter = 0;
        int[] array = new int[1000];
        Random x = new Random();
        for (int i = 0; i < 1000; i++) {
            array[i] = x.nextInt();
            if (array[i] % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * 1.5.3. Посчитать четные и нечетные цифры числа
     * Метод task5_3 получает от Пользователя число, преобразует данное число в массив
     * определяет и подсчитывает колличество четных и нечетных цифр
     *
     * @return возвращает количество нечетных цифр
     * выводит в консоль сообщение с количеством четных цифр
     */
    public static StringBuilder task5_3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String num = scan.nextLine();
        char[] array1 = num.toCharArray();
        int[] array2 = new int[num.length()];
        int counter = 0;
        int counter1 = 0;
        for (int i = 0; i < num.length(); i++) {
            array2[i] = Character.getNumericValue(array1[i]);
            if (array2[i] % 2 != 0) {
                counter += 1;
            } else {
                counter1 += 1;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append("Колличество нечетных цифр " + counter + "Колличество четных чисел " + counter1);
        return str;
    }

    /**
     * 1.5.4. Ряд Фибоначчи
     * Метод task5_4 получает от Пользавателя число
     * выводит в консоль количество значений ряда Фибоначи равному введенному Пользавателем числу
     *
     * @return ряд Фибоначи (колличество значений = числу введенным Пользавателем)
     */
    public static String task5_4() {
        int a = 1;
        int b = 2;
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число символов");
        int count = scan.nextInt();
        if (count <= 0) {
            result = "Ну нет так нет";
        } else if (count == 1) {
            result += a;
        } else if (count == 2) {
            result += a + " " + b;
        } else {
            result += a + " " + b;
            for (int i = 0; i < count - 2; i++) {
                if (i % 2 == 0) {
                    a += b;
                    result += " " + a;
                } else {
                    b += a;
                    result += " " + b;
                }
            }
        }
        return result;
    }

    /**
     * 1.5.5. Вывести ряд чисел в диапазоне с шагом
     * Метод task5_5 получает от Пользователя максимум диапозона и шаг
     * проходит по заданному Пользователем диапозону с заданным шагом
     *
     * @return ряд чисел в диапазоне с шагом
     */
    public static String task5_5() {
        int min = 0;
        String result = "0";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите максимум диапозона");
        int max = scan.nextInt();
        System.out.println("Введите шаг");
        int step = scan.nextInt();
        int count = min;
        while (count < max) {
            count += step;
            result += " " + count;
        }
        return result;
    }

    /**
     * 1.5.6. Переворот числа
     * Метод task5_6 получает от Пользователя число и преобразует в массив
     *
     * @return возвращает число с обратным порядком чисел
     */
    public static String task5_6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String num = scan.nextLine();
        String result = "";
        char[] array = num.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
}
