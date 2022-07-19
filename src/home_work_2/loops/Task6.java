package home_work_2.loops;

public class Task6 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multy;
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i < 5; i++) {
                multy = x[i] * x[j];
                if (x[i] != 5) {
                    System.out.print(x[i] + " * " + x[j] + " = " + multy + "\t");
                } else {
                    System.out.println(x[i] + " * " + x[j] + " = " + multy);
                }
            }
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            for (int i = 5; i < 10; i++) {
                multy = x[i] * x[j];
                if (x[i] != 10) {
                    System.out.print(x[i] + " * " + x[j] + " = " + multy + "\t");
                } else {
                    System.out.println(x[i] + " * " + x[j] + " = " + multy);
                }
            }
        }
    }
}

