package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckNumberEvenOrOddTest {
    @Test
    public void shouldTrueIsEvenNumber() {
        //given
        int value = 22;

        //when
        boolean isEven = CheckNumberEvenOrOdd.isEvenNumber(value);

        //then
        Assertions.assertTrue(isEven);
    }
    @Test
    public  void shouldFalseIsEvenNumber(){
        //given
        int value = 11;

        //when
        boolean isEven = CheckNumberEvenOrOdd.isEvenNumber(value);

        //then
        Assertions.assertFalse(isEven);
    }
    @Test
    public void shouldTrueIsOddNumber() {
        //given
        int value = 5;

        //when
        boolean isOdd = CheckNumberEvenOrOdd.isOddNumber(value);

        //then
        Assertions.assertTrue(isOdd);
    }
    @Test
    public  void shouldFalseIsOddNumber(){
        //given
        int value = 8;

        //when
        boolean isOdd = CheckNumberEvenOrOdd.isOddNumber(value);

        //then
        Assertions.assertFalse(isOdd);
    }
}
