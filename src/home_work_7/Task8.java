package home_work_7;

import home_work_7.Util.Util;

import java.io.File;
import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//     /Users/petr/Desktop/Books/

public class Task8 {

    /**
     * Данный метод производит поиск введенного пользователем слова по всем файлам содержащихся в заданной директории
     * При вводе "стоп" прекращает выполнение программы
     */
    public static void main(String[] args) {

        ExecutorService executors = Executors.newFixedThreadPool(8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес директории");
        String way = scanner.nextLine();
        File[] lst = Util.createListNameFiles(way);
        File result = new File("result.txt");
        if (result.exists()) {
            boolean resultDelete = result.delete();
            if (!resultDelete) {
                System.out.println("Что-то пошло не так, файл не удален!");
                return;
            }
        }
        while (true) {
            System.out.println("Для поиска введите слово");
            System.out.println("Для прекращения программы напишите \"стоп\"");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("стоп")) {
                executors.shutdown();
                break;
            } else {
                for (File file : lst) {
                    executors.submit(new BooksThread(result, file, word));
                }
            }
        }
    }
}
