package com.kodilla.stream;

import com.kodilla.steam.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.AdvancedDecorations;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;


public class StreamMain {
    public static void main(String []args){
        Processor processor = new Processor();
        processor.execute(()-> System.out.println("This is an example text"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b)->a+b);
        expressionExecutor.executeExpression(10, 5, (a,b)->a-b);
        expressionExecutor.executeExpression(10,5, (a,b)->a*b);
        expressionExecutor.executeExpression(10,5, (a,b)->a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAFromB);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello world", stringToDecor-> stringToDecor.toUpperCase()+", "+stringToDecor);
        poemBeautifier.beautify("Hello world 2", stringToDecor-> stringToDecor.toLowerCase());
        poemBeautifier.beautify("Hello world 3", stringToDecor-> stringToDecor.substring(6,13));
        poemBeautifier.beautify("Hello world 4", stringToDecor -> AdvancedDecorations.decoration(stringToDecor));
        poemBeautifier.beautify("Hello world 5", stringToDecor -> AdvancedDecorations.decoration2(stringToDecor));

    }
}
