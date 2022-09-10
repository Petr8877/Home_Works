package ClassWork.Students;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        int result = Integer.compare(o1.getMark(), o2.getMark());
        if (result == 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return result;
    }
}
