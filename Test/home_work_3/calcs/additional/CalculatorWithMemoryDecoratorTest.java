package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorWithMemoryDecoratorTest {

    private final CalculatorWithMemoryDecorator calculator = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());

    @Test
    public void adding() {
        Assertions.assertEquals(5, calculator.adding(2, 3));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(3, calculator.subtraction(7, 4));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals(8, calculator.multiplication(2, 4));
    }

    @Test
    public void division() {
        Assertions.assertEquals(3, calculator.division(9, 3));
    }

    @Test
    public void exponentiation() {
        Assertions.assertEquals(25, calculator.exponentiation(5, 2));
    }

    @Test
    public void numberModulus() {
        Assertions.assertEquals(4, calculator.numberModulus(-4));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals(3, calculator.squareRoot(9));
    }

    @Test
    public void testCalculator() {
        Assertions.assertEquals(140.45999999999998, calculator.adding(calculator.multiplication(15, 7), calculator.adding(4.1, calculator.exponentiation(calculator.division(28, 5), 2))));
    }
}