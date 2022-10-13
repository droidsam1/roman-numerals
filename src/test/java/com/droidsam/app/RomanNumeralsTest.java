package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {


    @Test
    public void shouldRepresentOneAsI() {
        Assertions.assertEquals("I", RomanNumerals.getRomanRepresentationFor(1));
    }

    @Test
    public void shouldRepresentTwoAsII() {
        Assertions.assertEquals("II", RomanNumerals.getRomanRepresentationFor(2));
    }

    @Test
    public void shouldRepresentThreeAsIII() {
        Assertions.assertEquals("III", RomanNumerals.getRomanRepresentationFor(3));
    }

    @Test
    public void shouldRepresentFourAsIV() {
        Assertions.assertEquals("IV", RomanNumerals.getRomanRepresentationFor(4));
    }

    @Test
    public void shouldRepresentFiveAsV() {
        Assertions.assertEquals("V", RomanNumerals.getRomanRepresentationFor(5));
    }
}
