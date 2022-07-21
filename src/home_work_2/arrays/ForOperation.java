package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForOperation implements IArraysOperation {

    /**
     * Класс ForOperation используя интерфейс IArraysOperation выполняет следующие задачи:
     * forop.allElementFor() - выводит все элементы массива в консоль (используется цикл for)
     * forop.reversArrayFor() - выводит все элементы массива в консоль в обратном порядке (используется цикл for)
     * forop.secondElementFor() - выводит каждый второй элемент массива в консоль (используется цикл for)
     */
    public static void main(String[] args) {
        ForOperation forop = new ForOperation();
        System.out.println(forop.allElementFor(ArraysUtils.arrayFromConsole()));
        System.out.println(forop.reversArrayFor(ArraysUtils.arrayFromConsole()));
        System.out.println(forop.secondElementFor(ArraysUtils.arrayFromConsole()));
    }
}
