package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для получения факториала введите число");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.print("1");
            long result = factorial(number);
            System.out.println(" = " + result);
        } else {
            System.out.println("Введите положительное число");
        }
    }

    public static long factorial(int number) {
        long result = 1;
        if (number == 1 || number == 0) {
            return result;
        }
        result = number * factorial(number - 1);
        System.out.print(" * " + number);
        if (result < 0) {
            System.out.println("Произошло переполнение");
            System.exit(1);
        }
        return result;
    }
}
