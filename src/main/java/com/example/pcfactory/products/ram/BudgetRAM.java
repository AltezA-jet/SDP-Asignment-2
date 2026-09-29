package com.example.pcfactory.products.ram;


public class BudgetRAM implements RAM {

    @Override
    public String getName() {
        return "Budget RAM 16GB";
    }

    @Override
    public int getCapacityGb() {
        return 16;
    }

    @Override
    public String getMemoryType() {
        return "DDR4";
    }

    @Override
    public int getFrequencyMhz() {
        return 3200;
    }

    @Override
    public int getPowerConsumption() {
        return 8;
    }
}