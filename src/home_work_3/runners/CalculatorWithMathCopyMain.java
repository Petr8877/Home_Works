package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double division = calc.division(28, 5);
        double ex = calc.exponentiation(division, 2);
        double mult = calc.multiplication(15, 7);
        double adding = calc.adding(4.1, mult);
        double result = calc.adding(ex, adding);
        System.out.println(result);
    }
}
