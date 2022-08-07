package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {

    protected T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Добавляет новый элемент в массив в первую ячейку со значением null
     * если в массиве отсутствуют свободные ячеки создает новый массив на одну ячейку больше
     * и копирует все ячейки старого
     *
     * @param item переданный аргумент для добавления в массив
     * @return возвращает индекс ячейки в которую записат перенаддый аргумент
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        int index = getIndexForAdd();
        if (data.length <= index) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        data[index] = item;
        return index;
    }

    /**
     * Находит первую ячейку содержащую null
     *
     * @return возвращает индекс ячейки содержащую null, если массив заполнен возвращает длинну массива
     */
    public int getIndexForAdd() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return data.length;
    }

    /**
     * Возвращает содержимое ячейки по индексу
     *
     * @param index переданный аргумент (индекс ячейки)
     * @return возвращает содержимое ячейки по индексу, если индекс меньше нуля, больше длинны масива или равен
     * длинне массива возвращает null
     */
    public T get(int index) {
        if (data.length <= index || index < 0) {
            return null;
        } else {
            return data[index];
        }

    }

    /**
     * Возвращает поле data
     *
     * @return возвращает поле data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Удаляет элемент из поля data по индексу
     *
     * @param index переданный аргумент (индекс ячейки)
     * @return если елемент удален возвращает true, если не удален false
     */
    public boolean delete(int index) {
        if (index < data.length && data[index] != null) {
            if (data.length - 1 - index >= 0) {
                System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Удаляет элемент из поля data
     *
     * @param item переданный аргумент (объект для удаления)
     * @return если елемент удален возвращает true, если не удален false
     */
    public boolean delete(T item) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                delete(i);
                result = true;
            }
        }
        return result;
    }

    /**
     * Сортирует данные записанных в поле data
     *
     * @param comparator преданный аргумент (Comparator)
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i], data[j]) > 0) {
                    T tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }

    /**
     * Переопределение метода toString
     *
     * @return выводить содержимое data без ячеек в которых хранится null
     */
    public String toString(Integer[] data) {
        StringBuilder str = new StringBuilder();
        for (T datum : this.data) {
            if (datum != null) {
                str.append(datum).append(" ");
            }
        }
        str.delete(str.length(), str.length());
        return str.toString();
    }

    /**
     * Сортирует данные записанных в поле data
     *
     * @param dataContainer переданный аргумент (объект с дженериком extends Comparable)
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        T[] data = dataContainer.getItems();
        for (int i = 0; i < data.length - 1; i++) {
            T outerCycleElement = data[i];
            if (outerCycleElement != null) {
                for (int j = i + 1; j < data.length; j++) {
                    T innerCycleElement = data[j];
                    if (innerCycleElement == null || outerCycleElement.compareTo(innerCycleElement) > 0) {
                        data[j] = outerCycleElement;
                        data[i] = innerCycleElement;
                    }
                }
            }
        }
    }

    /**
     * Сортирует данные записанных в поле data
     *
     * @param container  переданный аргумет для сортировки
     * @param comparator реализация интерфейса Comparator
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] data = container.getItems();
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != null) {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] == null || comparator.compare(data[i], data[j]) > 0) {
                        T tmp = data[j];
                        data[j] = data[i];
                        data[i] = tmp;
                    }
                }
            }
        }
    }

    /**
     * Переопределение метода Iterator
     *
     * @return возвращает новый итератор
     */
    @Override
    public Iterator<T> iterator() {
        return new DataIterator();
    }

    /**
     * реализация Iterator
     */
    class DataIterator implements Iterator<T> {

        private int counter;

        /**
         * Проверяет наличие следующего элемента
         *
         * @return если елемент есть возвращает true, если елемента нет false
         */
        @Override
        public boolean hasNext() {
            return counter < data.length;
        }

        /**
         * Переходит на следующий элемент
         *
         * @return возвращает следующий элемент
         */
        @Override
        public T next() {
            int tmp = counter++;
            if (tmp >= data.length) {
                return null;
            } else {
                return data[tmp];
            }
        }
    }
}

