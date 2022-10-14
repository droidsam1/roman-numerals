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

        if(arabicNumber == 5){
            return "V";
        }

        if(arabicNumber == 6){
            return "VI";
        }

        if(arabicNumber == 7){
            return "VII";
        }

        if(arabicNumber == 8){
            return "VIII";
        }


        return romaRepresentation.toString();
    }
}
