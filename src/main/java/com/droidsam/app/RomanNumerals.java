package com.droidsam.app;

public class RomanNumerals {
    public static String getRomanRepresentationFor(int arabicNumber) {
        StringBuilder romaRepresentation = new StringBuilder();

        if (arabicNumber == 4) {
            return "IV";
        }

        if (arabicNumber >= 5) {
            romaRepresentation.append("V");
            arabicNumber -= 5;
        }

        for (int i = 0; i < arabicNumber; i++) {
            romaRepresentation.append("I");
        }


        return romaRepresentation.toString();
    }
}
