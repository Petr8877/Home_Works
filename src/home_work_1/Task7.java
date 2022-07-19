package home_work_1;

public class Task7 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++){
            x[i] = (int) (Math.random() * 10);
        }
        System.out.println(createPhoneNumber(x));
    }

    static String createPhoneNumber(int[] numb){
        String phoneNumber = "(";
        int i = 0;
        while (phoneNumber.length() < 14){
            if (phoneNumber.length() < 4) {
                phoneNumber = phoneNumber + numb[i];
                i++;
            }
            if (phoneNumber.length() == 4){
                phoneNumber = phoneNumber + ") ";
            }
            if (phoneNumber.length() < 9 && phoneNumber.length() >= 5){
                phoneNumber = phoneNumber + numb[i];
                i++;
            }
            if (phoneNumber.length() == 9){
                phoneNumber = phoneNumber +"-";
            }
            if (phoneNumber.length() < 14 && phoneNumber.length() >= 10){
                phoneNumber = phoneNumber + numb[i];
                i++;
            }
        }
        return phoneNumber;
    }
}
