package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5)^2
        double division = 28.0 / 5;
        double ex = division * division;
        double mult = 15 * 7;
        double result = 4.1 + ex + mult;
        System.out.println(result); // 140,46
    }
}
