package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificationIsAdultAgeTest {
    @Test
    public void mustBeOfAgeTrue() {
        //given
        int value = 22;

        //when
        boolean isOfAge = VerificationIsAdultAge.isOfAge(value);

        //then
        Assertions.assertTrue(isOfAge);
    }

    @Test
    public void mustBeOfAgeFalse() {
        //given
        int value = 12;

        //when
        boolean isOfAge = VerificationIsAdultAge.isOfAge(value);

        //then
        Assertions.assertFalse(isOfAge);
    }

}
