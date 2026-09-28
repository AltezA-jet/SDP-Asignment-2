package com.example.pcfactory.factorymethod;

public class BudgetComputerCreator extends ComputerCreator {

    @Override
    public Computer createComputer() {
        return new BudgetComputer();
    }
}