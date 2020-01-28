package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String stringToDecor, PoemDecorator poemDecorator) {
       String result = poemDecorator.decorate(stringToDecor);
       System.out.println("Text to decoration: "+result);
    }
}
