package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues1and1() {
        //given
        int value1 = 1;
        int value2 = 1;

        //when
        int sum = Calculator.sum(value1, value2);

        //then
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubtractTwoValues5and4() {
        //given
        int value1 = 5;
        int value2 = 4;

        //when
        int sum = Calculator.subtraction(value1, value2);

        //then
        Assertions.assertEquals(1, sum);
    }

    @Test
    void shouldMultiplyTwoValues3and3() {
        //given
        int value1 = 3;
        int value2 = 3;

        //when
        int sum = Calculator.multiplication(value1, value2);

        //then
        Assertions.assertEquals(9, sum);
    }

    @Test
    void shouldDividedTwoValues10and2() {
        //given
        int value1 = 10;
        int value2 = 2;

        //when
        int sum = Calculator.division(value1, value2);

        //then
        Assertions.assertEquals(5, sum);
    }

    @Test
    void shouldDividedTwoValues5and0GetError() {
        //given
        int value1 = 5;
        int value2 = 0;

        //when
        int sum = Calculator.division(value1, value2);

        //then
        Assertions.assertEquals(0, sum);
    }
}
