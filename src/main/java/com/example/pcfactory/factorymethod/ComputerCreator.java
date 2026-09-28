package com.example.pcfactory.factorymethod;

public abstract class ComputerCreator {

    public abstract Computer createComputer();

    public void prepareComputer() {
        Computer computer = createComputer();

        System.out.println("Preparing computer...");
        computer.build();
        System.out.println("Computer is ready.");
    }
}