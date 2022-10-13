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
}
