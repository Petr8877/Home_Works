package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

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

    /**
     * Метод incrementCountOperation подсчитывает использование методов класса
     */
    private void incrementCountOperation() {
        counter++;
    }

    /**
     * Метод getCountOperation возвращает значение счетчика использования методов
     *
     */
    public long getCountOperation() {
        return counter;
    }

    /**
     * Метод adding складывает два числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращаем сумму переданых аргументов (тип double)
     */
    public double adding(double x, double y) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.adding(x, y);
        } else if (calc2 != null) {
            return calc2.adding(x, y);
        } else {
            return calc3.adding(x, y);
        }
    }

    /**
     * Метод subtraction вычетает одно число из другого
     *
     * @param x первое число (уменьшаемое) (тип double)
     * @param y второе число (вычитаемое) (тип double)
     * @return возвращает разность чисел (тип double)
     */
    public double subtraction(double x, double y) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.subtraction(x, y);
        } else if (calc2 != null) {
            return calc2.subtraction(x, y);
        } else {
            return calc3.subtraction(x, y);
        }
    }

    /**
     * Метод multiplication перемножает числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает произведение чисел (тип double)
     */
    public double multiplication(double x, double y) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.multiplication(x, y);
        } else if (calc2 != null) {
            return calc2.multiplication(x, y);
        } else {
            return calc3.multiplication(x, y);
        }
    }

    /**
     * Метод division делит одно число на другое
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает частное (тип double)
     */
    public double division(double x, double y) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.division(x, y);
        } else if (calc2 != null) {
            return calc2.division(x, y);
        } else {
            return calc3.division(x, y);
        }
    }

    /**
     * Метод exponentiation возводит число в степень
     *
     * @param x число для возведения в с тепень (тип double)
     * @param y степень для возведения (тип int)
     * @return возвращает возведенное число (тип double)
     */
    public double exponentiation(double x, int y) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.exponentiation(x, y);
        } else if (calc2 != null) {
            return calc2.exponentiation(x, y);
        } else {
            return calc3.exponentiation(x, y);
        }
    }

    /**
     * Метод numberModulus получает модуль числа
     *
     * @param x число (тип double)
     * @return возвращает модуль числа (тип double)
     */
    public double numberModulus(double x) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.numberModulus(x);
        } else if (calc2 != null) {
            return calc2.numberModulus(x);
        } else {
            return calc3.numberModulus(x);
        }
    }

    /**
     * Метод squareRoot извлекат квадратный корень из числа
     *
     * @param x число (тип double)
     * @return возвращает извлеченный корень из числа (тип double)
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.squareRoot(x);
        } else if (calc2 != null) {
            return calc2.squareRoot(x);
        } else {
            return calc3.squareRoot(x);
        }
    }

}
