package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String allElement(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i : array) {
            str.append(i).append(" ");
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String secondElement(int[] array) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i : array) {
            if (count % 2 == 0) {
                str.append(i).append(" ");
            }
            count++;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }

    @Override
    public String reversArray(int[] array) {
        StringBuilder str = new StringBuilder();
        int x = array.length - 1;
        for (int i : array) {
            str.append(array[x]).append(" ");
            x--;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
