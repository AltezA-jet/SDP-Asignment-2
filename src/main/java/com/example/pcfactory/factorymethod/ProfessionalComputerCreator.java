package com.example.pcfactory.factorymethod;

public class ProfessionalComputerCreator extends ComputerCreator {

    @Override
    public Computer createComputer() {
        return new ProfessionalComputer();
    }
}