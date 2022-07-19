package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    /**
     * Класс ForOperation используя интерфейс IArraysOperation выполняет следующие задачи:
     * forop.allElementFor() - выводит все элементы массива в консоль (используется цикл for)
     * forop.reversArrayFor() - выводит все элементы массива в консоль в обратном порядке (используется цикл for)
     * forop.secondElementFor() - выводит каждый второй элемент массива в консоль (используется цикл for)
     */
    public static void main(String[] args) {
        ForOperation forop = new ForOperation();
        forop.allElementFor();
        forop.reversArrayFor();
        forop.secondElementFor();
    }
}
