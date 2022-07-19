package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(test1);
        SortsUtils.shake(test1);

        int[] test2 = {1, 1, 1, 1};
        SortsUtils.bubble(test2);
        SortsUtils.shake(test2);

        int[] test3 = {9, 1, 5, 99, 9, 9};
        SortsUtils.bubble(test3);
        SortsUtils.shake(test3);

        int[] test4 = {};
        SortsUtils.bubble(test4);
        SortsUtils.shake(test4);

        int[] test5 = {6, 5, 4, 3, 2, 1};
        SortsUtils.bubble(test5);
        SortsUtils.shake(test5);

        SortsUtils.bubble(ArraysUtils.arrayRandom(10, 87));
        SortsUtils.shake(ArraysUtils.arrayRandom(19, 345));

        SortsUtils.bubble(ArraysUtils.arrayFromConsole());
        SortsUtils.shake(ArraysUtils.arrayFromConsole());
    }
}
