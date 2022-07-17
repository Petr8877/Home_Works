package HomeWork.home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if (number1 % number2 == 0){
            System.out.println("Число делится");
            System.out.println(number1/number2);
        }
        else {
            System.out.println("Число не делится без остатка");
            System.out.println(number1/number2 + " остаток " + number1%number2);
        }
    }
}
