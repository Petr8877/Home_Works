package HomeWork.home_work_2.loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа");
        if (scan.hasNextInt()){
            String x = "";
            long result = 1;
            while (scan.hasNextInt()){
                int number = scan.nextInt();
                result = multiplication(number);
                if (x.equals("")){
                    x += Long.toString(number);
                } else { x += " * " + Long.toString(number);}
            }
            System.out.println(x + " = " + result);
        } else if (scan.hasNextDouble()) {
            System.out.println("Введено не целое число");
        } else if (scan.hasNextLine()) {
            System.out.println("Введено не число");
        }
    }

    static long result = 1;
    public static long multiplication(int number){
            result *= number;
        return result;
    }
}