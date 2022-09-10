package ClassWork.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class {
    public List<Students> classWork() {
        List<Students> studentsList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String userFile = scan.nextLine();
        File file = new File(userFile);
        if (file.exists() && file.isDirectory()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
                while (ois.readBoolean()) {
                    studentsList.add((Students) ois.readObject());
                }
                return studentsList;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден1");
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            StudSup sup = new StudSup();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"))) {
                studentsList = Stream.generate(sup).limit(10000).collect(Collectors.toList());
                oos.writeObject(studentsList);
//                for (Students students : studentsList) {
//                    oos.writeUTF(students.getFirstName());
//                    oos.writeUTF(students.getLastName());
//                    oos.writeUTF(students.getMiddleName());
//                    oos.write(students.getMark());
//                }
                return studentsList;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден2");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return studentsList;
    }

    public void topStudents(List<Students> studentsList, int n) {
        StudentsComparator cmp = new StudentsComparator();
        studentsList.sort(cmp);
        List<Students> topN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            topN.add(studentsList.get(i));
            System.out.println(studentsList.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес для сохранения файла");
        String wayToSave = scanner.nextLine();
        File newFile = new File(wayToSave, "newFile");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile))) {
            oos.writeObject(topN);
        } catch (FileNotFoundException e) {
            System.out.println("Файл где?");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
