package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double division = calc.division(28, 5);
        double ex = calc.exponentiation(division, 2);
        double mult = calc.multiplication(15, 7);
        double adding = calc.adding(4.1, mult);
        double result = calc.adding(ex, adding);
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
