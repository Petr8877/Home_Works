package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double result;
        double division = calc.division(28.0, 5);
        calc.incrementCountOperation();
        double ex = calc.exponentiation(division, 2);
        calc.incrementCountOperation();
        double mult = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double adding = calc.adding(4.1, mult);
        calc.incrementCountOperation();
        result = calc.adding(ex, adding);
        calc.incrementCountOperation();
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
