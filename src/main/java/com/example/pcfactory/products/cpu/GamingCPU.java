package com.example.pcfactory.products.cpu;


public class GamingCPU implements CPU {

    @Override
    public String getName() {
        return "Gaming CPU";
    }

    @Override
    public int getPowerConsumption() {
        return 125;
    }

    @Override
    public int getPerformance() {
        return 90;
    }
}