package home_work_1;

public class RandomArray {

    public static int[] createRandomArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
