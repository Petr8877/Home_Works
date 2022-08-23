package home_work_5.Comparators;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class PasswordComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
