package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(calc);

        double division = calculator.division(28, 5);
        double ex = calculator.exponentiation(division, 2);
        double mult = calculator.multiplication(15, 7);
        double adding = calculator.adding(4.1, ex);
        double result = calculator.adding(mult, adding);
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}

