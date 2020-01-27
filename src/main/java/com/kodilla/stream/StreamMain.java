package com.kodilla.stream;

import com.kodilla.steam.reference.FunctionalCalculator;
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
    }
}
