package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    private long counter = 0;

    public long getCountOperation() {
        return counter;
    }

    public double adding(double x, double y) {
        counter++;
        return calculator.adding(x, y);
    }

    public double subtraction(double x, double y) {
        counter++;
        return calculator.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        counter++;
        return calculator.multiplication(x, y);
    }

    public double division(double x, double y) {
        counter++;
        return calculator.division(x, y);
    }

    public double exponentiation(double x, int y) {
        counter++;
        return calculator.exponentiation(x, y);
    }

    public double numberModulus(double x) {
        counter++;
        return calculator.numberModulus(x);
    }

    public double squareRoot(double x) {
        counter++;
        return calculator.squareRoot(x);
    }

}
