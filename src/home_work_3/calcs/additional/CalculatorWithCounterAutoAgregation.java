package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;
    }

    private long counter = 0;

    public long getCountOperation() {
        return counter;
    }

    public double adding(double x, double y) {
        counter++;
        return calc.adding(x, y);
    }

    public double subtraction(double x, double y) {
        counter++;
        return calc.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        counter++;
        return calc.multiplication(x, y);
    }

    public double division(double x, double y) {
        counter++;
        return calc.division(x, y);
    }

    public double exponentiation(double x, int y) {
        counter++;
        return calc.exponentiation(x, y);
    }

    public double numberModulus(double x) {
        counter++;
        return calc.numberModulus(x);
    }

    public double squareRoot(double x) {
        counter++;
        return calc.squareRoot(x);
    }

}
