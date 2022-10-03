package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class BooksThreadTest {

    @Test
    public void run1() {
        File testResult = new File("TestResult");
        if (testResult.exists()) {
            Assertions.assertTrue(testResult.delete());
        }
        File ddd = new File("src/home_work_7/testFile/File3");
        BooksThread booksThread = new BooksThread(testResult, ddd, "конь");
        booksThread.run();
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(testResult)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                builder.append(Character.toChars(tmp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("File3 - конь - 2\n", builder.toString());
    }

    @Test
    public void run2() {
        File testResult = new File("TestResult");
        if (testResult.exists()) {
            Assertions.assertTrue(testResult.delete());
        }
        File ddd = new File("src/home_work_7/testFile/File2");
        BooksThread booksThread = new BooksThread(testResult, ddd, "книга");
        booksThread.run();
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(testResult)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                builder.append(Character.toChars(tmp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("File2 - книга - 1\n", builder.toString());
    }

    @Test
    public void run3() {
        File testResult = new File("TestResult");
        if (testResult.exists()) {
            Assertions.assertTrue(testResult.delete());
        }
        File ddd = new File("src/home_work_7/testFile/File1");
        BooksThread booksThread = new BooksThread(testResult, ddd, "телевизор");
        booksThread.run();
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(testResult)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                builder.append(Character.toChars(tmp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("File1 - телевизор - 1\n", builder.toString());
    }
}