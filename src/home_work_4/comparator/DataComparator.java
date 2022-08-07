package home_work_4.comparator;

import java.util.Comparator;

public class DataComparator<T extends Comparable<T>> implements Comparator<T> {

    /**
     * Переопределение метода compare
     *
     * @param o1 првый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return если о1 больше о2 возвращает 1, если о1 меньше о2 возврвщает -1, если о1 и о2 равны возвращает 0
     */
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}

