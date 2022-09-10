package ClassWork.Students;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private  String firstName;

    private  String lastName;

    private  String middleName;

    private  int mark;

    public Students(String firstName, String lastName, String middleName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public List<String> createFIO(){
        List<String> fio = new ArrayList<>();
        fio.add(this.firstName);
        fio.add(this.lastName);
        fio.add(middleName);
        return fio;
    }
}
