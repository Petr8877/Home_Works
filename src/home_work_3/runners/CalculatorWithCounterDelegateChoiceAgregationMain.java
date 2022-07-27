package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calc1);

        double val1_1 = calculator1.division(28, 5);
        double val2_1 = calculator1.exponentiation(val1_1, 2);
        double val3_1 = calculator1.multiplication(15, 7);
        double val4_1 = calculator1.adding(4.1, val2_1);
        double result_1 = calculator1.adding(val3_1, val4_1);
        System.out.println(result_1);
        System.out.println(calculator1.getCountOperation());

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

        double val1_2 = calculator2.division(28, 5);
        double val2_2 = calculator2.exponentiation(val1_2, 2);
        double val3_2 = calculator2.multiplication(15, 7);
        double val4_2 = calculator2.adding(4.1, val2_2);
        double result_2 = calculator2.adding(val3_2, val4_2);
        System.out.println(result_2);
        System.out.println(calculator2.getCountOperation());


        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calc3);

        double val1_3 = calculator3.division(28, 5);
        double val2_3 = calculator3.exponentiation(val1_3, 2);
        double val3_3 = calculator3.multiplication(15, 7);
        double val4_3 = calculator3.adding(4.1, val2_3);
        double result_3 = calculator3.adding(val3_3, val4_3);
        System.out.println(result_3);
        System.out.println(calculator3.getCountOperation());
    }
}
