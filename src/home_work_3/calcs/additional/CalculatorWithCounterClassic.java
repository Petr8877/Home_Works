package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long couner = 0;

    public void incrementCountOperation() {
        couner++;
    }

    public long getCountOperation() {
        return couner;
    }


}
