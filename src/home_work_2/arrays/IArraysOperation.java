package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

/**
 * Интерфейс IArraysOperation классы для следующих действий:
 * Вывод всех элементов массива в консоль
 * Вывод всех элементов массива в консоль в обратном порядке
 * Вывод каждого второй элемента массива в консоль
 */
public interface IArraysOperation {

    /**
     * Метод allElementDoWhile выводит все элементы массива в консоль
     * используется цикл do-while
     */
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

    /**
     * Метод allElementFor выводит все элементы массива в консоль
     * используется цикл for
     */
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

    /**
     * Метод allElementWhile выводит все элементы массива в консоль
     * используется цикл while
     */
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

    /**
     * Метод allElementForEach выводит все элементы массива в консоль
     * используется цикл for each
     */
    default void allElementForEach() {
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * Метод secondElementFor выводит каждый второй элемент массива в консоль
     * используется цикл for
     */
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

    /**
     * Метод secondElementForEach выводит каждый второй элемент массива в консоль
     * используется цикл for each
     */
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

    /**
     * Метод secondElementDoWhile выводит каждый второй элемент массива в консоль
     * используется цикл do-while
     */
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

    /**
     * Метод secondElementWhile выводит каждый второй элемент массива в консоль
     * используется цикл while
     */
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

    /**
     * Метод reversArrayFor выводит все элементы массива в консоль в обратном порядке
     * используется цикл for
     */
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

    /**
     * Метод reversArrayForEach выводит все элементы массива в консоль в обратном порядке
     * используется цикл for each
     */
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

    /**
     * Метод reversArrayDoWhile выводит все элементы массива в консоль в обратном порядке
     * используется цикл do-while
     */
    default void reversArrayDoWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
    }

    /**
     * Метод reversArrayWhile выводит все элементы массива в консоль в обратном порядке
     * используется цикл while
     */
    default void reversArrayWhile() {
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
