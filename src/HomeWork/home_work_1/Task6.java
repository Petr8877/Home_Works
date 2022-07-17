package HomeWork.home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
    way3();
    }

    static void way1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();
        if (Objects.equals(name, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name,"Анастасия")){
            System.out.println("Добрый день а Вы кто?");
        }
    }

    static void way2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();
        if (Objects.equals(name, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if (Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        else{
            System.out.println("Добрый день а Вы кто?");
        }
    }


    static void way3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();
        switch (name){
            case ("Вася"):
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день а Вы кто?");
        }
    }
}
