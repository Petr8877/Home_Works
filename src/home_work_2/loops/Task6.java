package home_work_2.loops;

public class Task6 {

    /**
     * Метод multiplicationTable возвращает таблицу умножения
     */
    public String multiplicationTable() {
        StringBuilder builder = new StringBuilder();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multy;
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i < 5; i++) {
                multy = x[i] * x[j];
                if (x[i] != 5) {
                    builder.append(x[i]).append(" * ").append(x[j]).append(" = ").append(multy).append("\t");
                } else {
                    builder.append(x[i]).append(" * ").append(x[j]).append(" = ").append(multy).append("\n");
                }
            }
        }
        builder.append("\n");
        for (int j = 0; j < 10; j++) {
            for (int i = 5; i < 10; i++) {
                multy = x[i] * x[j];
                if (x[i] != 10) {
                    builder.append(x[i]).append(" * ").append(x[j]).append(" = ").append(multy).append("\t");
                } else {
                    builder.append(x[i]).append(" * ").append(x[j]).append(" = ").append(multy).append("\n");
                }
            }
        }
        return builder.toString();
    }
}

