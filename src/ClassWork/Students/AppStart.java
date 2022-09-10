package ClassWork.Students;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStart {

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        if (scanner.hasNextLine()) {
            File f = new File(str);
            if (f.exists() && !f.isDirectory()) {
                try (FileReader reader = new FileReader(str)) {
                    int tmp;
                    while ((tmp = reader.read()) != -1) {
                        builder.append(Character.toChars(tmp));
                    }
                    String x = builder.toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            File f = new File("student.bin");
            if (f.exists() && !f.isDirectory()) {
                try (FileReader reader = new FileReader("student.bin")) {
                    int tmp;
                    while ((tmp = reader.read()) != -1) {
                        builder.append(Character.toChars(tmp));
                    }
                    String x = builder.toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                f.createNewFile();
                List<Students> newStudents = Stream.generate(new StudSup()).limit(10000).collect(Collectors.toList());
                FileWriter writer = new FileWriter("student.bin");

            }
        }
    }
}

