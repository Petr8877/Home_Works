package ClassWork.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class StudSup implements Supplier<Students> {

    private static final List<String> libraryName = new ArrayList<>(Arrays.asList("Алексей", "Сергей", "Татьяна", "Дарья", "Максим", "Петр",
            "Павел", "Илья", "Кастусь", "Павел", "Александр", "Михаил", "Виталий",
            "Максим", "Диана", "Егор"));

    private static final List<String> libraryLastName = new ArrayList<>(Arrays.asList("Апанас", "Головкин", "Дворецкая", "Дербеко", "Козючиц", "Касперович",
            "Козлов", "Корнеенко", "Костян", "Максименко", "Салянский", "Силкин", "Соколов",
            "Фальковский", "Шнаревич", "Якшук"));

    private static final List<String> libraryMiddleName = new ArrayList<>(Arrays.asList("Казимирович", "Леонидович", "Сергеевна", "Владимировна", "Андреевич", "Сергеевич",
            "Александрович", "Сергеевич", "Денисович", "Владимирович", "Николаевич", "Викторович", "Геннадьевич",
            "Александрович", "Юрьевна", "Артурович"));

    @Override
    public Students get() {
        Random random = new Random();
        return new Students(createRandomName(libraryName), createRandomName(libraryLastName), createRandomName(libraryMiddleName), random.nextInt(11));
    }

    private static String createRandomName(List<String> library) {
        return library.get((int) (libraryName.size() * Math.random()));
    }
}
