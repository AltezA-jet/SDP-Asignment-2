package com.example.pcfactory.products.gpu;

public class ExtremeGPU implements GPU {

    @Override
    public String getName() {
        return "Extreme GPU";
    }

    @Override
    public int getPowerConsumption() {
        return 450;
    }

    @Override
    public int getPerformance() {
        return 100;
    }
}