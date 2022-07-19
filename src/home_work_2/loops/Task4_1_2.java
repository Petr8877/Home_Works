package home_work_2.loops;

public class Task4_1_2 {
    public static void main(String[] args) {
        long a = 1;
        System.out.println("Результат после переполнения " + factorial(a));
    }

    public static long factorial(long number) {
        long result = number;
        long pre = 0;
        for (int i = 188; ; ) {
            result = result * i;
            if (result < 0) {
                System.out.println("Произошло переполнение");
                System.out.println("Результат до переполнения " + pre);
                break;
            }
            pre = result;
        }
        return result;
    }
}
