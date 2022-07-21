package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        System.out.println("Вывести все элементы в консоль");
        System.out.println("Используем циикл do-while");
        System.out.println(allElementDoWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл while");
        System.out.println(allElementWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for");
        System.out.println(allElementFor(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for each");
        System.out.println(allElementForEach(ArraysUtils.arrayFromConsole()));
        System.out.println();

        System.out.println("Вывести каждый второй элемент массива в консоль");
        System.out.println("Используем циикл do-while");
        System.out.println(secondElementDoWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл while");
        System.out.println(secondElementWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for each");
        System.out.println(secondElementForEach(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for");
        System.out.println(secondElementFor(ArraysUtils.arrayFromConsole()));
        System.out.println();

        System.out.println("Вывести все элементы массива в консоль в обратном порядке");
        System.out.println("Используем циикл do-while");
        System.out.println(reversArrayDoWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for");
        System.out.println(reversArrayFor(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл while");
        System.out.println(reversArrayWhile(ArraysUtils.arrayFromConsole()));
        System.out.println("Используем циикл for each");
        System.out.println(reversArrayForEach(ArraysUtils.arrayFromConsole()));

    }

    /**
     * Метод allElementFor возврощает все элементы массива типом StringBuilder
     * используется цикл for
     */
    public static StringBuilder allElementFor(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(array[i] + " ");
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод allElementDoWhile возврощает все элементы массива типом StringBuilder
     * используется цикл do-while
     */
    public static StringBuilder allElementDoWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            str.append(array[i] + " ");
            i++;
        } while (i < array.length);
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод allElementWhile возврощает все элементы массива типом StringBuilder
     * используется цикл while
     */
    public static StringBuilder allElementWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            str.append(array[i] + " ");
            i++;
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод allElementForEach возврощает все элементы массива типом StringBuilder
     * используется цикл for each
     */
    public static StringBuilder allElementForEach(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i : array) {
            str.append(i + " ");
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод secondElementFor возвращает каждый второй элемент массива типом StringBuilder
     * используется цикл for
     */
    public static StringBuilder secondElementFor(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < array.length; ) {
            str.append(array[i] + " ");
            i += 2;
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод secondElementForEach возвращает каждый второй элемент массива типом StringBuilder
     * используется цикл for each
     */
    public static StringBuilder secondElementForEach(int[] array) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i : array) {
            if (count % 2 == 0) {
                str.append(i + " ");
            }
            count++;
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод secondElementDoWhile возвращает каждый второй элемент массива типом StringBuilder
     * используется цикл do-while
     */
    public static StringBuilder secondElementDoWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                str.append(array[i] + " ");
            }
            i++;
        } while (i < array.length);
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод secondElementWhile возвращает каждый второй элемент массива типом StringBuilder
     * используется цикл while
     */
    public static StringBuilder secondElementWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                str.append(array[i] + " ");
            }
            i++;
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод reversArrayFor возвращает все элементы массива в обратном порядке типом StringBuilder
     * используется цикл for
     */
    public static StringBuilder reversArrayFor(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            str.append(array[i] + " ");
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод reversArrayForEach возвращает все элементы массива в обратном порядке типом StringBuilder
     * используется цикл for each
     */
    public static StringBuilder reversArrayForEach(int[] array) {
        StringBuilder str = new StringBuilder();
        int x = array.length - 1;
        for (int i : array) {
            str.append(array[x] + " ");
            x--;
        }
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод reversArrayDoWhile возвращает все элементы массива в обратном порядке типом StringBuilder
     * используется цикл do-while
     */
    public static StringBuilder reversArrayDoWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = array.length - 1;
        do {
            str.append(array[i] + " ");
            i--;
        } while (i >= 0);
        str.setLength(str.length() - 1);
        return str;
    }

    /**
     * Метод reversArrayWhile возвращает все элементы массива в обратном порядке типом StringBuilder
     * используется цикл while
     */
    public static StringBuilder reversArrayWhile(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = array.length - 1;
        while (i >= 0) {
            str.append(array[i] + " ");
            i--;
        }
        str.setLength(str.length() - 1);
        return str;
    }
}