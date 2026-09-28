package com.example.pcfactory.products.cooling;

public class GamingCooling implements Cooling {

    @Override
    public String getName() {
        return "Gaming Cooling";
    }

    @Override
    public int getPowerConsumption() {
        return 60;
    }

    @Override
    public int getCoolingPerformance() {
        return 90;
    }
}