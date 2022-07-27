package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long counter = 0;

    public long getCountOperation() {
        return counter;
    }

    @Override
    public double adding(double x, double y) {
        counter++;
        return super.adding(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        counter++;
        return super.subtraction(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        counter++;
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        counter++;
        return super.division(x, y);
    }

    @Override
    public double exponentiation(double x, int y) {
        counter++;
        return super.exponentiation(x, y);
    }

    @Override
    public double numberModulus(double x) {
        counter++;
        return super.numberModulus(x);
    }

    @Override
    public double squareRoot(double x) {
        counter++;
        return super.squareRoot(x);
    }

}
