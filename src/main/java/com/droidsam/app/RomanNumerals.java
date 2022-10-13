package com.droidsam.app;

public class RomanNumerals {
    public static String getRomanRepresentationFor(int arabicNumber) {
        StringBuilder romaRepresentation = new StringBuilder();
        for(int i = 0; i <arabicNumber; i++){
            romaRepresentation.append("I");
        }

        if(arabicNumber == 4){
            return "IV";
        }

        return romaRepresentation.toString();
    }
}
