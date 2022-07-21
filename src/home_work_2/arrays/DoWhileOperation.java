package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class DoWhileOperation implements IArraysOperation {

    /**
     * Класс DoWhileOperation используя интерфейс IArraysOperation выполняет следующие задачи:
     * doWhile.allElementDoWhile() - выводит все элементы массива в консоль (используется цикл do-while)
     * doWhile.reversArrayDoWhile() - выводит все элементы массива в консоль в обратном порядке (используется цикл do-while)
     * doWhile.secondElementDoWhile() - выводит каждый второй элемент массива в консоль (используется цикл do-while)
     */
    public static void main(String[] args) {
        DoWhileOperation doWhile = new DoWhileOperation();
        System.out.println(doWhile.allElementDoWhile(ArraysUtils.arrayFromConsole()));
        System.out.println(doWhile.reversArrayDoWhile(ArraysUtils.arrayFromConsole()));
        System.out.println(doWhile.secondElementDoWhile(ArraysUtils.arrayFromConsole()));
    }
}
