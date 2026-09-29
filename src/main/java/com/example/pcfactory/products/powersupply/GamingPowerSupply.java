package com.example.pcfactory.products.powersupply;

public class GamingPowerSupply implements PowerSupply {

    @Override
    public String getName() {
        return "Gaming 750W Power Supply";
    }

    @Override
    public int getWattage() {
        return 750;
    }

    @Override
    public int getPowerConsumption() {
        return 8;
    }
}