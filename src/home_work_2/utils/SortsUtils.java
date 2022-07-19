package home_work_2.utils;

public class SortsUtils {
    public static void main(String[] args) {

    }

    /**
     * пузырьковая сортировка
     * Метод bubble получает входящий аргумент массив для сортировки
     * попарно сравнивает все элементы до тех пор пока все элементы не займут свои места
     * @param arr отсортированный массив
     */
    public static void bubble(int[] arr) {
        System.out.println("Массив до сортировки");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }
        System.out.println("Массив после сортировки");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * шейкерная сортировка
     * Метод shake олучает входящий аргумент массив для сортировки
     * попарно сравнивает все элементы, после прохода в одну сторону начинает попарное сравнение в обратную
     * @param arr отсортированный массив
     */
    public static void shake(int[] arr) {
        System.out.println("Массив до сортировки");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int leftSide = 0;
        int rightSide = arr.length - 1;
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = leftSide; i < rightSide; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    count = 1;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] < arr[i - 1]) {
                    int x = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = x;
                    count = 1;
                }
            }
            leftSide++;
        }
        System.out.println();
        System.out.println("Массив после сортировки");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
}
