package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {

    /**
     * Метод main при помощи импортированного класса SortsUtils производит сортировку разных массивов
     * разными методами (пузырьковым и шейкерным) после вывводит в консоль значения массивов до сортировки и после
     * импортированный класс ArraysUtils создает массивы двумя способами:
     * случайно заполненный и при помощи Пользователя
     */
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(test1);
        int[] test1_1 = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(test1_1);

        int[] test2 = {1, 1, 1, 1};
        SortsUtils.bubble(test2);
        int[] test2_1 = {1, 1, 1, 1};
        SortsUtils.shake(test2_1);

        int[] test3 = {9, 1, 5, 99, 9, 9};
        SortsUtils.bubble(test3);
        int[] test3_1 = {9, 1, 5, 99, 9, 9};
        SortsUtils.shake(test3_1);

        int[] test4 = {};
        SortsUtils.bubble(test4);
        int[] test4_1 = {};
        SortsUtils.shake(test4_1);

        int[] test5 = {6, 5, 4, 3, 2, 1};
        SortsUtils.bubble(test5);
        int[] test5_1 = {6, 5, 4, 3, 2, 1};
        SortsUtils.shake(test5_1);

        SortsUtils.bubble(ArraysUtils.arrayRandom(10, 87));
        SortsUtils.shake(ArraysUtils.arrayRandom(19, 345));

        SortsUtils.bubble(ArraysUtils.arrayFromConsole());
        SortsUtils.shake(ArraysUtils.arrayFromConsole());
    }
}
