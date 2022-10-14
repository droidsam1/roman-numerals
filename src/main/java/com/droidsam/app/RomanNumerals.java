package com.droidsam.app;

public class RomanNumerals {
    public static String getRomanRepresentationFor(int arabicNumber) {
        StringBuilder romaRepresentation = new StringBuilder();

        if (arabicNumber >= 10) {
            romaRepresentation.append("X");
            arabicNumber -= 10;
        }

        if (arabicNumber == 9) {
            return "IX";
        }

        if (arabicNumber >= 5) {
            romaRepresentation.append("V");
            arabicNumber -= 5;
        }

        if (arabicNumber == 4) {
            romaRepresentation.append("IV");
            arabicNumber -= 4;
        }

        for (int i = 0; i < arabicNumber; i++) {
            romaRepresentation.append("I");
        }


        return romaRepresentation.toString();
    }
}
