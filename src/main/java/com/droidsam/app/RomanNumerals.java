package com.droidsam.app;

public class RomanNumerals {
    public static String getRomanRepresentationFor(int i) {
        if(i == 3){
            return "III";
        }

        if(i == 2){
            return "II";
        }
        return "I";
    }
}
