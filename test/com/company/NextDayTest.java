package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void nextDay1() {
        String s = "01/01/2018";

        String expected = "02/01/2018";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }

    @Test
    void nextDay2() {
        String s = "31/01/2018";

        String expected = "01/02/2018";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }


    @Test
    void nextDay3() {
        String s = "30/04/2018";

        String expected = "01/05/2018";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }


    @Test
    void nextDay4() {
        String s = "28/02/2018";

        String expected = "01/03/2018";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }

    @Test
    void nextDay5() {
        String s = "29/02/2020";

        String expected = "01/03/2020";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }

    @Test
    void nextDay6() {
        String s = "31/12/2018";

        String expected = "01/01/2019";
        String result = Next.NextDay(s);
        assertEquals(expected, result);
    }
}