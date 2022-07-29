package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private final ICalculator calculator;

    private long counter;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод incrementCountOperation подсчитывает использование методов класса
     */
    public void incrementCountOperation() {
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
     * Метод getCalculator возвращает экземпляр класса (тип ICalculator)
     *
     */
    public ICalculator getCalculator() {
        return calculator;
    }

    /**
     * Метод adding складывает два числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращаем сумму переданых аргументов (тип double)
     */
    @Override
    public double adding(double x, double y) {
        incrementCountOperation();
        return calculator.adding(x, y);
    }

    /**
     * Метод subtraction вычетает одно число из другого
     *
     * @param x первое число (уменьшаемое) (тип double)
     * @param y второе число (вычитаемое) (тип double)
     * @return возвращает разность чисел (тип double)
     */
    @Override
    public double subtraction(double x, double y) {
        incrementCountOperation();
        return calculator.subtraction(x, y);
    }

    /**
     * Метод multiplication перемножает числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает произведение чисел (тип double)
     */
    @Override
    public double multiplication(double x, double y) {
        incrementCountOperation();
        return calculator.multiplication(x, y);
    }

    /**
     * Метод division делит одно число на другое
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает частное (тип double)
     */
    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return calculator.division(x, y);
    }

    /**
     * Метод exponentiation возводит число в степень
     *
     * @param x число для возведения в с тепень (тип double)
     * @param y степень для возведения (тип int)
     * @return возвращает возведенное число (тип double)
     */
    @Override
    public double exponentiation(double x, int y) {
        incrementCountOperation();
        return calculator.exponentiation(x, y);
    }

    /**
     * Метод numberModulus получает модуль числа
     *
     * @param x число (тип double)
     * @return возвращает модуль числа (тип double)
     */
    @Override
    public double numberModulus(double x) {
        incrementCountOperation();
        return calculator.numberModulus(x);
    }

    /**
     * Метод squareRoot извлекат квадратный корень из числа
     *
     * @param x число (тип double)
     * @return возвращает извлеченный корень из числа (тип double)
     */
    @Override
    public double squareRoot(double x) {
        incrementCountOperation();
        return calculator.squareRoot(x);
    }
}
