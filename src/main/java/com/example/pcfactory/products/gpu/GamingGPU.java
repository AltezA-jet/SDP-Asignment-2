package com.example.pcfactory.products.gpu;

public class GamingGPU implements GPU {

    @Override
    public String getName() {
        return "Gaming GPU";
    }

    @Override
    public int getPowerConsumption() {
        return 250;
    }

    @Override
    public int getPerformance() {
        return 90;
    }

    @Override
    public int getLengthMm() {
        return 320;
    }

}