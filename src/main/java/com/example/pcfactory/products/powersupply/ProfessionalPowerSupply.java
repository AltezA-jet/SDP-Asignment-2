package com.example.pcfactory.products.powersupply;

public class ProfessionalPowerSupply implements PowerSupply {

    @Override
    public String getName() {
        return "Professional 1000W Power Supply";
    }

    @Override
    public int getWattage() {
        return 1000;
    }

    @Override
    public int getPowerConsumption() {
        return 10;
    }
}