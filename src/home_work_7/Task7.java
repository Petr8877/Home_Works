package home_work_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//     /Users/petr/Desktop/Books/

public class Task7 {

    /**
     * Данный метод производит поиск введенного пользователем слова по выбранному файлу из заданной директории
     * При вводе "назад" позволяет выбрать файл повторно
     * При вводе "стоп" прекращает выполнение программы
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес директории");
        String way = scanner.nextLine();
        File dir = new File(way);
        List<File> lst = new ArrayList<>();
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isFile())
                lst.add(file);
        }
        showListFile(lst);
        String nameFile = chooseFile(way);
        EasySearch easySearch = new EasySearch();
        File result = new File("result.txt");
        try {
            new FileWriter(result, false).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            System.out.println("Для возврата к выбору фалов введите \"назад\"");
            System.out.println("Для завершения программы введите \"стоп\"");
            System.out.println("Для поиска введите слово");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("назад")) {
                showListFile(lst);
                nameFile = chooseFile(way);
            } else if (word.equalsIgnoreCase("стоп")) {
                break;
            } else {
                try (FileWriter writer = new FileWriter(result, true)) {
                    long count = easySearch.search(Util.convertToString(nameFile), word);
                    writer.write(nameFile.substring(26) + " - " + word + " - " + count + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * Выводит в консоль наименование файлов содержащихся в директории
     *
     * @param list переданный список фалов
     */
    private static void showListFile(List<File> list) {
        for (File file : list) {
            String str = String.valueOf(file);
            System.out.println(str.substring(26));
        }
    }


    /**
     * Объеденяет адрес директории и наименование файла в адрес файла
     *
     * @param way переданный адрес директории
     * @return возвращает адрес файла
     */
    private static String chooseFile(String way) {
        System.out.println("Введите наименование файла из списка");
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        return way + file;
    }
}
