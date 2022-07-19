package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        System.out.println("Введите год в формате ХХХХ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0){
            System.out.println("Этот год високосный");
        }
        else {
            System.out.println("Этот год не високосный");
        }
    }
}
