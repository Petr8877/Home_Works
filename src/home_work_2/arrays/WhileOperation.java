package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    /**
     * Класс WhileOperation используя интерфейс IArraysOperation выполняет следующие задачи:
     * wer.allElementWhile() - выводит все элементы массива в консоль (используется цикл while)
     * wer.reversArrayWhile() - выводит все элементы массива в консоль в обратном порядке (используется цикл while)
     * wer.secondElementWhile() - выводит каждый второй элемент массива в консоль (используется цикл while)
     */
    public static void main(String[] args) {
        WhileOperation wer = new WhileOperation();
        wer.reversArrayWhile();
        wer.secondElementWhile();
        wer.allElementWhile();
    }
}
