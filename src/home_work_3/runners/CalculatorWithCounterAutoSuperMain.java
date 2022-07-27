package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {


    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double val1 = calc.division(28, 5);
        double val2 = calc.exponentiation(val1, 2);
        double val3 = calc.multiplication(15, 7);
        double val4 = calc.adding(4.1, val2);
        double result = calc.adding(val3, val4);
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}

