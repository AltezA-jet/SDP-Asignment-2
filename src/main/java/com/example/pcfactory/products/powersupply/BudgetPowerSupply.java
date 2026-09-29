package com.example.pcfactory.products.powersupply;

public class BudgetPowerSupply implements PowerSupply {

    @Override
    public String getName() {
        return "Budget 500W Power Supply";
    }

    @Override
    public int getWattage() {
        return 500;
    }

    @Override
    public int getPowerConsumption() {
        return 5;
    }
}