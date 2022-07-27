package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double result;
        double value1 = calc.division(28.0, 5);
        calc.incrementCountOperation();
        double value2 = calc.exponentiation(value1, 2);
        calc.incrementCountOperation();
        double value3 = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double value4 = calc.adding(4.1, value3);
        calc.incrementCountOperation();
        result = calc.adding(value2, value4);
        calc.incrementCountOperation();
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
