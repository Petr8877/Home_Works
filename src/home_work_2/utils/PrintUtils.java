package home_work_2.utils;

public class PrintUtils {
    public static void main(String[] args) {

    }

    /**
     * Метод print перебирает массив поэлементно и выводит каждый элемент в консоль
     *
     */
    public static void print(int[] array) {
        //System.out.print("Массив до сортировки");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Метод printBubble выводит в консоль все значения массива до сортировки и после пузырьковой сортировки
     *
     */
    public static void printBubble(int[] array) {
        System.out.println("Массив до сортировки");
        print(array);
        System.out.println("После сортировки");
        SortsUtils.bubble(array);
        print(array);
    }

    /**
     * Метод printShake выводит в консоль все значения массива до сортировки и после шейкерной сортировки
     *
     */
    public static void printShake(int[] array) {
        System.out.println("Массив до сортировки");
        print(array);
        System.out.println("После сортировки");
        SortsUtils.shake(array);
        print(array);
    }
}
