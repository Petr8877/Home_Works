package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?");
        System.out.println("Ввести да или нет");
        String weekd = scan.nextLine();
        System.out.println("Сегодня отпуск?");
        System.out.println("Ввести да или нет");
        String voc = scan.nextLine();
        boolean weekday = weekd.equals("да");
        boolean vacation = voc.equals("да");
        if (sleepIn(weekday, vacation)){
        System.out.println("Можем спать дальше");}
        else {
        System.out.println("Пора на работу");}
    }
    static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        }
        else {
            return false;
        }
    }
}
