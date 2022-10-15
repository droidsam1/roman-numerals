package com.droidsam.app;

import java.util.Map;

public class RomanNumerals {

    private static final Map<Integer, String> romanRepresentations = Map.of(1, "I", 4, "IV");

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

        if (arabicNumber >= 5) {
            romaRepresentation.append("V");
            arabicNumber -= 5;
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
