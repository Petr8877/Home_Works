package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        double b = scan.nextDouble();
        System.out.println("Для перевода байт в килобайты введите 1\nДля перевода килобайт в байты введите 2");
        byte x = scan.nextByte();
        if (x == 1){
        System.out.println(b + " байт = " + b/1024 + " килобайт");
        }
        if (x == 2){
        System.out.println(b + " килобайт = " + b*1024 + " байт");
        }
    }
}
