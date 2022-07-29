package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double division = calc.division(28, 5);
        double ex = calc.exponentiation(division, 2);
        double mult = calc.multiplication(15, 7);
        double adding = calc.adding(4.1, ex);
        double result = calc.adding(mult, adding);
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}

