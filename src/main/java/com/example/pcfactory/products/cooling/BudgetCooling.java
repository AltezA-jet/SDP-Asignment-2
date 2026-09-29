package com.example.pcfactory.products.cooling;

public class BudgetCooling implements Cooling {

    @Override
    public String getName() {
        return "Budget Cooling";
    }

    @Override
    public int getPowerConsumption() {
        return 30;
    }

    @Override
    public int getCoolingPerformance() {
        return 50;
    }

    @Override
    public int getMaxCpuPerformance() {
        return 60;
    }
}