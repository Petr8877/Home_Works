package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public String allElement(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int j : array) {
            str.append(j).append(" ");
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String secondElement(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < array.length; ) {
            str.append(array[i]).append(" ");
            i += 2;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String reversArray(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            str.append(array[i]).append(" ");
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
