package Exemples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        Assertions.assertEquals(5,calculator.add(2,3));
    }

    @Test void divideTest(){
        Assertions.assertEquals(2 , calculator.divide(4,2));
    }

    @Test void divideZeroTest(){
        Assertions.assertThrows(ArithmeticException.class , ()->calculator.divide(2,0));
    }

    @Test void maxTest(){
        Assertions.assertEquals(3,calculator.max(1,2,3));
        Assertions.assertEquals(3,calculator.max(2,1,3));
        Assertions.assertEquals(3,calculator.max(3,1,2));
        Assertions.assertEquals(3,calculator.max(3,2,1));
        Assertions.assertEquals(3,calculator.max(1,3,2));
        Assertions.assertEquals(3,calculator.max(2,3,1));
    }

    @Test void subtractTest(){
        Assertions.assertEquals(1 , calculator.subtract(2,1));
    }

    @Test void multiplyTest(){
        Assertions.assertEquals(9 , calculator.multiply(3,3));
    }
}
