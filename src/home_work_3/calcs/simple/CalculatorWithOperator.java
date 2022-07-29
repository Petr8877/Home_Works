package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Класс CalculatorWithOperator представляет собой класический калькулятор и содеодержит:
 * 4 базовых математических метода (деление, умножение, вычитание, сложение)
 * 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа)
 */
public class CalculatorWithOperator implements ICalculator {


    /**
     * Метод adding складывает два числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращаем сумму переданых аргументов (тип double)
     */
    public double adding(double x, double y) {
        return x + y;
    }

    /**
     * Метод subtraction вычетает одно число из другого
     *
     * @param x первое число (уменьшаемое) (тип double)
     * @param y второе число (вычитаемое) (тип double)
     * @return возвращает разность чисел (тип double)
     */
    public double subtraction(double x, double y) {
        return x - y;
    }

    /**
     * Метод multiplication перемножает числа
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает произведение чисел (тип double)
     */
    public double multiplication(double x, double y) {
        return x * y;
    }

    /**
     * Метод division делит одно число на другое
     *
     * @param x первое число (тип double)
     * @param y второе число (тип double)
     * @return возвращает частное (тип double)
     */
    public double division(double x, double y) {
        return x / y;
    }

    /**
     * Метод exponentiation возводит число в степень
     *
     * @param x число для возведения в с тепень (тип double)
     * @param y степень для возведения (тип int)
     * @return возвращает возведенное число (тип double)
     */
    public double exponentiation(double x, int y) {
        double result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    /**
     * Метод numberModulus получает модуль числа
     *
     * @param x число (тип double)
     * @return возвращает модуль числа (тип double)
     */
    public double numberModulus(double x) {
        double result = 0;
        if (x == 0 || x > 0) {
            result = x;
        } else if (x < 0) {
            result = -1 * x;
        }
        return result;
    }

    /**
     * Метод squareRoot извлекат квадратный корень из числа
     *
     * @param x число (тип double)
     * @return возвращает извлеченный корень из числа (тип double)
     */
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

}


