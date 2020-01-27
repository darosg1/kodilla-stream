package com.kodilla.stream.lambda;

public class Processor {
    //metoda execute(Executor executor) przyjmującą jako argument obiekt dowolnej klasy implemetującej interfejs Executor
    public void execute(Executor executor){
        executor.process();
    }
}
