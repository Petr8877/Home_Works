package home_work_2.arrays;

/**
 * Интерфейс IArraysOperation классы для следующих действий:
 * Вывод всех элементов массива в консоль
 * Вывод всех элементов массива в консоль в обратном порядке
 * Вывод каждого второй элемента массива в консоль
 */
public interface IArraysOperation {

    /**
     * Метод allElementFor возврощает все элементы массива типом StringBuilder
     */
    String allElement(int[] array);


    /**
     * Метод secondElement возвращает каждый второй элемент массива типом String
     */
    String secondElement(int[] array);

    /**
     * Метод reversArrayFor возвращает все элементы массива в обратном порядке типом StringBuilder
     */
    String reversArray(int[] array);
}
