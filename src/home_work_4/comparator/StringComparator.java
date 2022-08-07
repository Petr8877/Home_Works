package home_work_4.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    /**
     * Переопределение метода compare
     *
     * @param o1 првый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return если о1 больше о2 возвращает 1, если о1 меньше о2 возврвщает -1, если о1 и о2 равны возвращает 0
     */
    @Override
    public int compare(String o1, String o2) {
        char[] array1 = o1.toCharArray();
        char[] array2 = o2.toCharArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > array2[i]) {
                return 1;
            } else if (array1[i] < array2[i]) {
                return -1;
            }
        }
        return 0;
    }
}
