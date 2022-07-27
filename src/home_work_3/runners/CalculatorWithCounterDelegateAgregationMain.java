package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(calc);

        double val1 = calculator.division(28, 5);
        double val2 = calculator.exponentiation(val1, 2);
        double val3 = calculator.multiplication(15, 7);
        double val4 = calculator.adding(4.1, val2);
        double result = calculator.adding(val3, val4);
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}

