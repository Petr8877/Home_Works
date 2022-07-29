package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double division = calc.division(28, 5);
        double ex = calc.exponentiation(division, 2);
        double mult = calc.multiplication(15, 7);
        double adding = calc.adding(4.1, mult);
        double result = calc.adding(ex, adding);
        System.out.println(result);
    }
}
