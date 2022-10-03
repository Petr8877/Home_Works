package home_work_7.Util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class UtilTest {

    @Test
    public void convertToString() {
        Assertions.assertEquals("конь\nмед\nтелевизор\nкнига\nдверь\nдом\nон\nменю\nокно\nдождь", Util.convertToString("src/home_work_7/testFile/File1"));
    }

    @Test
    public void onlyWords() {
        Assertions.assertEquals("конь курица и енот Пошли 3 животных око", Util.onlyWords(Util.convertToString("src/home_work_7/testFile/File4")));
    }

    @Test
    public void searchAndWrite() {
        File utilFie = new File("UtilTestFile");
        if (utilFie.exists()) {
            Assertions.assertTrue(utilFie.delete());
        }
        Util.searchAndWrite(utilFie, "File2", "крыло", "src/home_work_7/testFile/File2");
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(utilFie)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                builder.append(Character.toChars(tmp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("File2 - крыло - 1\n", builder.toString());
    }
}