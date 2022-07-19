package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        int min = numbers[0];
        int max = numbers[0];
        int middle = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != min && numbers[i] != max){
                middle = numbers[i];
            }
        }
        System.out.println(middle + " это среднее число");
    }
}
