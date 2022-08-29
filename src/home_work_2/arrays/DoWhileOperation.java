package home_work_2.arrays;


public class DoWhileOperation implements IArraysOperation {
    @Override
    public String allElement(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            str.append(array[i]).append(" ");
            i++;
        } while (i < array.length);
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String secondElement(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                str.append(array[i]).append(" ");
            }
            i++;
        } while (i < array.length);
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String reversArray(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = array.length - 1;
        do {
            str.append(array[i]).append(" ");
            i--;
        } while (i >= 0);
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
