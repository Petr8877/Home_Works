package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

    public long getCountOperation() {
        return calc.counter;
    }

    public double adding(double x, double y) {
        return calc.adding(x, y);
    }

    public double subtraction(double x, double y) {
        return calc.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        return calc.multiplication(x, y);
    }

    public double division(double x, double y) {
        return calc.division(x, y);
    }

    public double exponentiation(double x, int y) {
        return calc.exponentiation(x, y);
    }

    public double numberModulus(double x) {
        return calc.numberModulus(x);
    }

    public double squareRoot(double x) {
        return calc.squareRoot(x);
    }

}
