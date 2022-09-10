package ClassWork.Students;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
//        Class first = new Class();
//        List<Students> stList = first.classWork();
//        System.out.println(stList.size());
//        first.topStudents(stList, 10);

        NewClass newClass = new NewClass();
        newClass.lastTop("src/ClassWork/Students/newFile", 4);
    }
}
