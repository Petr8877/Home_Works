package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public double numberModulus(double x) {
        double result = 0;
        if (x == 0 || x > 0) {
            result = x;
        } else if (x < 0) {
            result = -1 * x;
        }
        return result;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

}


