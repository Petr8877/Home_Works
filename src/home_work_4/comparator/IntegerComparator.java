package home_work_4.comparator;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    /**
     * Переопределение метода compare
     *
     * @param o1 првый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return если о1 больше о2 возвращает 1, если о1 меньше о2 возврвщает -1, если о1 и о2 равны возвращает 0
     */
    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 != null && o2 != null && o1 > o2) {
            return 1;
        } else if (o1 != null && o2 != null && o1 < o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
