package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoNumbers() {
        //given
        int value1 = 1;
        int value2 = 1;

        //when
        int sum = Calculator.add(value1, value2);

        //then
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        int value1 = 5;
        int value2 = 4;

        //when
        int subtract = Calculator.subtract(value1, value2);

        //then
        Assertions.assertEquals(1, subtract);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        int value1 = 3;
        int value2 = 3;

        //when
        int multiply = Calculator.multiply(value1, value2);

        //then
        Assertions.assertEquals(9, multiply);
    }

    @Test
    void shouldDividedTwoNumbers() {
        //given
        int value1 = 10;
        int value2 = 2;

        //when
        int divide = Calculator.divide(value1, value2);

        //then
        Assertions.assertEquals(5, divide);
    }

}
