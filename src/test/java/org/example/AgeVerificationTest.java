package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificationTest {
    @Test
    public void shouldAgeVerificationTrue() {
        //given
        int value = 22;

        //when
        boolean isVerification = AgeVerification.isVerification(value);

        //then
        Assertions.assertTrue(isVerification);
    }

    @Test
    public void shouldAgeVerificationFalse() {
        //given
        int value = 12;

        //when
        boolean isVerification = AgeVerification.isVerification(value);

        //then
        Assertions.assertFalse(isVerification);
    }

}
