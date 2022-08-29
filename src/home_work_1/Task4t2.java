package home_work_1;

public class Task4t2 {
    public int middleNumber(int x, int y, int t) {
        int[] arr = {x, y, t};
        int min = arr[0];
        int max = arr[0];
        int middle = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int number : arr) {
            if (number != min && number != max) {
                middle = number;
            }
        }
        return middle;
    }
}
