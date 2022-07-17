package HomeWork.home_work_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int c = scan.nextInt();
        int number = c;
        ArrayList<Integer> x = new ArrayList<>();
        if (c>0){
            do{
                x.add(c%2);
                c = c/2;
            }
            while(c >=2);
            x.add(c);
            if (x.size() <8){
                while(x.size()<8){
                    x.add(x.size(), 0);
                }
            }
            System.out.print("Число " + number + " в двочном коде равняется ");
            for (int i = x.size() - 1; i >= 0; i--){
                System.out.print(x.get(i));
            }
        }

        if (c<0){
            c = -1*c;
            do{
                int t = c%2;
                if (t == 1){
                    x.add(0);} else {
                    x.add(1);}
                c = c/2;
            }
            while(c >=2);
            if (c == 1){
                x.add(0);
            } else {
                x.add(1);}
            if (x.size() <8){
                while(x.size()<8){
                    x.add(x.size(), 1);
                }
            }
            for (int i = 0; i < x.size(); i++){
                if (x.get(i) == 1){
                    x.set(i, 0);
                } else{
                    x.set(i, 1);
                    break; }
            }
            System.out.print("Число " + number + " в двочном коде равняется ");
            for (int i = x.size() - 1; i >= 0; i--){
                System.out.print(x.get(i));
            }
        }
    }
}
