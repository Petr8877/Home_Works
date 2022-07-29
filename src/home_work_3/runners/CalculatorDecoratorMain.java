package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        CalculatorWithCounterAutoDecorator counterAutoDecorator = null;
        if (iCalculator instanceof CalculatorWithCounterAutoDecorator) {
            counterAutoDecorator = (CalculatorWithCounterAutoDecorator) iCalculator;
        } else {
            return;
        }
        CalculatorWithMemoryDecorator memoryDecorator = null;

        if (counterAutoDecorator.getCalculator() instanceof CalculatorWithMemoryDecorator) {
            memoryDecorator = (CalculatorWithMemoryDecorator) counterAutoDecorator.getCalculator();
        } else {
            return;
        }

        double division = iCalculator.division(28, 5);
        double ex = iCalculator.exponentiation(division, 2);
        double mult = iCalculator.multiplication(15, 7);
        double adding = iCalculator.adding(4.1, ex);
        memoryDecorator.addMemory();
        double result = iCalculator.adding(mult, adding);

        System.out.println(result);
        System.out.println(counterAutoDecorator.getCountOperation());
        // другой вариант вызова метода
        // System.out.println(((CalculatorWithCounterAutoDecorator) iCalculator).getCountOperation());
        // при таком варианте не нужно создавать counterAutoDecorator
        System.out.println(memoryDecorator.getMemory());
        // другой вариант вызова метода
        // System.out.println(((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) iCalculator).getCalculator()).getMemory());
        // при таком варианте не нужно создавать memoryDecorator
    }


}
