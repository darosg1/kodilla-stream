package com.kodilla.stream.beautifier;

public class AdvancedDecorations {
    public static String decoration(String stringToDecor){
        return "ABC "+stringToDecor;
    }
    public static String decoration2(String stringToDecor) {
        return stringToDecor +" "+ decoration(stringToDecor);
    }
}
