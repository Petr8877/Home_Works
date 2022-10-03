package home_work_7.search;

import home_work_7.api.ISearchEngine;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Возвращает информацию о количестве раз которое встречается слово в тексте
     *
     * @param text Текст в котором ищем
     * @param word Слово котовое ищем
     * @return возвращает количество раз которое встречается слово (тип long)
     */

    @Override
    public long search(String text, String word) {
        String str = onlyWords(convertToString(text));
        return searchEngine.search(str, word);
    }

    /**
     * Преобразовывает полученный файл в строку, если передана строка возвращает её же
     *
     * @param text входящий аргумент наименование файла / строка
     * @return строку
     */
    public static String convertToString(String text) {
        StringBuilder builder = new StringBuilder();
        File f = new File(text);
        if (f.exists() && !f.isDirectory()) {
            try (FileReader reader = new FileReader(text)) {
                int tmp;
                while ((tmp = reader.read()) != -1) {
                    builder.append(Character.toChars(tmp));
                }
                return builder.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return text;
        }
    }

    /**
     * Удаляет из строки все символы кроме цифр, букв русского алфавита и символа "-", для разделения слов используется " "
     *
     * @param text строка для преобразования
     * @return возвращает отформатированную строку
     */

    public static String onlyWords(String text) {
        StringBuilder builder = new StringBuilder();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("-")) {
                char[] tmp = arr[i].toCharArray();
                StringBuilder cor = new StringBuilder();
                for (char c : tmp) {
                    if (c != 45 || cor.length() != 0) {
                        cor.append(c);
                    }
                }
                arr[i] = cor.toString();
            }
        }
        for (String s : arr) {
            if (builder.length() > 0) {
                builder.append(" ");
            }
            char[] tmp = s.toCharArray();
            for (char c : tmp) {
                if (c == 45 || (c >= 1040 && c <= 1103) || (c >= 48 && c <= 57)) {
                    builder.append(Character.toChars(c));
                } else {
                    builder.append(" ");
                }
            }
        }
        return builder.toString();
    }
}
