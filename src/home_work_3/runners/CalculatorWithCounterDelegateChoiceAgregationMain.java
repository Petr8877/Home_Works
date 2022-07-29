package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calc1);

        double division1 = calculator1.division(28, 5);
        double ex1 = calculator1.exponentiation(division1, 2);
        double mult1 = calculator1.multiplication(15, 7);
        double adding1 = calculator1.adding(4.1, ex1);
        double result_1 = calculator1.adding(mult1, adding1);
        System.out.println(result_1);
        System.out.println(calculator1.getCountOperation());

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

        double division2 = calculator2.division(28, 5);
        double ex2 = calculator2.exponentiation(division2, 2);
        double mult2 = calculator2.multiplication(15, 7);
        double adding2 = calculator2.adding(4.1, ex2);
        double result_2 = calculator2.adding(mult2, adding2);
        System.out.println(result_2);
        System.out.println(calculator2.getCountOperation());


        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calc3);

        double division3 = calculator3.division(28, 5);
        double ex3 = calculator3.exponentiation(division3, 2);
        double mult3 = calculator3.multiplication(15, 7);
        double adding3 = calculator3.adding(4.1, ex3);
        double result_3 = calculator3.adding(mult3, adding3);
        System.out.println(result_3);
        System.out.println(calculator3.getCountOperation());
    }
}
