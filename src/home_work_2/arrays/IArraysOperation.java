package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public interface IArraysOperation {

    default void allElementDoWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        do {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
            i++;
        } while (i < array.length);
    }

    default void allElementFor() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
        }
    }

    default void allElementWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
            i++;
        }
    }

    default void allElementForEach() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    default void secondElementFor() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = 1; i < array.length; ) {
            if (i == 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
            i += 2;
        }
    }

    default void secondElementForEach() {
        int[] array = ArraysUtils.arrayFromConsole();
        int count = 1;
        for (int i : array) {
            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
            count++;
        }
    }

    default void secondElementDoWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (i < array.length);
    }

    default void secondElementWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
    }

    default void reversArrayFor() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
        }
    }

    default void reversArrayForEach() {
        int[] array = ArraysUtils.arrayFromConsole();
        int[] array1 = new int[array.length];
        int x = array.length - 1;
        for (int i : array) {
            array1[x] = i;
            x--;
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
    }

    default void reversArrayDoWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
    }

    default void reversArrayWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
