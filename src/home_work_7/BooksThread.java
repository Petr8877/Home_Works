package home_work_7;

import home_work_7.Util.Util;
import home_work_7.search.EasySearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BooksThread implements Runnable {
    private final File result;
    private final File nameFile;
    private final String word;

    public BooksThread(File result, File nameFile, String word) {
        this.result = result;
        this.nameFile = nameFile;
        this.word = word;
    }

    @Override
    public void run() {
        EasySearch easySearch = new EasySearch();
        try (FileWriter writer = new FileWriter(result, true)) {
            long count = easySearch.search(Util.convertToString(nameFile.toString()), word);
            writer.write(nameFile.getName() + " - " + word + " - " + count + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
