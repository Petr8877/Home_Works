package home_work_7;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2_2 {

    private static final List<Map.Entry<String, Integer>> resultSort = new ArrayList<>();

    /**
     * Преобразует переданный текст в Map<String, Integer> где ключ это слово,
     * а значение количество повторов этого слова в переданном тексте
     *
     * @param str текст для преобразования
     */
    private static void countReaped(String str) {
        ComparatorTask2_2 cmp = new ComparatorTask2_2();
        Map<String, Integer> uniqueWords = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(str)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                String word = "";
                if ((tmp == 45 && builder.length() > 0) || (tmp >= 1040 && tmp <= 1103) || (tmp >= 48 && tmp <= 57)) {
                    builder.append(Character.toString(tmp));
                } else {
                    word = builder.toString();
                    builder.delete(0, builder.length());
                }
                if (word.length() > 0) {
                    if (uniqueWords.containsKey(word)) {
                        int counter = uniqueWords.get(word) + 1;
                        uniqueWords.put(word, counter);
                    } else {
                        uniqueWords.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Map.Entry<String, Integer>> arr = new ArrayList<>(uniqueWords.entrySet());
        arr.sort(cmp);
        for (int i = arr.size() - 1; i >= 0; i--) {
            resultSort.add(arr.get(i));
        }
    }

    /**
     * Выводит в консоль топ N количество повторов слов
     *
     * @param n    количество слов для вывода в консоль
     * @param text текст для анализа
     */

    public static void getTopRepeatWord(int n, String text) {
        countReaped(text);
        for (int i = 0; i < n; i++) {
            System.out.println(resultSort.get(i));
        }
    }
}
