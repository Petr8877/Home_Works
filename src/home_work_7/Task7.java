package home_work_7;

import home_work_7.Util.Util;

import java.io.File;
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
        File[] lst = Util.createListNameFiles(way);
        showListFile(lst);
        File result = new File("result.txt");
        if (result.exists()) {
            boolean resultDelete = result.delete();
            if (!resultDelete) {
                System.out.println("Что-то пошло не так, файл не удален!");
                return;
            }
        }
        String file = chooseFile();
        String nameFile = way + file;
        while (true) {
            System.out.println("Для возврата к выбору фалов введите \"назад\"");
            System.out.println("Для завершения программы введите \"стоп\"");
            System.out.println("Для поиска введите слово");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("назад")) {
                showListFile(lst);
                file = chooseFile();
                nameFile = way + file;
            } else if (word.equalsIgnoreCase("стоп")) {
                break;
            } else {
                Util.searchAndWrite(result, file, word, nameFile);
            }
        }
    }

    /**
     * Выводит в консоль наименование файлов содержащихся в директории
     *
     * @param list переданный список фалов
     */
    private static void showListFile(File[] list) {
        for (File file : list) {
            System.out.println(file.getName());
        }
    }

    /**
     * Получает у Пользователя имя файла
     *
     * @return возвращает имя файла
     */
    private static String chooseFile() {
        System.out.println("Введите наименование файла из списка");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
