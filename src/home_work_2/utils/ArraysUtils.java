package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {


    /**
     * Метод arrayFromConsole получает от Пользователя число размер массива и значения для каждого элемента
     *
     * @return готовый заполненный масив на основе данных полученных от Пользователя
     */
    public static int[] arrayFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа для заполнения массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    /**
     * метод arrayRandom получает входящие аргументы и на оих основе создает массив с случайно заполненными значениями
     *
     * @param size              полученный аргумент отвечает за размер массива
     * @param maxValueExclusion полученный оргумент отвечает за максимальное значение диапозона для заполнения массива
     * @return готовый массив заполненный случайным образом на основе переданных аргументов
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(maxValueExclusion + 1);
        }
        return array;
    }
}
