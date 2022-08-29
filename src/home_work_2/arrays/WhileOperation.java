package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public String allElement(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            str.append(array[i]).append(" ");
            i++;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String secondElement(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                str.append(array[i]).append(" ");
            }
            i++;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String reversArray(int[] array) {
        StringBuilder str = new StringBuilder();
        int i = array.length - 1;
        while (i >= 0) {
            str.append(array[i]).append(" ");
            i--;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
