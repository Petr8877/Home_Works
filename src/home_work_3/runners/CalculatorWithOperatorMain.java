package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double value1 = calc.division(28, 5);
        double value2 = calc.exponentiation(value1, 2);
        double value3 = calc.multiplication(15, 7);
        double value4 = calc.adding(4.1, value3);
        double result = calc.adding(value2, value4);
        System.out.println(result);
    }
}
