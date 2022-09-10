package ClassWork.Students;

import java.util.Random;
import java.util.function.Supplier;

public class StudSup implements Supplier<Students> {
    @Override
    public Students get() {
        Random random = new Random();
        return new Students(random.toString(), random.toString(), random.toString(), random.nextInt(80));
    }
}
