package home_work_1;

import java.util.ArrayList;
import java.util.List;

public class Task4t1 {

    public int[] oddNumber(int[] arr) {
        List<Integer> oddNumber = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 != 0) {
                oddNumber.add(j);
            }
        }
        int[] result = new int[oddNumber.size()];
        for (int i = 0; i < oddNumber.size(); i++) {
            result[i] = oddNumber.get(i);
        }
        return result;
    }
}
