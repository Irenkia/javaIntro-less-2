package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekdaysTest {
    @Test
    public void shouldWeekdaysIsMonday() {
        //given
        int value = 1;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("Monday", result);
    }

    @Test
    public void shouldWeekdaysIsTuesday() {
        //given
        int value = 2;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("Tuesday", result);
    }

    @Test
    public void shouldWeekdaysIsWednesday() {
        //given
        int value = 3;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("Wednesday", result);
    }

    @Test
    public void shouldWeekdaysIsThursday() {
        //given
        int value = 4;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("Thursday", result);
    }

    @Test
    public void shouldWeekdaysIsFriday() {
        //given
        int value = 5;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("Friday", result);
    }

    @Test
    public void shouldWeekdaysIsWeekends() {
        //given
        int value1 = 6;
        int value2 = 7;

        //when
        String result1 = Weekdays.days(value1);
        String result2 = Weekdays.days(value2);

        //then
        Assertions.assertEquals("Weekend", result1);
        Assertions.assertEquals("Weekend", result2);
    }

    @Test
    public void shouldWeekdaysIsHaveError() {
        //given
        int value = 22;

        //when
        String result = Weekdays.days(value);

        //then
        Assertions.assertEquals("There is no such a day!", result);
    }
}
