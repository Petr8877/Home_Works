package home_work_1;

public class Task7 {

    public String createPhoneNumber(int[] numb) {
        StringBuilder phoneNumber = new StringBuilder("(");
        int i = 0;
        while (phoneNumber.length() < 14) {
            if (phoneNumber.length() < 4) {
                phoneNumber.append(numb[i]);
                i++;
            }
            if (phoneNumber.length() == 4) {
                phoneNumber.append(") ");
            }
            if (phoneNumber.length() < 9 && phoneNumber.length() >= 5) {
                phoneNumber.append(numb[i]);
                i++;
            }
            if (phoneNumber.length() == 9) {
                phoneNumber.append("-");
            }
            if (phoneNumber.length() < 14 && phoneNumber.length() >= 10) {
                phoneNumber.append(numb[i]);
                i++;
            }
        }
        return phoneNumber.toString();
    }
}
