package com.example.pcfactory.factorymethod;

public class BudgetComputer implements Computer {

    @Override
    public void build() {
        System.out.println("Building a budget computer");
    }
}