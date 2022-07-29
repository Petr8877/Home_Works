package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long couner = 0;

    /**
     * Метод incrementCountOperation подсчитывает использование методов класса
     */
    public void incrementCountOperation() {
        couner++;
    }

    /**
     * Метод getCountOperation возвращает значение счетчика использования методов
     *
     */
    public long getCountOperation() {
        return couner;
    }


}
