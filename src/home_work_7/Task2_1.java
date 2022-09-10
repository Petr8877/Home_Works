package home_work_7;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task2_1 {

    /**
     * Преобразует текст в HashSet<> занося в коллекцию только слова
     *
     * @return возвращает Set<String>
     */

    public static Set<String> createSetUniqueWord() {
        Set<String> uniqueWords = new HashSet<>();
        String book = "src/home_work_7/WarAndPeace.txt";
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(book)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                if ((tmp == 45 && builder.length() > 0) || (tmp >= 1040 && tmp <= 1103) || (tmp >= 48 && tmp <= 57)) {
                    builder.append(Character.toString(tmp));
                } else if (builder.length() > 0) {
                    uniqueWords.add(builder.toString());
                    builder.delete(0, builder.length());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return uniqueWords;
    }
}
