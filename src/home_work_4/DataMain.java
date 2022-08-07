package home_work_4;

import home_work_4.comparator.IntegerComparator;

import java.util.Arrays;
import java.util.Iterator;

public class DataMain {
    public static void main(String[] args) {
        Integer[] data = new Integer[15];
        DataContainer<Integer> container = new DataContainer<>(data);
        IntegerComparator comparator = new IntegerComparator();

        System.out.println(container.add(13));
        container.add(9);
        container.add(67);
        System.out.println(container.add(2));
        container.add(2);
        container.add(1);
        container.add(2);
        container.add(1);

        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.toString(data));

        System.out.println(container.delete(2));

        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.get(3));
        System.out.println(container.delete(container.get(3)));
        System.out.println(container.get(3));

        container.sort(comparator);
        System.out.println(Arrays.toString((container.getItems())));

        DataContainer.sort(container);
        System.out.println(Arrays.toString((container.getItems())));

        DataContainer.sort(container, comparator);
        System.out.println(Arrays.toString((container.getItems())));

        Iterator<Integer> iterator = container.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(data[i]);
            i++;
            iterator.next();
        }
    }


}
