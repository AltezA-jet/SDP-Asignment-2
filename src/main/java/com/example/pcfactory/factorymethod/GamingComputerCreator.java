package com.example.pcfactory.factorymethod;

public class GamingComputerCreator extends ComputerCreator {

    @Override
    public Computer createComputer() {
        return new GamingComputer();
    }
}