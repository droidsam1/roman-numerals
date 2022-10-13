package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsShould {


    @Test
    public void representIWhenInputIsOne() {

        Assertions.assertEquals("I", RomanNumerals.getRomanRepresentationFor(1));

    }
}
