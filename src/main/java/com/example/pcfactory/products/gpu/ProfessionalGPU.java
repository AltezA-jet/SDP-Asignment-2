package com.example.pcfactory.products.gpu;

public class ProfessionalGPU implements GPU {

    @Override
    public String getName() {
        return "Professional GPU";
    }

    @Override
    public int getPowerConsumption() {
        return 350;
    }

    @Override
    public int getPerformance() {
        return 100;
    }
}