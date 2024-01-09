package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingNumberTest {
    @Test
    public void shouldCheckingNumberTrue() {
        //given
        int value = 22;

        //when
        boolean isCheckingNumber = CheckingNumber.isNumberEven(value);

        //then
        Assertions.assertTrue(isCheckingNumber);
    }

    @Test
    public void shouldCheckingNumberFalse() {
        //given
        int value = 11;

        //when
        boolean isCheckingNumber = CheckingNumber.isNumberEven(value);

        //then
        Assertions.assertFalse(isCheckingNumber);
    }
}
