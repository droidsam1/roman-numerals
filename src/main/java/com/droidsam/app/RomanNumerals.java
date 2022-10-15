package com.droidsam.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    private static final Map<Integer, String> romanRepresentations = populateRomanRepresentations();

    private static Map<Integer, String> populateRomanRepresentations() {
        Map<Integer, String> romanRepresentations = new LinkedHashMap<>();
        romanRepresentations.put(100, "C");
        romanRepresentations.put(50, "L");
        romanRepresentations.put(40, "XL");
        romanRepresentations.put(10, "X");
        romanRepresentations.put(9, "IX");
        romanRepresentations.put(5, "V");
        romanRepresentations.put(4, "IV");
        romanRepresentations.put(1, "I");
        return romanRepresentations;
    }

    public static String getRomanRepresentationFor(int arabicNumber) {
        StringBuilder romaRepresentation = new StringBuilder();

        for (Map.Entry<Integer, String> representations : romanRepresentations.entrySet()) {
            while (arabicNumber >= representations.getKey()) {
                romaRepresentation.append(representations.getValue());
                arabicNumber -= representations.getKey();
            }
        }

        return romaRepresentation.toString();
    }
}
