package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;
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
        return calc.adding(x, y);
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
        return calc.subtraction(x, y);
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
        return calc.multiplication(x, y);
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
        return calc.division(x, y);
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
        return calc.exponentiation(x, y);
    }

    /**
     * Метод numberModulus получает модуль числа
     *
     * @param x число (тип double)
     * @return возвращает модуль числа (тип double)
     */
    public double numberModulus(double x) {
        incrementCountOperation();
        return calc.numberModulus(x);
    }

    /**
     * Метод squareRoot извлекат квадратный корень из числа
     *
     * @param x число (тип double)
     * @return возвращает извлеченный корень из числа (тип double)
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        return calc.squareRoot(x);
    }

}
