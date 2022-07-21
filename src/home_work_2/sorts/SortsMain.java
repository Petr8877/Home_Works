package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.PrintUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {

    /**
     * Метод main при помощи импортированного класса SortsUtils производит сортировку разных массивов
     * разными методами (пузырьковым и шейкерным) после вывводит в консоль значения массивов до сортировки и после
     * импортированный класс ArraysUtils создает массивы двумя способами:
     * случайно заполненный и при помощи Пользователя
     * так же добавлены дополнительные методы для вывода в консоль значений массива (до и после сортировки)
     */
    public static void main(String[] args) {
        /*int[] test1 = {1, 2, 3, 4, 5, 6};
        PrintUtils.printBubble(test1);
        int[] test1_1 = {1, 2, 3, 4, 5, 6};
        PrintUtils.printShake(test1_1);

        int[] test2 = {1, 1, 1, 1};
        PrintUtils.printBubble(test2);
        int[] test2_1 = {1, 1, 1, 1};
        PrintUtils.printShake(test2_1);

        int[] test3 = {9, 1, 5, 99, 9, 9};
        PrintUtils.printBubble(test3);
        int[] test3_1 = {9, 1, 5, 99, 9, 9};
        PrintUtils.printShake(test3_1);

        int[] test4 = {};
        PrintUtils.printBubble(test4);
        int[] test4_1 = {};
        PrintUtils.printShake(test4_1);

        int[] test5 = {6, 5, 4, 3, 2, 1};
        PrintUtils.printBubble(test5);
        int[] test5_1 = {6, 5, 4, 3, 2, 1};
        PrintUtils.printShake(test5_1);*/

        int[] array = ArraysUtils.arrayRandom(10, 100);
        System.out.println("Массив до сортировки");
        PrintUtils.print(array);
        SortsUtils.bubble(array);
        System.out.println("Массив после сортировки");
        PrintUtils.print(array);
        System.out.println();

        int[] array1 = ArraysUtils.arrayRandom(23, 100);
        PrintUtils.printShake(array1); // создан дополнительный метод для вывода в консоль
        System.out.println();

        int[] array2 = ArraysUtils.arrayFromConsole();
        PrintUtils.printBubble(array2); // создан дополнительный метод для вывода в консоль
        System.out.println();

        int[] array3 = ArraysUtils.arrayFromConsole();
        System.out.println("Массив до сортировки ");
        PrintUtils.print(array3);
        SortsUtils.shake(array3);
        System.out.println("Массив после сортировки");
        PrintUtils.print(array3);
    }
}
