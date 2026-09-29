package com.example.pcfactory.products.powersupply;

public class ExtremePowerSupply implements PowerSupply {

    @Override
    public String getName() {
        return "Extreme 1300W Power Supply";
    }

    @Override
    public int getWattage() {
        return 1300;
    }

    @Override
    public int getPowerConsumption() {
        return 12;
    }
}