package home_work_7.Util;

import home_work_7.search.EasySearch;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

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
                if (!(builder.toString().lastIndexOf(' ') == builder.length() - 1)) {
                    builder.append(" ");
                }
            }
            char[] tmp = s.toCharArray();
            for (char c : tmp) {
                if (c == 45 || (c >= 1040 && c <= 1103) || (c >= 48 && c <= 57)) {
                    builder.append(Character.toChars(c));
                }
            }
        }
        return builder.toString();
    }

    /**
     * Создает массив файлом (тип File)
     *
     * @param way переданный путь в директорию (тип String)
     * @return возвращает массив файлов (тип File[])
     */
    public static File[] createListNameFiles(String way) {
        File dir = new File(way);
        return dir.listFiles();
    }

    /**
     * производит поиск и записывает результат в файл
     * @param result файл для записи результата
     * @param file наименование файла для поиска
     * @param word слово для поиска
     * @param nameFile адрес файла для поиска
     */
    public static void searchAndWrite(File result, String file, String word, String nameFile) {
        EasySearch easySearch = new EasySearch();
        try {
            try (FileWriter writer = new FileWriter(result, true)) {
                long count = easySearch.search(Util.convertToString(nameFile), word);
                writer.write(file + " - " + word + " - " + count + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
