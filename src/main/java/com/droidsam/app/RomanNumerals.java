package com.droidsam.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    private static final Map<Integer, String> romanRepresentations = populateRomanRepresentations();

    private static Map<Integer, String> populateRomanRepresentations() {
        Map<Integer, String> romanRepresentations = new LinkedHashMap<>();
        romanRepresentations.put(5, "V");
        romanRepresentations.put(4, "IV");
        romanRepresentations.put(1, "I");
        return romanRepresentations;
    }

    public static String getRomanRepresentationFor(int arabicNumber) {
        StringBuilder romaRepresentation = new StringBuilder();

        while (arabicNumber >= 100) {
            romaRepresentation.append("C");
            arabicNumber -= 100;
        }

        if (arabicNumber >= 50) {
            romaRepresentation.append("L");
            arabicNumber -= 50;
        }

        if (arabicNumber >= 40) {
            romaRepresentation.append("XL");
            arabicNumber -= 40;
        }

        while (arabicNumber >= 10) {
            romaRepresentation.append("X");
            arabicNumber -= 10;
        }

        if (arabicNumber == 9) {
            romaRepresentation.append("IX");
            arabicNumber -= 9;
        }


        for (Map.Entry<Integer, String> representations : romanRepresentations.entrySet()) {
            while (arabicNumber >= representations.getKey()) {
                romaRepresentation.append(representations.getValue());
                arabicNumber -= representations.getKey();
            }
        }


        return romaRepresentation.toString();
    }
}
