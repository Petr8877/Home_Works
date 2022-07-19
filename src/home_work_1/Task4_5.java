package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите код символа по таблице ASCII");
        int code = scan.nextInt();
        char x = (char) code;
        if (code >= 65 && code <= 90 || code >= 97 && code <= 122){
            System.out.println("Это буква " + x);
        }
        else {
            System.out.println("Это иной символ " + x);
        }
    }
}
