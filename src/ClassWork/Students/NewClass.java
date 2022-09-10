package ClassWork.Students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NewClass {

    public void lastTop(String file, int n) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Students> studentsList = new ArrayList<>((Collection) ois.readObject());
            List<Students> reverse = new ArrayList<>();
            for (int i = studentsList.size() - 1; i >= 0; i--) {
                reverse.add(studentsList.get(i));
            }
            for (int i = 0; i < n; i++) {
                System.out.println(reverse.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Да сколько можно?");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
