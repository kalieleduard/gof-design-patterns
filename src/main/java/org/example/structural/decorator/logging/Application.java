package org.example.structural.decorator.logging;

public class Application {
    public static void main(String[] args) {
        final DataService loggingDataService = new DefaultDataServiceLogger(new DefaultDataService());
        System.out.println(loggingDataService.create());;
    }
}
