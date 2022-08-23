package home_work_5.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Util {

    /**
     * createRandom генерирует случайную строку
     *
     * @param library аргумент типа String (содержит набор символов)
     * @return возвращает случайную строку из переданного набора символов
     */
    protected static String createRandom(String library) {
        Random random = new Random();
        int length = 1 + random.nextInt(10);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int numberLetters = (int) (library.length() * Math.random());
            builder.append(library.charAt(numberLetters));
        }
        return builder.toString();
    }

    /**
     * createRandomReal генерирует случайную строку
     *
     * @param library аргумент типа List<String> (содержит коллекцию строк)
     * @return возвращает случайную строку из переданной коллекции
     */
    protected static String createRandomReal(List<String> library) {
        return library.get((int) (library.size() * Math.random()));
    }

    /**
     * createRandomFromFile генерирует случайную строку
     *
     * @param nameFile аргумент типа String (содержит название и расширение файла)
     * @return возвращает случайную строку из файла
     */
    protected static String createRandomFromFile(String nameFile) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(nameFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scan = new Scanner(fileReader);
        List<String> tmp = new ArrayList<>();
        while (scan.hasNextLine()) {
            tmp.add(scan.nextLine());
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tmp.get((int) (tmp.size() * Math.random()));
    }
}
