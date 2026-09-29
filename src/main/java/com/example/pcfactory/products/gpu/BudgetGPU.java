package com.example.pcfactory.products.gpu;

public class BudgetGPU implements GPU {

    @Override
    public String getName() {
        return "Budget GPU";
    }

    @Override
    public int getPowerConsumption() {
        return 100;
    }

    @Override
    public int getPerformance() {
        return 50;
    }

    @Override
    public int getLengthMm() {
        return 220;
    }
}