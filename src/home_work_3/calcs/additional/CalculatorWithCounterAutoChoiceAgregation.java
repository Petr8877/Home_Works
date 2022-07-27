package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    CalculatorWithOperator calc1;
    CalculatorWithMathCopy calc2;
    CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calc1 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calc2 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calc3 = calc;
    }

    private long counter = 0;

    public long getCountOperation() {
        return counter;
    }

    public double adding(double x, double y) {
        counter++;
        if (calc1 != null) {
            return calc1.adding(x, y);
        } else if (calc2 != null) {
            return calc2.adding(x, y);
        } else {
            return calc3.adding(x, y);
        }
    }

    public double subtraction(double x, double y) {
        counter++;
        if (calc1 != null) {
            return calc1.subtraction(x, y);
        } else if (calc2 != null) {
            return calc2.subtraction(x, y);
        } else {
            return calc3.subtraction(x, y);
        }
    }

    public double multiplication(double x, double y) {
        counter++;
        if (calc1 != null) {
            return calc1.multiplication(x, y);
        } else if (calc2 != null) {
            return calc2.multiplication(x, y);
        } else {
            return calc3.multiplication(x, y);
        }
    }

    public double division(double x, double y) {
        counter++;
        if (calc1 != null) {
            return calc1.division(x, y);
        } else if (calc2 != null) {
            return calc2.division(x, y);
        } else {
            return calc3.division(x, y);
        }
    }

    public double exponentiation(double x, int y) {
        counter++;
        if (calc1 != null) {
            return calc1.exponentiation(x, y);
        } else if (calc2 != null) {
            return calc2.exponentiation(x, y);
        } else {
            return calc3.exponentiation(x, y);
        }
    }

    public double numberModulus(double x) {
        counter++;
        if (calc1 != null) {
            return calc1.numberModulus(x);
        } else if (calc2 != null) {
            return calc2.numberModulus(x);
        } else {
            return calc3.numberModulus(x);
        }
    }

    public double squareRoot(double x) {
        counter++;
        if (calc1 != null) {
            return calc1.squareRoot(x);
        } else if (calc2 != null) {
            return calc2.squareRoot(x);
        } else {
            return calc3.squareRoot(x);
        }
    }

}
