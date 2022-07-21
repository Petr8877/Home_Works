package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperation implements IArraysOperation {

    /**
     * Класс ForEachOperation используя интерфейс IArraysOperation выполняет следующие задачи:
     * foreach.allElementForEach() - выводит все элементы массива в консоль (используется цикл for each)
     * foreach.reversArrayForEach() - выводит все элементы массива в консоль в обратном порядке (используется цикл for each)
     * foreach.secondElementForEach() - выводит каждый второй элемент массива в консоль (используется цикл for each)
     */
    public static void main(String[] args) {
        ForEachOperation foreach = new ForEachOperation();
        System.out.println(foreach.secondElementForEach(ArraysUtils.arrayFromConsole()));
        System.out.println(foreach.reversArrayForEach(ArraysUtils.arrayFromConsole()));
        System.out.println(foreach.allElementForEach(ArraysUtils.arrayFromConsole()));
    }
}
