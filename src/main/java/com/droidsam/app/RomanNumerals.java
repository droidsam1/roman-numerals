package com.droidsam.app;

public class RomanNumerals {
    public static String getRomanRepresentationFor(int i) {
        if(i == 1){
            return "I";
        }
        if(i == 2){
            return "II";
        }
        if(i == 3){
            return "III";
        }
        if(i == 4){
            return "IV";
        }

        return null;
    }
}
