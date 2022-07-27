package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double adding(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }

    public double exponentiation(double x, int y) {
        return Math.pow(x, y);
    }

    public double numberModulus(double x) {
        return Math.abs(x);
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }
}
