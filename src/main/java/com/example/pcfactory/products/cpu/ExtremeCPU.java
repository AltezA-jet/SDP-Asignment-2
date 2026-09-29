package com.example.pcfactory.products.cpu;

public class ExtremeCPU implements CPU {

    @Override
    public String getName() {
        return "Extreme CPU";
    }

    @Override
    public int getPowerConsumption() {
        return 250;
    }

    @Override
    public int getPerformance() {
        return 100;
    }
    
    @Override
    public String getSocket() {
        return "AM5";
    }
}