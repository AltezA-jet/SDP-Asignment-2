package com.example.pcfactory.products.cpu;


public class BudgetCPU implements CPU {

    @Override
    public String getName() {
        return "Budget CPU";
    }

    @Override
    public int getPowerConsumption() {
        return 65;
    }

    @Override
    public int getPerformance() {
        return 50;
    }

    @Override
    public String getSocket() {
        return "AM4";
    }
}