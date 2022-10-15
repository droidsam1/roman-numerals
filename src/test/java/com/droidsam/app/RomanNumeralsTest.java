package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsTest {


    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX", "10, X", "11, XI", "13, XIII", "14, XIV", "15, XV", "19, XIX", "40,XL", "49,XLIX", "50, L,", "89, LXXXIX", "100, C", "300, CCC", "900, CM", "1000, M", "846, DCCCXLVI", "999, CMXCIX", "2008, MMVIII"})
    void shouldRepresentArabicNumberAsRoman(String arabicInput, String expectedRomanRepresentation) {
        Assertions.assertEquals(expectedRomanRepresentation, RomanNumerals.getRomanRepresentationFor(Integer.parseInt(arabicInput)));
    }
}
