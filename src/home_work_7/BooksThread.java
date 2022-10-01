package home_work_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BooksThread implements Runnable {
    private final File result;
    private final String nameFile;
    private final String word;

    public BooksThread(File result, String nameFile, String word) {
        this.result = result;
        this.nameFile = nameFile;
        this.word = word;
    }

    @Override
    public void run() {
        EasySearch easySearch = new EasySearch();
        try (FileWriter writer = new FileWriter(result, true)) {
            long count = easySearch.search(Util.convertToString(nameFile), word);
            writer.write(nameFile.substring(26) + " - " + word + " - " + count + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
