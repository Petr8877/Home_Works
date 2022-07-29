package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    private double lastOperationResult;

    private double memory;

    private long counter = 0;

    /**
     * Метод incrementCountOperation подсчитывает использование методов класса
     */
    private void incrementCountOperation() {
        counter++;
    }

    /**
     * Метод addLastOperationResult сохраняет результат последнего выполненного метода
     *
     * @param result возвращает результат последнего вычисления
     */
    private void addLastOperationResult(double result) {
        lastOperationResult = result;
    }

    /**
     * Метод addMemory при вызове записывает результат последней операции в поле memory
     */
    public void addMemory() {
        memory = lastOperationResult;
    }

    /**
     * Метод getMemory возвращает поле результат последней операции и очищает поле memory
     *
     */
    public double getMemory() {
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    /**
     * Метод getCountOperation возвращает значение счетчика использования методов
     *
     */
    public long getCountOperation() {
        return counter;
    }

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
    public double adding(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.adding(x, y));
        return calculator.adding(x, y);
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
        addLastOperationResult(calculator.subtraction(x, y));
        return calculator.subtraction(x, y);
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
        addLastOperationResult(calculator.multiplication(x, y));
        return calculator.multiplication(x, y);
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
        addLastOperationResult(calculator.division(x, y));
        return calculator.division(x, y);
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
        addLastOperationResult(calculator.exponentiation(x, y));
        return calculator.exponentiation(x, y);
    }

    /**
     * Метод numberModulus получает модуль числа
     *
     * @param x число (тип double)
     * @return возвращает модуль числа (тип double)
     */
    public double numberModulus(double x) {
        incrementCountOperation();
        addLastOperationResult(calculator.numberModulus(x));
        return calculator.numberModulus(x);
    }

    /**
     * Метод squareRoot извлекат квадратный корень из числа
     *
     * @param x число (тип double)
     * @return возвращает извлеченный корень из числа (тип double)
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        addLastOperationResult(calculator.squareRoot(x));
        return calculator.squareRoot(x);
    }

}
