package com.example.pcfactory.products.cooling;

public class ExtremeCooling implements Cooling {

    @Override
    public String getName() {
        return "Extreme Cooling";
    }

    @Override
    public int getPowerConsumption() {
        return 100;
    }

    @Override
    public int getCoolingPerformance() {
        return 100;
    }

    @Override
    public int getMaxCpuPerformance() {
        return 120;
    }
}