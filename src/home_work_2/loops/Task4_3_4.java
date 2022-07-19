package home_work_2.loops;

import java.util.Scanner;

public class Task4_3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = 1;
        long result = a;
        int number = scan.nextInt();
        for (; ; ) {
            try {
                result = Math.multiplyExact(result, number);
            } catch (ArithmeticException e) {
                System.out.println("Произошло переполнение");
                System.out.println("Результат до переполнения " + result / number);
                System.out.println("Результат после переполнения " + result);
                break;
            }
        }
    }
}