package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        ICalculator calc = new CalculatorWithMathCopy();
        CalculatorWithMemory calculator = new CalculatorWithMemory(calc);

        double division = calculator.division(28, 5);
        double ex = calculator.exponentiation(division, 2);
        double mult = calculator.multiplication(15, 7);
        double adding = calculator.adding(4.1, ex);
        calculator.addMemory();
        double result = calculator.adding(mult, adding);
        System.out.println(result);
        System.out.println(calculator.getMemory());
        System.out.println(calculator.getCountOperation());
    }
}
