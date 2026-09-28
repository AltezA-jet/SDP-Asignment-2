package com.example.pcfactory.products.cooling;

public class ProfessionalCooling implements Cooling {

    @Override
    public String getName() {
        return "Professional Cooling";
    }

    @Override
    public int getPowerConsumption() {
        return 80;
    }

    @Override
    public int getCoolingPerformance() {
        return 100;
    }
}