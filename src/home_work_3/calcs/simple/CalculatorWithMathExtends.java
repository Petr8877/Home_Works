package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double exponentiation(double x, int y) {
        return Math.pow(x, y);
    }

    @Override
    public double numberModulus(double x) {
        return Math.abs(x);
    }

    @Override
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

}
