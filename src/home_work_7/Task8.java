package home_work_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//     /Users/petr/Desktop/Books/

public class Task8 {

    /**
     * Данный метод производит поиск введенного пользователем слова по всем файлам содержащихся в заданной директории
     * При вводе "стоп" прекращает выполнение программы
     */
    public static void main(String[] args) {

        ExecutorService executors = Executors.newFixedThreadPool(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес директории");
        String way = scanner.nextLine();
        File dir = new File(way);
        List<File> lst = new ArrayList<>();
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isFile())
                lst.add(file);
        }
        File result = new File("result.txt");
        try {
            new FileWriter(result, false).close();
        } catch (IOException e) {
            throw new RuntimeException(e);
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
                    executors.submit(new BooksThread(result, String.valueOf(file), word));
                }

            }
        }
    }
}
