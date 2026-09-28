package com.example.pcfactory.products.cpu;



public class ProfessionalCPU implements CPU {

    @Override
    public String getName() {
        return "Professional CPU";
    }

    @Override
    public int getPowerConsumption() {
        return 180;
    }

    @Override
    public int getPerformance() {
        return 100;
    }
}