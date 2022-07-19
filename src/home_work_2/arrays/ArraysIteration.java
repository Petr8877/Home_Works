package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        System.out.println("Вывести все элементы в консоль");
        allElementDoWhile();
        allElementFor();
        allElementWhile();
        allElementForEach();
        System.out.println();

        System.out.println("Вывести каждый второй элемент массива в консоль");
        secondElementDoWhile();
        secondElementFor();
        secondElementForEach();
        secondElementWhile();
        System.out.println();

        System.out.println("Вывести все элементы массива в консоль в обратном порядке");
        reversArrayDoWhile();
        reversArrayFor();
        reversArrayWhile();
        reversArrayForEach();
    }

    /**
     * Метод allElementFor выводит все элементы массива в консоль
     * используется цикл for
     */
    public static void allElementFor() {
        System.out.println("Используем цикл for");
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
    }

    /**
     * Метод allElementDoWhile выводит все элементы массива в консоль
     * используется цикл do-while
     */
    public static void allElementDoWhile() {
        System.out.println("Используем цикл do while");
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
        System.out.println();
    }

    /**
     * Метод allElementWhile выводит все элементы массива в консоль
     * используется цикл while
     */
    public static void allElementWhile() {
        System.out.println("Используем цикл while");
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
        System.out.println();
    }

    /**
     * Метод allElementForEach выводит все элементы массива в консоль
     * используется цикл for each
     */
    public static void allElementForEach() {
        System.out.println("Используем цикл foreach");
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * Метод secondElementFor выводит каждый второй элемент массива в консоль
     * используется цикл for
     */
    public static void secondElementFor() {
        System.out.println("Используем цикл for");
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = 1; i < array.length; ) {
            if (i == 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
            i += 2;
        }
        System.out.println();
    }

    /**
     * Метод secondElementForEach выводит каждый второй элемент массива в консоль
     * используется цикл for each
     */
    public static void secondElementForEach() {
        System.out.println("Используем цикл foreach");
        int[] array = ArraysUtils.arrayFromConsole();
        int count = 1;
        for (int i : array) {
            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
            count++;
        }
        System.out.println();
    }

    /**
     * Метод secondElementDoWhile выводит каждый второй элемент массива в консоль
     * используется цикл do-while
     */
    public static void secondElementDoWhile() {
        System.out.println("Используем цикл do while");
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (i < array.length);
        System.out.println();
    }

    /**
     * Метод secondElementWhile выводит каждый второй элемент массива в консоль
     * используется цикл while
     */
    public static void secondElementWhile() {
        System.out.println("Используем цикл while");
        int[] array = ArraysUtils.arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println();
    }

    /**
     * Метод reversArrayFor выводит все элементы массива в консоль в обратном порядке
     * используется цикл for
     */
    public static void reversArrayFor() {
        System.out.println("Используем цикл for");
        int[] array = ArraysUtils.arrayFromConsole();
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
    }

    /**
     * Метод reversArrayForEach выводит все элементы массива в консоль в обратном порядке
     * используется цикл for each
     */
    public static void reversArrayForEach() {
        System.out.println("Используем цикл foreach");
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
        System.out.println();
    }

    /**
     * Метод reversArrayDoWhile выводит все элементы массива в консоль в обратном порядке
     * используется цикл do-while
     */
    public static void reversArrayDoWhile() {
        System.out.println("Используем цикл do while");
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }

    /**
     * Метод reversArrayWhile выводит все элементы массива в консоль в обратном порядке
     * используется цикл while
     */
    public static void reversArrayWhile() {
        System.out.println("Используем цикл while");
        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
    }
}