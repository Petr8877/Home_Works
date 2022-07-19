package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {

    }

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

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(maxValueExclusion + 1);
        }
        return array;
    }
}
